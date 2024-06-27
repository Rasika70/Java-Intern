package level1;

import java.security.SecureRandom;
import java.util.Scanner;

public class passwordgenerator {

                   
    public static String generatePassword(int length, String includeNumbers, String includeLowercase, String includeUppercase, String includeSpecialCharacters) {
       
        SecureRandom random = new SecureRandom();
        StringBuilder password = new StringBuilder(length);
        
        StringBuilder characters = new StringBuilder();
        
        
        String lowercase = "abcdefghijklmnopqrstuvwxyz";
        String uppercase = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String numbers = "0123456789";
        String specialcharacters = "!@#$%^&*()-_=+[]{}|;:,.<>?";

        if (includeNumbers.equals("yes")) {
            characters.append(numbers);
        }
        if (includeLowercase.equals("yes")) {
            characters.append(lowercase);
        }
        if (includeUppercase.equals("yes")) {
            characters.append(uppercase);
        }
        if (includeSpecialCharacters.equals("yes")) {
            characters.append(specialcharacters);
        }

        if (characters.isEmpty()) {
            throw new IllegalArgumentException("At least one character type must be selected");
        }
        for (int i = 0; i < length; i++) {
            int randomIndex = random.nextInt(characters.length());
            password.append(characters.charAt(randomIndex));
        }

        return password.toString();
    }
    public static boolean continuep(String choice) {
    	if(choice.equals("no")) 
    	{
    		System.out.println("Thanks for using the password generator!......");
    		return false;
    	}
    	return true;
    }
    	
 
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("******Welcome to Random Password Generator!******");
    boolean generatePassword=true;

   
    
    while(generatePassword) 
    {
    System.out.print("Enter the desired length of the password: ");
    int length = sc.nextInt();
    
    System.out.print("Include numbers? (yes/no): ");
    String includeNumbers = sc.next().toLowerCase();

    System.out.print("Include lowercase letters? (yes/no): ");
    String includeLowercase = sc.next().toLowerCase();

    System.out.print("Include uppercase letters? (yes/no): ");
    String includeUppercase = sc.next().toLowerCase();

    System.out.print("Include special characters? (yes/no): ");
    String includeSpecialCharacters = sc.next().toLowerCase();

    String password = generatePassword(length, includeNumbers, includeLowercase, includeUppercase, includeSpecialCharacters);

    
    System.out.println("Generated Password: " + password);
    
    sc.nextLine();
    System.out.println("Generate another password??(yes/no):  ");
    String choice=sc.nextLine().toLowerCase();
    
     generatePassword = continuep(choice);
    }
    
    sc.close();
}

}