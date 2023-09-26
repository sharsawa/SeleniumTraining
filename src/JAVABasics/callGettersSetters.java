package JAVABasics;

public class callGettersSetters {

	public static void main(String[] args) {
		GettersSetters car = new GettersSetters();
		
		car.getMake();
		car.setMake("KIA");
		System.out.println("new value of make: " + car.getMake());
	}
}
