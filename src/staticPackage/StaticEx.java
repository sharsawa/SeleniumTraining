package staticPackage;

public class StaticEx {

	String make;
	static int instanceNbr = 0;
	
	public StaticEx (String make)
	{
		this.make=make;
		instanceNbr++;
	
	}
	
	public String getMake()
	{
		return make;
		
	}
	
	public int getInstanceNum()
	{
		return instanceNbr;
	}
}
