public class Student extends Question{
	
	private String studentID,studentName;
	
	private String mutipleChoiceStudentAnswer1,mutipleChoiceStudentAnswer2;
	private String mutipleChoiceCorrectAnswer1,mutipleChoiceCorrectAnswer2;
	
	private boolean trueFalseStudentAnswer1,trueFalseStudentAnswer2;
	private boolean trueFalseCorrectAnswer1,trueFalseCorrectAnswer2;
	
	
	
	
	public Student(String studentID,String studentName,String mutipleChoiceStudentAnswer1,
			String mutipleChoiceStudentAnswer2,String mutipleChoiceCorrectAnswer1,
			String mutipleChoiceCorrectAnswer2) {
		
		
		super(mutipleChoiceStudentAnswer1,mutipleChoiceStudentAnswer2,
				mutipleChoiceCorrectAnswer1,mutipleChoiceCorrectAnswer2);
		
		this.studentID=studentID;
		this.studentName=studentName;
		
	}
	
	
	public Student(String studentID,String studentName,boolean trueFalseStudentAnswer1,
			boolean trueFalseStudentAnswer2,boolean trueFalseCorrectAnswer1,
			boolean trueFalseCorrectAnswer2) {
		
		
		super(trueFalseStudentAnswer1,trueFalseStudentAnswer2,
				trueFalseCorrectAnswer1,trueFalseCorrectAnswer2);
		
		this.studentID=studentID;
		this.studentName=studentName;
		
	}
	
	
	public String getStudentID() {
		return studentID;
	}
	public String getStudentName() {
		return studentName;
	}
	
}