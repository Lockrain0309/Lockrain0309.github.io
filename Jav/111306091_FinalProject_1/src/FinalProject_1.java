public class FinalProject_1{
	
	
	public static void main(String[] agrs) {
		
		Student mutipleChoice1=new Student("111306091","Leona","A","B","A","C");
		Student mutipleChoice2=new Student("111306092","Melody","A","B","A","B");
		Student mutipleChoice3=new Student("111306093","Zoey","A","C","C","C");
		
		Student trueFalse1=new Student("111306091","Leona",true,false,false,false);
		Student trueFalse2=new Student("111306092","Melody",false,true,false,true);
		Student trueFalse3=new Student("111306093","Zoey",true,true,false,false);
		
		System.out.println(mutipleChoice1.getStudentID()+" "+mutipleChoice1.getStudentName());
		System.out.println("Mutiple Choice:");
		mutipleChoice1.checkMutipleChoiceAnswer();
		System.out.println("True False:");
		trueFalse1.checkTrueFalseAnswer();
		System.out.println("-".repeat(40));
		
		System.out.println(mutipleChoice2.getStudentID()+" "+mutipleChoice2.getStudentName());
		System.out.println("Mutiple Choice:");
		mutipleChoice2.checkMutipleChoiceAnswer();
		System.out.println("True False:");
		trueFalse2.checkTrueFalseAnswer();
		System.out.println("-".repeat(40));
		
		System.out.println(mutipleChoice3.getStudentID()+" "+mutipleChoice3.getStudentName());
		System.out.println("Mutiple Choice:");
		mutipleChoice3.checkMutipleChoiceAnswer();
		System.out.println("True False:");
		trueFalse3.checkTrueFalseAnswer();
		System.out.println("-".repeat(40));
		
		
		
		
		
		
		
		
	}
	
}