public class App {
    public static void main(String[] args) throws Exception {
       // Milestone 1 Java Program to Find largest of Two Decimal Numbers.
import java.util.Scanner;

public class LargestofTwo {
	private static Scanner sc;
	public static void main(String[] args) 
	{
		Double number1, number2;
		sc = new Scanner(System.in);
		
		System.out.print(" Please Enter the First Number : ");
		number1 = sc.nextDouble();	
		
		System.out.print(" Please Enter the Second Number : ");
		number2 = sc.nextDouble();	
		
		if(number1 > number2) 
	    {
			System.out.println("\n The Largest Number = " + number1);          
	    } 
	    else if (number2 > number1)
	    { 
	    	System.out.println("\n The Largest Number = " + number2);        
	    } 
	    else 
	    {
	    	System.out.println("\n Both are Equal");
	    }		
	}	
}


       // Milestone 2 Have user input two numbers have those number print out the average in a decimal.

import java.util.Scanner;

public class averageoftwonubers{
	private static Scanner sc;
	public static void main(String[] args) 
	{
		Double number1, number2, 
		sc = new Scanner(System.in);
		
		System.out.print(" Please Enter the First Number : ");
		number1 = sc.nextDouble();	
		
		System.out.print(" Please Enter the Second Number : ");
		number2 = sc.nextDouble();	

        System.out.println("Average of two numbers is: " + (num1 + num2 ) / 2);
                
		
}
    }



       // Milestone 3


    }
}
