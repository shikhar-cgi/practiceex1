
public class chess {
	
	public static void main(String [] args)
	{
		int c=1;
     String a[][]=new String[8][8];
     
     
    	 for(int j=0;j<8;j++)
    	 {
    		 if(j%2==0)
    		 {
    			 a[0][j]="WW|";
    		 }
    		 else
    		 {
    			 a[0][j]="BB|";
    		 }
    		
    	 }
    	 for(int i=1;i<8;i++)
    	 {
    		 for(int j=0;j<8;j++)
    		 {
    			if((c%2)==1)
    			{
    				a[i][j]=a[0][7-j];
    			}
    			else
    			{
    				a[i][j]=a[0][j];
    			}
    		 }
    		 c++;
    	 }
    	 for(int i=0;i<8;i++)
    	 {
    		 for(int j=0;j<8;j++)
    		 {
    			System.out.print(a[i][j]);
    		 }
    		 System.out.println();
    	 }
     
	}

}
