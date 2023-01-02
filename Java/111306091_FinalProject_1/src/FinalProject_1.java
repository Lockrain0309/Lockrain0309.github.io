
public class FinalProject_1{
	
	
	public static void main(String[] agrs) {
		
		Student mutipleChoice1=new Student("111306091","Leona","A","B","A","C");
		Student mutipleChoice2=new Student("111306092","Melody","A","B","A","B");
		Student mutipleChoice3=new Student("111306093","Zoey","A","C","C","C");
		
		Student trueFalse1=new Student("111306091","Leona",true,false,false,false);
		Student trueFalse2=new Student("111306092","Melody",false,true,false,true);
		Student trueFalse3=new Student("111306093","Zoey",true,true,false,false);
		Student[]mcList = new Student[3];
		mcList[0]= mutipleChoice1;
		mcList[1]= mutipleChoice2;
		mcList[2]= mutipleChoice3;
		Student[]tfList = new Student[3];
		tfList[0]= trueFalse1;
		tfList[1]= trueFalse2;
		tfList[2]= trueFalse3;

		for(int i = 0;i < 3;i++){
			System.out.println(mcList[i].getStudentID()+" "+mcList[i].getStudentName());
			System.out.println("Mutiple Choice:");
			mcList[i].checkMutipleChoiceAnswer();
			System.out.println("True False:");
			tfList[i].checkTrueFalseAnswer();
			System.out.println("-".repeat(40));
		}	
	}
	
}