package spring.project.controller.mailDao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Component;

@Component
public class EmailDao {
	
	@Autowired
	private JavaMailSender javaMailSender;
	
	public void sendMail(String name, String email, String otp) {
		
		SimpleMailMessage mail = new SimpleMailMessage();
		
		mail.setTo(email);
		mail.setSubject("Hii " + name);
		mail.setText("Here is your otp " + otp);
		
		this.javaMailSender.send(mail);
		
	}
}
