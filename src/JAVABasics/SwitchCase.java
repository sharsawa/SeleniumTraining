package JAVABasics;

public class SwitchCase {
	static int noDays,days;
	static int year = 2023, month =13;
	
	public static void main(String[] args) {
		
		System.out.println(year);
		System.out.println(month);
		days = noofdays(year,month);
		System.out.println("No of days in given year & Month : " + days);
		
	}
	static int noofdays (int year, int month)
	{
		switch(month) {
			case 1 :
				noDays = 31;
				break;
			case 2 :
				if((year % 4 == 0) || (year % 400 == 0) || (year % 100 == 0))
				{
					noDays = 29;
					break;
				}
				else
				{
					noDays = 28;
					break;
				}
			case 3 :
				noDays = 31;
				break;
			case 4 :
				noDays = 30;
				break;
			case 5 :
				noDays = 31;
				break;
			case 6 :
				noDays = 30;
				break;
			case 7 :
				noDays = 31;
				break;
			case 8 :
				noDays = 31;
				break;
			case 9 :
				noDays = 30;
				break;
			case 10 :
				noDays = 31;
				break;
			case 11 :
				noDays = 30;
				break;
			case 12 :
				noDays = 31;
				break;
			default:
				System.out.println("Correct month not entered ");
				break;
			
		}	
		return noDays;
		
	}

}
