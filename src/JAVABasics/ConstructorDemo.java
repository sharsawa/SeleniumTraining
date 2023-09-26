package JAVABasics;

public class ConstructorDemo {

	String make;
	int speed, gear;
	
	public ConstructorDemo() //name of class and name of method is the same for constructor
	{
		this(10,3);// constructor should be called using this
		this.speed = 0;
		this.gear = 1;
		System.out.println(" Constructor eg 1 : ");
	}
	
	public ConstructorDemo( int speed, int gear) //constructor overloading
	{
		this(10,3, "Audi");
		this.speed = speed;
		this.gear = gear;
		System.out.println(" Constructor eg 2 : ");
	}
	
	public ConstructorDemo( int speed, int gear, String make) //constructor overloading
	{
		this.speed = speed;
		this.gear = gear;
		this.make=make;
		System.out.println(" Constructor eg 3 : ");
	}
	
	public void setMake(String make)
	{
		this.make =make;
	}
	public String getMake ()
	{
		System.out.println("Global Value is : " + make);
		return this.make;
	}
}
