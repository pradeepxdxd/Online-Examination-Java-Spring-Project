package spring.project.answers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Component;

import spring.project.model.QuizQuestion;

@Component
public class AllAnswers {

	public List<String> getAllAnswers(){
		List<String> answers = Arrays.asList("Yes", "String", "lenght()", 
				"Compilation", "Abstraction", "Both Primitive & Objects type values", 
				"Represent a group of objects as key-value pairs", "Thread implements Runnable",
				"5", "Divide and conquer");
		return answers;
	}

	public List<String> getQuizAnswer(QuizQuestion quizQuestion) {
		List<String> answers = new ArrayList<String>();
		
		answers.add(quizQuestion.getQ1());
		answers.add(quizQuestion.getQ2());
		answers.add(quizQuestion.getQ3());
		answers.add(quizQuestion.getQ4());
		answers.add(quizQuestion.getQ5());
		answers.add(quizQuestion.getQ6());
		answers.add(quizQuestion.getQ7());
		answers.add(quizQuestion.getQ8());
		answers.add(quizQuestion.getQ9());
		answers.add(quizQuestion.getQ10());
		
		return answers;
	}
	
}
