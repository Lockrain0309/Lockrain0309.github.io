import java.util.jar.Attributes.Name;

public class Question{
	private int id;
	private String name;
	private String studentAns1;
	private String studentAns2;
	private String corrAns1;
	private String corrAns2;
	private int corrNum;
	private int wrongNum;
	
	public Question(int id,String name,String corrAns1,String corrAns2){
		this.id = id;
		this.name = name;
		this.corrAns1 = corrAns1;
		this.corrAns2 = corrAns2;
	}

	public String getCorrAns1(){
		return this.corrAns1;
	}

	public String getCorrAns2(){
		return this.corrAns2;
	}
	
	public void setCorrNum(int num){
		this.corrNum = num;
	}

	public void setWrongNum(int num){
		this.wrongNum = num;
	}

	public String getInfo(){
		return String.format("Correct: %d Wrong: %d", corrNum,wrongNum);
	}
	
	
	