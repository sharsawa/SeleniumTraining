package staticPackage;

public class StaticDemo {

	public static void main(String[] args) {
		
		StaticEx s1 = new StaticEx ("KIA");
		System.out.println("Car type is : " + s1.getMake());
		System.out.println("instance no: " + StaticEx.instanceNbr);
		
		StaticEx s2 = new StaticEx ("Audi");
		System.out.println("Car type is : " + s2.getMake());
		System.out.println("instance no: " + StaticEx.instanceNbr);
		
	}
}
