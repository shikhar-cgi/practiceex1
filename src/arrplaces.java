import java.util.Scanner;

public class arrplaces {
	
	public static void main(String [] args)
	{
		Scanner myObj = new Scanner(System.in);	
		String s=myObj.nextLine();
		String q[]=s.split(" ");
		
		String n="";
		String p[]=new String[q.length];
		for(int i=0;i<q.length;i++)
		{
			for(int j=0;j<q[i].length();j++)
			{
			if((q[i].charAt(j)!='A' && q[i].charAt(j)!='E' && q[i].charAt(j)!='I' && q[i].charAt(j)!='O' && q[i].charAt(j)!='U') && (q[i].charAt(j)!='a' && q[i].charAt(j)!='e' && q[i].charAt(j)!='i' && q[i].charAt(j)!='o' && q[i].charAt(j)!='u'))
			{
				n=n+q[i].charAt(j);
			}
			
			}
			p[i]=n;
			n="";
		}
		for(int i=0;i<p.length;i++)
		{
			System.out.println("place name without vowel:" + i + " " +p[i] );	
		
		}
	}

}
