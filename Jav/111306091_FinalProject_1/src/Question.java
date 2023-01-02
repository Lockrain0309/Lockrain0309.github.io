public class Question{
	
	
	
	private String mutipleChoiceStudentAnswer1,mutipleChoiceStudentAnswer2;
	private String mutipleChoiceCorrectAnswer1,mutipleChoiceCorrectAnswer2;
	
	private boolean trueFalseStudentAnswer1,trueFalseStudentAnswer2;
	private boolean trueFalseCorrectAnswer1,trueFalseCorrectAnswer2;
	
	private int mutipleChoiceCorrectNumber,mutipleChoiceWrongNumber;
	
	private int trueFalseCorrectNumber,trueFalseWrongNumber;
	
	public Question(String mutipleChoiceStudentAnswer1,String mutipleChoiceStudentAnswer2,
			String mutipleChoiceCorrectAnswer1,String mutipleChoiceCorrectAnswer2){
		
		this.mutipleChoiceStudentAnswer1=mutipleChoiceStudentAnswer1;
		this.mutipleChoiceStudentAnswer2=mutipleChoiceStudentAnswer2;
		this.mutipleChoiceCorrectAnswer1=mutipleChoiceCorrectAnswer1;
		this.mutipleChoiceCorrectAnswer2=mutipleChoiceCorrectAnswer2;
		
	}
	
	public Question(boolean trueFalseStudentAnswer1,boolean trueFalseStudentAnswer2,
			boolean trueFalseCorrectAnswer1,boolean trueFalseCorrectAnswer2) {
		
		this.trueFalseStudentAnswer1=trueFalseStudentAnswer1;
		this.trueFalseStudentAnswer2=trueFalseStudentAnswer2;
		this.trueFalseCorrectAnswer1=trueFalseCorrectAnswer1;
		this.trueFalseCorrectAnswer2=trueFalseCorrectAnswer2;
		
	}
	
	public String getMutipleChoiceStudentAnswer1() {
		return mutipleChoiceStudentAnswer1;
	}
	public String getMutipleChoiceStudentAnswer2() {
		return mutipleChoiceStudentAnswer2;
	}
	public String getMutipleChoiceCorrectAnswer1() {
		return mutipleChoiceCorrectAnswer1;
	}
	public String getMutipleChoiceCorrectAnswer2() {
		return mutipleChoiceCorrectAnswer2;
	}
	public int getMutipleChoiceCorrectNumber() {
		return mutipleChoiceCorrectNumber;
	}
	public int getMutipleChoiceWrongNumber() {
		return mutipleChoiceWrongNumber;
	}
	public void setMutipleChoiceCorrectNumber(int mutipleChoiceCorrectNumber) {
		this.mutipleChoiceCorrectNumber=mutipleChoiceCorrectNumber;
	}
	public void setMutipleChoiceWrongNumber(int mutipleChoiceWrongNumber) {
		this.mutipleChoiceWrongNumber=mutipleChoiceWrongNumber;
	}
	
	
	public boolean getTrueFalseStudentAnswer1() {
		return trueFalseStudentAnswer1;
	}
	public boolean getTrueFalseStudentAnswer2() {
		return trueFalseStudentAnswer2;
	}
	public boolean getTrueFalseCorrectAnswer1() {
		return trueFalseCorrectAnswer1;
	}
	public boolean getTrueFalseCorrectAnswer2() {
		return trueFalseCorrectAnswer2;
	}
	public int getTrueFalseCorrectNumber() {
		return trueFalseCorrectNumber;
	}
	public int getTrueFalseWrongNumber() {
		return trueFalseWrongNumber;
	}
	public void setTrueFalseCorrectNumber(int trueFalseCorrectNumber) {
		this.trueFalseCorrectNumber=trueFalseCorrectNumber;
	}
	public void setTrueFalseWrongNumber(int trueFalseWrongNumber) {
		this.trueFalseWrongNumber=trueFalseWrongNumber;
	}
	
	
	public void checkMutipleChoiceAnswer() {
		if (mutipleChoiceStudentAnswer1.equals(mutipleChoiceCorrectAnswer1)) {
			mutipleChoiceCorrectNumber++;
		}
		else {
			mutipleChoiceWrongNumber++;
		}
		
		if (mutipleChoiceStudentAnswer2.equals(mutipleChoiceCorrectAnswer2)) {
			mutipleChoiceCorrectNumber++;
		}
		else {
			mutipleChoiceWrongNumber++;
		}
		
		System.out.println("Correct:"+mutipleChoiceCorrectNumber+
				" Wrong:"+mutipleChoiceWrongNumber);
		
		
	}
	
	public void checkTrueFalseAnswer() {
		
		if (trueFalseStudentAnswer1==trueFalseCorrectAnswer1) {
			trueFalseCorrectNumber++;
		}
		else {
			trueFalseWrongNumber++;
		}
		
		if (trueFalseStudentAnswer2==trueFalseCorrectAnswer2) {
			trueFalseCorrectNumber++;
		}
		else {
			trueFalseWrongNumber++;
		}
		
		System.out.println("Correct:"+trueFalseCorrectNumber+" Wrong:"+trueFalseWrongNumber);
		
	}
	
	
	
	
	
	
	
	
	
	
}