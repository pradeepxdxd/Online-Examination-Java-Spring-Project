package spring.project.controller.mailDao;

import java.util.Random;

import org.springframework.stereotype.Component;

@Component
public class RandomOTPDGenerator {
	
	private Random rand = new Random();

	public String generator() {
		
		String a = String.valueOf(rand.nextInt(10));
		String b = String.valueOf(rand.nextInt(10));
		String c = String.valueOf(rand.nextInt(10));
		String d = String.valueOf(rand.nextInt(10));

		String otp = (a + b + c + d);
		
		return otp;
		
	}
}
