package JAVABasics;

public class StringMethod {
	//string is Referenced datatypes
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Initialising String
		String str1= "."; // this uses heap memory for objects
		
		String str2 = new String("Welcome there"); 
		// this uses heap memory for string constant pool -- new keyword assigns a new memory to the keyword

		String str3 = str1 + " " + str2;
		
		System.out.println("string 3 " + str3);
		
		String str4 = "this is the string 4 for checking string methods.";
		
		String str5 = "           This is a big space at front";
		
		String str6 = "UPPER";
		
		String str7 = "lower";
		
		//Different String Methods
		
		System.out.println("Length of str 4 is " + str4.length());
		System.out.println("character at index 3 is " + str4.charAt(3));
		System.out.println("Concatinating string :" + str1.concat(str2)); // usually prefer + for concatinating
		System.out.println("Contains example " + str4.contains("for")); //boolean
		System.out.println("Starts with is? " + str4.startsWith("is")); //boolean
		System.out.println("Ends with . ? " + str4.endsWith(str1)); //boolean
		System.out.println("Does str1 equals str2 ? " + str1.equals(str2)); //boolean
		System.out.println("Checking Index of i : " + str4.indexOf("i" , 1));//different methods available for indexof
		System.out.println("Checking Index of i : " + str4.indexOf("s"));
		System.out.println("Checking if string is empty " + str4.isEmpty() ); //boolean
		System.out.println(str5 + " Trimming spaces " + str5.trim());
		System.out.println("replacing string : "+ str4.replace("4", "four"));
		System.out.println("Substring method: " + str4.substring(4, 13));
		
		System.out.println("Lower Case : " + str6.toLowerCase());
		System.out.println("Upper Case: " + str7.toUpperCase());
	}

}
