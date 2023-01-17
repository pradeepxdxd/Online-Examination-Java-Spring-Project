package spring.project.formatter;

import org.springframework.stereotype.Component;

@Component
public class NameFormatter {

	public String nameFormat(String name) {
		String firstLetter = String.valueOf(name.charAt(0)).toUpperCase();
		return firstLetter + name.substring(1);
	}
	
}
