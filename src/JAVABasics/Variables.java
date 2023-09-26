package JAVABasics;

public class Variables {
	//ctrl + spacebar for full command
	// // for comment or /* */ multiple line comment
	//primitive variable datatypes
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//byte : -128 to 127
		byte byteVar = 100;
		System.out.println("Byte Value = " + byteVar);
		
		//short : -32768 to 32767 
		short shortVar = 1000;
		System.out.println("Short Value = " + shortVar);
		
		//int : -2147483648 to 214783647
		int intVar = 10000;
		System.out.println("Integer Value = " + intVar);
		
		//long - suffix the variable with L : -2 ^63 to 2^63-1
		long longVar = 1000000L;
		System.out.println("Long Value = " + longVar);
		
		//float - suffix the variable with F : default is 0.0f
		float floatVar = 30.2F;
		System.out.println("Float Value = " + floatVar);
		
		//double : default is 0.0d
		double doubleVar = 60.55;
		System.out.println("Double Value = " + doubleVar);
		
		//boolean - default is false
		boolean bool = true;
		System.out.println("Boolean Value = " + bool);
		
		//char : 0 to 65535
		char charVar = 'a';
		System.out.println("Char Value = " + charVar );
 	}

}
