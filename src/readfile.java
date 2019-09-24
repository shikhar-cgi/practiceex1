import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class readfile {
	
	public static void main(String [] args) throws IOException
	{
		Scanner myObj = new Scanner(System.in);
	String s=myObj.nextLine();	
	File n=new File(s);
	long len=n.length();
	FileReader read=new FileReader(s);
	BufferedReader br=new BufferedReader(read);
	String q=br.readLine();
	String u="";
	while(q!=null)
	{
		u=q.toUpperCase();
		q=br.readLine();
		System.out.println(u);
		u="";
	}
	br.close();
	System.out.println("length of file is" + len);
	}

}
