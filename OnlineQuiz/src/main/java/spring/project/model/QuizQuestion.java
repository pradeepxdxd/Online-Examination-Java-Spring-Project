package spring.project.model;

public class QuizQuestion {
	
	private String q1 = "0";
	private String q2 = "0";
	private String q3 = "0";
	private String q4 = "0";
	private String q5 = "0";
	private String q6 = "0";
	private String q7 = "0";
	private String q8 = "0";
	private String q9 = "0";
	private String q10 = "0";
	
	public QuizQuestion() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public QuizQuestion(String q1, String q2, String q3, String q4, String q5, String q6, String q7, String q8,
			String q9, String q10) {
		super();
		this.q1 = q1;
		this.q2 = q2;
		this.q3 = q3;
		this.q4 = q4;
		this.q5 = q5;
		this.q6 = q6;
		this.q7 = q7;
		this.q8 = q8;
		this.q9 = q9;
		this.q10 = q10;
	}

	public String getQ1() {
		return q1;
	}
	public void setQ1(String q1) {
		this.q1 = q1;
	}
	public String getQ2() {
		return q2;
	}
	public void setQ2(String q2) {
		this.q2 = q2;
	}
	public String getQ3() {
		return q3;
	}
	public void setQ3(String q3) {
		this.q3 = q3;
	}
	public String getQ4() {
		return q4;
	}
	public void setQ4(String q4) {
		this.q4 = q4;
	}
	public String getQ5() {
		return q5;
	}
	public void setQ5(String q5) {
		this.q5 = q5;
	}
	public String getQ6() {
		return q6;
	}
	public void setQ6(String q6) {
		this.q6 = q6;
	}
	public String getQ7() {
		return q7;
	}
	public void setQ7(String q7) {
		this.q7 = q7;
	}
	public String getQ8() {
		return q8;
	}
	public void setQ8(String q8) {
		this.q8 = q8;
	}
	public String getQ9() {
		return q9;
	}
	public void setQ9(String q9) {
		this.q9 = q9;
	}
	public String getQ10() {
		return q10;
	}
	public void setQ10(String q10) {
		this.q10 = q10;
	}

	@Override
	public String toString() {
		return "QuizQuestion [q1=" + q1 + ", q2=" + q2 + ", q3=" + q3 + ", q4=" + q4 + ", q5=" + q5 + ", q6=" + q6
				+ ", q7=" + q7 + ", q8=" + q8 + ", q9=" + q9 + ", q10=" + q10 + "]";
	}
	
}
