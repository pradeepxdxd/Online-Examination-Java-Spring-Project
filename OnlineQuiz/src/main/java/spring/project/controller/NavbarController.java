package spring.project.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import spring.project.controller.mailDao.ContactEmailReplyDao;
import spring.project.formatter.NameFormatter;
import spring.project.model.Contact;

@Controller
public class NavbarController {
	
	@Autowired
	private ContactEmailReplyDao contactEmailReplyDao;
	
	@Autowired
	private NameFormatter nameFormatter;

	@RequestMapping("login")
	public String login() {
		return "login";
	}
	
	@RequestMapping("register")
	public String register() {
		return "register";
	}
	
	@RequestMapping("/javaTest")
	public String javaTest() {
		return "javaTest";
	}
	
	@RequestMapping("contact")
	public String contact() {
		return "contact";
	}
	
	@RequestMapping("/contactHandler")
	public String contactHandler(@ModelAttribute("cont") Contact contact) {
		String email = contact.getEmail();
		String name = contact.getFname();
		String cName = this.nameFormatter.nameFormat(name);
		
		System.out.println(cName + " -> " + email);

		this.contactEmailReplyDao.contactMailReplyer(cName, email);
		
		return "contact";
	}
	
}
