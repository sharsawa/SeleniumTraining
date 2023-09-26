package JAVABasics;

public class ConstructorDemoCall {

	public static void main(String[] args) {
		
		ConstructorDemo cd1= new ConstructorDemo();
		
		cd1.setMake("Bently");
		System.out.println(cd1.getMake());
		
		System.out.println(cd1.speed);
		System.out.println(cd1.gear);
		
		ConstructorDemo cd2= new ConstructorDemo(10,2);
		System.out.println(cd2.speed);
		System.out.println(cd2.gear);
		
		ConstructorDemo cd3= new ConstructorDemo(20,4, "RR");
		System.out.println(cd3.speed);
		System.out.println(cd3.gear);
		System.out.println(cd3.make);
	}
}
 