package level1;
import java.util.Scanner;

class temperatureconvert
{
	public static void convertcheck(String choice,double temperature) {
		if(choice.equals("F")) {
			double value=celsiustofahrenheit(temperature);
			System.out.printf("Calculate Celsius to fahrenheit = %.2f°F",value);
			System.out.println(" ");
		}
		else if(choice.equals("C")) {
			double value=fahrenheittocelsius(temperature);
			System.out.printf("Calculate fahrenheit to celsius = %.2f°C" , value);
			System.out.println(" ");
			
		}
		else {
			System.out.println("Enter valid choice for converting..");
		
		}
		
	}

public static double celsiustofahrenheit(double celsius) 
{
	return (celsius*9/5+32);
}
public static double fahrenheittocelsius(double fahrenheit) {
	return ((fahrenheit-32*5)/9);
}
	
}

class temperature {
	
public static void main(String args[]) 
{
	System.out.println("Welcome to temperature converter..!");
	Scanner sc=new Scanner(System.in);
	boolean conversion=true;
	while(conversion) {
		System.out.println("Enter F for celsius to fahrenheit or ");
		System.out.println("Enter c for fahrenheit to celsius");
		
		System.out.println("Enter your choice(C or F): ");
		String choice=sc.next().toUpperCase();
	    
		System.out.print("Enter the temperature = ");
		double temperature=sc.nextDouble();
		temperatureconvert.convertcheck(choice,temperature);
		
		System.out.println("To find more values(yes/no)");
		String find=sc.next().toLowerCase();
		
		conversion=findanother(find,conversion);
	}
	sc.close();
} 


public static boolean findanother(String find,boolean conversion) {
	if(find.equals("yes")) {
		return true;
	}
	else {
		System.out.println("Thanks for using temperature converter");
		return false;
		
		
	}
	
}

}


