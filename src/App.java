import java.util.Scanner;

public class App {
	public static void main(String[] args) throws Exception {
		// Milestone 1 Java Program to Find largest of Two Decimal Numbers.

		Scanner sc = new Scanner(System.in);

		double number1, number2;

		System.out.print("Please Enter the First Number:");
		number1 = sc.nextDouble();

		System.out.print("Please Enter the Second Number:");
		number2 = sc.nextDouble();

		if (number1 > number2) {
			System.out.println("The Largest Number =" + number1);
		} else if (number2 > number1) {
			System.out.println("The Largest Number =" + number2);
		} else {
			System.out.println("Both are Equal");
		}

		// Milestone 2 Have user input two numbers have those number print out the
		// average in a decimal.

		// double number1, number2,
		// sc = new Scanner(System.in);

		System.out.print("Please Enter the First Number:");
		number1 = sc.nextDouble();

		System.out.print("Please Enter the Second Number:");
		number2 = sc.nextDouble();

		System.out.println("Average of two numbers is:" + (number1 + number2) / 2);

		// Milestone 3. Input the radius of a circle and print the circumference and
		// area.
		// The answer should be a decimal value. The formula for circumference is 2 * pi
		// * r
		// and the formula for area is pi * r * r. You can use 3.14 for the value of pi
		// in this activity.

		// sc = new Scanner(System.in);

		System.out.print("Enter the radius: ");

		double radius = sc.nextDouble();

		double area = Math.PI * (radius * radius);
		System.out.println(String.format("The area of circle is: %.4f", area));

		double circumference = Math.PI * 2 * radius;
		System.out.println(String.format("The circumference of the circle is: %.4f", circumference));

	}
}
