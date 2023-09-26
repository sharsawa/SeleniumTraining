package JAVABasics;

public class ForLoop {

	public static void main(String[] args) {
		
		for (int i =0; i<10; i++)
		{
			System.out.println(i);
		}
		
		
		System.out.println("Printing Array");
		int arr[]= {1,2,4,6,324,2342,234,12314};
		for(int i =0 ;i <arr.length; i++)
		{
			System.out.println(arr[i]);
		}
		
		for(int i=arr.length -1 ;i>=0; i--)
		{
			System.out.println(arr[i]);
		}
		
		for(int no: arr)
		{
			System.out.println( no );
		}
	}
}
