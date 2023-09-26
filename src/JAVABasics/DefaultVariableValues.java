package JAVABasics;

public class DefaultVariableValues {
	//below variables are global variables
	static byte byteVar;
	static short shortVar;
	static int intVar;
	static long longVar;
	static float floatVar;
	static double doubleVar;
	static boolean bool;
	static  char charVar;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//any variable declared inside of this is local variable
		//byte : -128 to 127
		
		System.out.println("Byte Value = " + byteVar);
		
		//short : -32768 to 32767 
		System.out.println("Short Value = " + shortVar);
		
		//int : -2147483648 to 214783647
		System.out.println("Integer Value = " + intVar);
		
		//long - suffix the variable with L : -2 ^63 to 2^63-1
		System.out.println("Long Value = " + longVar);
		
		//float - suffix the variable with F : default is 0.0f
		System.out.println("Float Value = " + floatVar);
		
		//double : default is 0.0d
		System.out.println("Double Value = " + doubleVar);
		
		//boolean - default is false
		System.out.println("Boolean Value = " + bool);
		
		//char : 0 to 65535
		System.out.println("Char Value = " + charVar );

	}
	// global variable can be used inside any class
	void anotherMethod() {
		System.out.println("Int Value =" + intVar);
	}

}
