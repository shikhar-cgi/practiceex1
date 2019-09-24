import java.util.Scanner;

public class exceptions 
{
	public static void main(String [] args)
	{
	
	 try 
	 {   Scanner myObj = new Scanner(System.in);
	 System.out.println("enter the size of array");
	 int m=myObj.nextInt();
	 System.out.println("enter the index to be access");
	    int n=myObj.nextInt();	
		 int a[]=new int[m];
		  a[n]=0;
		    String q=null;
		    String r=q.toLowerCase();
		  
	 }
	 catch(NegativeArraySizeException e)
	 {
		 System.out.println("array size is negative");
	 }
	 catch(IndexOutOfBoundsException e)
	 {
		 System.out.println("index acess is out of bound");
	 }
	 catch(NullPointerException e)
	 {
		 System.out.println("null pointer exception");
	 }
	}

}
