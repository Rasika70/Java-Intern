package level2;

import java.util.Scanner;

public class passwordstrengthchecker 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String continueCheck;
        do 
        {
            System.out.println("Enter your password: ");
            String password = sc.nextLine();
            
            String strength = checkPasswordStrength(password);
            System.out.println("Password strength: " + strength);

            System.out.println("Do you want to check another password? (yes/no): ");
            continueCheck = sc.nextLine();
        } 
        while (continueCheck.equalsIgnoreCase("yes"));

        System.out.println("Thank you for using the Password Strength Checker!");
    }
    
    public static String checkPasswordStrength(String password) 
    {
        int length = password.length();
        boolean hasUpper = false, hasLower = false, hasDigit = false, hasSpecial = false;
        
        for (char c:password.toCharArray())
        {
            if (Character.isUpperCase(c))
            {
                hasUpper = true;
            } 
            else if (Character.isLowerCase(c))
            {
                hasLower = true;
            }
            else if (Character.isDigit(c)) 
            {
                hasDigit = true;
            }
            else if (isSpecialCharacter(c))
            {
                hasSpecial = true;
            }
        } 
        if (length >= 8 && hasUpper && hasLower && hasDigit && hasSpecial) 
        {
            return "Strong";
        } else if (length >= 6 && ((hasUpper && hasLower) || (hasUpper && hasDigit) || (hasLower && hasDigit) || (hasUpper && hasSpecial) || (hasLower && hasSpecial) || (hasDigit && hasSpecial))) {
            return "Medium";
        } else {
            return "Weak";
        }
    }
    
    public static boolean isSpecialCharacter(char c) 
    {
        String specialChars = "!@#$%^&*()-+";
        return specialChars.contains(String.valueOf(c));
    }
}

