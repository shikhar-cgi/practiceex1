import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class bytearr {
	
	public static void main(String [] args) throws IOException
	{
		
		Scanner myObj = new Scanner(System.in);
		String s=myObj.nextLine();
		File br=new File(s);
		File l[]=br.listFiles();
		
		System.out.println("Give name of extension you wanna open");
		String ex=myObj.nextLine();
		for(int i=0;i<l.length;i++)
		{
			if(l[i].getName().toLowerCase().endsWith(ex))
			{
				FileInputStream sr=new FileInputStream(l[i]);
				byte[] arr=new byte[(int)l.length];
				int count=0;
				while((count=sr.read(arr))>0)
				{
					System.out.println(new String(arr));
				}
				sr.close();
			}
		}
	
	}
	}

	
	


