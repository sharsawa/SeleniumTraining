package JAVABasics;

public class MethodExample { //inside class we can define methods and variables

	static String grade,sName;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			String a ="Hello, Welcome to training";
			System.out.println(a);
			System.out.println("Grade is " + findGrade("Sam",85));
			
			
	}
	
	public static void anotherMethod() {
			String a ="Hello, Welcome to another Method";
			System.out.println(a);
	}

	public static String findGrade(String StudentName, int marks)
	{
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
		return grade;
	}
	
}
