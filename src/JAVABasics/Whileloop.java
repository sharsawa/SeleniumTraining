package JAVABasics;

public class Whileloop {
	public static void main(String[] args) {
		int i = 0;
		System.out.println(" While Loop ");
		while(i < 10)
		{
			System.out.println("i = " + i + " inside of while loop" );
			i++;
		}
		//System.out.println("i = " + i + " outside of while loop" ) ;
		
		System.out.println(" Do While Loop ");
		int j =0;
		do
		{
			System.out.println("j = " + j + " inside do" ) ;
			j++;
		}while(j<10);
		//System.out.println("j = " + j + " outside do" ) ;
	}

}
