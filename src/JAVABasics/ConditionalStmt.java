package JAVABasics;

public class ConditionalStmt {
	static String grade;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int marks = 75;
		
		if(marks >=80 && marks <=100) 
		{
			grade ="A";
		}
		else if(marks >=50 && marks<80)
		{
			grade ="B";
		}
		else if(marks >=40 && marks<50)
		{
			grade ="C";
		}
		else
		{
			grade ="D";
		}
		System.out.println(" Grade for " + marks + " marks is " + grade);
	}

}
