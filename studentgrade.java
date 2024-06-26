package level1;

import java.util.Scanner;

public class studentgrade
{
	  public static boolean findanother(String choice) 
	    {
	    	if(choice.equals("no")) 
	    	{
	    		System.out.println("Thanks for using my student grade calculater!......");
	    		return false;
	    	}
	    	return true;
	    }
	
	
public static void main(String agrs[]) {
		Scanner sc=new Scanner(System.in);
		boolean condition=true;
		
		while(condition) 
		{
		System.out.println("*********Welcome to Student grade calculater*********");
		System.out.println("Enter the number of grades: ");
		int n=sc.nextInt();
		
		int grades[]=new int[n];
		
		System.out.println("Enter the Grades: ");
		for(int i=0;i<n;i++) {
			grades[i]=sc.nextInt();
		}
		
		int sum=0;
		for(int i=0;i<n;i++) {
		sum+=grades[i];
		}
		
	 System.out.println("Total number of grades: "+sum);
		double average=sum/n;
	
	System.out.println("Average grade of the Student: "+average);
	   sc.nextLine();

	 System.out.println("Do you want to calculate for another student (yes/no): ");
     String choice=sc.nextLine().toLowerCase();
    
     condition=findanother(choice);
		}
}
}
