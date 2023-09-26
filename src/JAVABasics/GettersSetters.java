package JAVABasics;

public class GettersSetters {

	String color, model;
	String make = "Benz";
	int year;
	
	public String getMake ()
	{
		System.out.println("Global Value is : " + make);
		return this.make;
	}
	public void setMake(String make)
	{
		this.make =make;
	}
	public String getColor ()
	{
		return this.color;
	}
	public void setColor(String color)
	{
		this.color =color;
	}
	public String getModel ()
	{
		return this.model;
	}
	public void setModel(String model)
	{
		this.model =model;
	}
	public int getYear (int year)
	{
		return this.year;
	}
	public void setYear(int year)
	{
		this.year =year;
	}
	
}
