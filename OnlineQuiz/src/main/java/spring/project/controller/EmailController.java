package spring.project.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;

import spring.project.answers.AllAnswers;
import spring.project.controller.dao.MarksDaoImpl;
import spring.project.controller.dao.UserDaoImpl;
import spring.project.controller.mailDao.EmailDao;
import spring.project.controller.mailDao.EmailResultSender;
import spring.project.controller.mailDao.RandomOTPDGenerator;
import spring.project.model.DataOfMarks;
import spring.project.model.QuizQuestion;
import spring.project.model.User;
import spring.project.model.UserLog;
import spring.project.model.VerifyCode;
import spring.project.sort.SortMarksData;

@Controller
@SessionAttributes(names = {"name", "email", "password", "otp", "marks"})
public class EmailController {
	
	@Autowired
	private RandomOTPDGenerator generator;
	
	@Autowired
	private EmailDao emailDao;
	
	@Autowired
	private UserDaoImpl daoImpl;
	
	@Autowired
	private AllAnswers answers;
	
	@Autowired
	private MarksDaoImpl marksDaoImpl;
	
	@Autowired
	private SortMarksData sortMarksData;
	
	@Autowired
	private EmailResultSender emailResultSender;
	
	@RequestMapping("/home")
	public String home(Model model) {
		List<DataOfMarks> list = this.marksDaoImpl.getAllMarks();
		List<DataOfMarks> marks = this.sortMarksData.sort(list);
		model.addAttribute("marks", marks);
		return "home";
	}

	@RequestMapping(value = "/registerFormHandler", method = RequestMethod.POST)
	public String registerFormHandler(@ModelAttribute("user") User user, Model model) {
		
		List<User> listOfUser = this.daoImpl.getAllUser();
		
		for(User u : listOfUser) {
			if(user.getEmail().equals(u.getEmail())) {
				return "home";
			}
		}
		
		String otp = this.generator.generator();
		String name = user.getName();
		String email = user.getEmail();
		String password = user.getPassword();
		
		model.addAttribute("name", name);
		model.addAttribute("email", email);
		model.addAttribute("password", password);
		model.addAttribute("otp", otp);
		
		System.out.println(name + " " + email + " " + password + " " + otp);
		
		this.emailDao.sendMail(name, email, otp);
		 
		return "verifyPage";
	}
	
	@RequestMapping("/verifyCode")
	public String verifyCode(@ModelAttribute("code") VerifyCode verifyCode, Model model) {
		
		String otp = (String) model.getAttribute("otp");
		String name = (String) model.getAttribute("name");
		String email = (String) model.getAttribute("email");
		String password = (String) model.getAttribute("password");
		
		User user = new User();
		user.setEmail(email);
		user.setName(name);
		user.setPassword(password);
		
		if(otp.equals(verifyCode.getCode())) {
			this.daoImpl.insert(user);
		}
		else {
			return "home";
		}
		
		return "registerSuccess";
	}
	
	@RequestMapping(value = "/loginFormHandler", method = RequestMethod.POST)
	public String loginFormHandler(@ModelAttribute("userlog") UserLog userLog, Model model) {
		List<User> listOfUser = this.daoImpl.getAllUser();
		
		String email = userLog.getEmail();
		String pass = userLog.getPass();
		
		model.addAttribute("email", email);  // for Quiz
		
		System.out.println(email + " " + pass);
		
		System.out.println(listOfUser);

		for (User user : listOfUser) {
			if(email.equals(user.getEmail()) && pass.equals(user.getPassword())) {
				System.out.println("inside database " + user.getEmail() + " " + user.getPassword() + " " + user.getName());
				model.addAttribute("name", user.getName());
				int marks = this.marksDaoImpl.getMarks(user.getName());
				model.addAttribute("marks", marks);
				return "loginSuccessful";
			}
		}
		
		return "home";
	}
	
	@RequestMapping("/loginSuccessful")
	public String loginSuccessful(Model model) {
		String name = (String) model.getAttribute("name");
		int marks = this.marksDaoImpl.getMarks(name);
		model.addAttribute("marks", marks);
		return "loginSuccessful";
	}
	
	@RequestMapping("/quizAnswerHandler")
	public String result(@ModelAttribute("quizHandler") QuizQuestion quizQuestion, Model model, SessionStatus session) {
		int marks = 100;
		
		List<String> listOfAnswers = this.answers.getAllAnswers();
		List<String> listOfQuizAns = this.answers.getQuizAnswer(quizQuestion);
		
		for(int i = 0; i < 10; i++) {
			if(!listOfAnswers.get(i).equals(listOfQuizAns.get(i))) {
				marks -= 10;
			}
		}
		
		String name = (String)model.getAttribute("name");
		
		String email = (String)model.getAttribute("email");
		
		List<DataOfMarks> listOfMarks = this.marksDaoImpl.getAllMarks();
		
		System.out.println(name + " " + email);
		
		for(DataOfMarks data : listOfMarks) {
			if(data.getName().equals(name)) {
				int id = data.getId();
				DataOfMarks dataOfMarks = new DataOfMarks();
				dataOfMarks.setId(id);
				dataOfMarks.setName(name);
				dataOfMarks.setMarks(marks);
				this.marksDaoImpl.insertMarks(dataOfMarks);
				this.emailResultSender.resultSend(name, email, marks);
				return "resultOfJavaQuiz";
			}
		}
		
		this.emailResultSender.resultSend(name, email, marks);
		
		DataOfMarks dataOfMarks = new DataOfMarks();
		
		dataOfMarks.setName(name);
		dataOfMarks.setMarks(marks);
		
		this.marksDaoImpl.insertMarks(dataOfMarks);
		
//		session.setComplete(); // for closing the SessionAttribute
		
		return "resultOfJavaQuiz";
	}

	@RequestMapping("/leaderboard")
	public String leaderboard(Model model) {
		List<DataOfMarks> list = this.marksDaoImpl.getAllMarks();
		List<DataOfMarks> sort = this.sortMarksData.sort(list);
		model.addAttribute("list", sort);
		return "leaderboard";
	}
	
}