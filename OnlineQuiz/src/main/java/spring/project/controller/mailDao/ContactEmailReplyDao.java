package spring.project.controller.mailDao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Component;

@Component
public class ContactEmailReplyDao {
	
	@Autowired
	private JavaMailSender javaMailSender;
	
	public void contactMailReplyer(String name, String email) {
		
		SimpleMailMessage mail = new SimpleMailMessage();
		
		mail.setTo(email);
		mail.setSubject("Thanks for contacting us");
		mail.setText("Hii " + name + " we have received your message, and we forward your request to the managing team.");
		
		this.javaMailSender.send(mail);
	}
}
