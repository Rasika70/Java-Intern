package level1;

import java.util.Scanner;

public class palindromechecker

{
    public static boolean isPalindrome(String s)
    {
    	 String reverse="";
    	 int length = s.length();   
         for ( int i = length - 1; i >= 0; i--)  
         {
            reverse = reverse + s.charAt(i);  
          
          if(s.equals(reverse)) {
        	  return true;
         
         }
          }
         
		return false;
         }  
    
    public static boolean findanother(String choice,boolean condition) 
    {
    	if(choice.equals("no")) 
    	{
    		System.out.println("Thanks for using my palindrome checker");
    		return false;
    	}
    	return true;
    }
  
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to plaindrome checker!");
        
        boolean condition=true;
        while (condition) 
        {

            System.out.println("Enter a word or phrase:");
            String input = sc.nextLine();	
      
        if (isPalindrome(input))
        {
            System.out.println("The input is a palindrome.");
        } else 
        {
            System.out.println("The input is not a palindrome.");
        }
        System.out.println("To check next word/phrase enter (yes/no)");
        String choice=sc.nextLine().toLowerCase();
       
        condition=findanother(choice,condition);
        
    }
        sc.close();
    }
    
}
    


