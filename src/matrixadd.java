import java.util.Scanner;

public class matrixadd {
	
public static void main(String [] args)
{
	Scanner myObj = new Scanner(System.in);
	System.out.println(" Enter the number of columns");
	int col=myObj.nextInt();
	System.out.println(" Enter the number of rows");
	int row=myObj.nextInt();
	System.out.println(" Enter the first matrix");
    int m1[]=new int[col*row];
    for(int i=0;i<col*row;i++)
    {
    	m1[i]=myObj.nextInt();
    }
    
    System.out.println(" Enter the second matrix");
    int m2[]=new int[col*row];
    for(int i=0;i<col*row;i++)
    {
    	m2[i]=myObj.nextInt();
    }
    int m3[]=new int[col*row];
    for(int i=0;i<col*row;i++)
    {
    	m3[i]=m2[i]+m1[i];
    }
    
    System.out.println("sum of matrices is");
    	for(int j=0;j<col*row;j++)
    	{   
    		if(j>0 && j%col==0)
    		{
    			System.out.println();
    		}
    		System.out.print(m3[j] + "  ");
    		
    	}
    	
    
    
}
	
}
