import java.util.Scanner;

public class series {

	public static void main(String [] args)
	{
		String s;
		int flag=0;
		Scanner myObj = new Scanner(System.in);
		s=myObj.nextLine();
		String a[]=s.split(",");
		int b[]=new int[a.length];
		for(int i=0;i<a.length;i++)
		{
			b[i]= Integer.parseInt(a[i]);
		}
		for(int i=0;i<b.length-1;i++)
		{
			if((b[i+1]-b[i])>1 || (b[i+1]-b[i])<-1 )
			{
				flag=1;
			}
		}
		if(flag==0)
		{
			for(int i=0;i<b.length;i++)
			{
				System.out.print(b[i]);
				
			}
			System.out.print("are consecutive");
		}
		else
		{
			for(int i=0;i<b.length;i++)
			{
				System.out.print(b[i] + " ");
				
			}
			System.out.print("are non-consecutive");
		}
	}
}
