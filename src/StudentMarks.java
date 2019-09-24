import java.util.Scanner;
import java.util.*;
public class StudentMarks {
	
 
public static void main(String [] args)
{
	
	
	Scanner myObj = new Scanner(System.in);
	  
    System.out.println("Enter the number of students");	
	int numOfStudents=myObj.nextInt();
	int stuGrades []=new int[numOfStudents];
	System.out.println("Enter the grade of students");
	for(int i=0;i<numOfStudents;i++)
	{
		
		stuGrades[i]=myObj.nextInt();
	}
	for(int i=0;i<numOfStudents;i++)
	{
	if(stuGrades[i]<0 || stuGrades[i]>100)
	{
		System.out.println("Error");
	}
}
	
}
}

