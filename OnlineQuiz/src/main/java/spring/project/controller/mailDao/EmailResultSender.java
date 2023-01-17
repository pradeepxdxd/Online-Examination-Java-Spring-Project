package spring.project.controller.mailDao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Component;

@Component
public class EmailResultSender {
	
	@Autowired
	private JavaMailSender javaMailSender;

	public void resultSend(String name, String email, int marks) {
		
		SimpleMailMessage mail = new SimpleMailMessage();
		mail.setTo(email);
		mail.setSubject("Result Of Java Quiz!");
		
		if(marks >= 70) {
			mail.setText("Hii " + name + " Congratulations! You scored " + marks + ". You are eligible for the next round");
		}
		else if(marks < 70 && marks >= 50) {
			mail.setText("Hii " + name + " You scored " + marks + ". You are eligible for the next round");
		}
		else if(marks < 50 && marks > 30) {
			mail.setText("Hii " + name + " You scored " + marks + ". Try hard next time" + ". You are eligible for the next round");
		}
		else if(marks <= 30) {
			mail.setText("Hii " + name + " You Scored " + marks + " You Are Fail" + ". You are eligible for the next round");
		}
		
		javaMailSender.send(mail);
		
	}

}
