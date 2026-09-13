import java.util.Scanner;

public class IT25100113Lab5Q1 {
		public static void main(String[] args) {
			
			Scanner input = new Scanner(System.in);
			
			//Display to the user
			System.out.print("Enter the First integer:  ");
			int num1 = input.nextInt();
			
			System.out.print("Enter the Second integer:  ");
			int num2 = input.nextInt();
			
			System.out.print("Enter the Third integer:  ");
			int num3 = input.nextInt();
			
			//Display the entered numbers.
			System.out.println("User entered numbers are : "+ num1 +"  "+ num2 +"  " + num3);
			
			//Find the smallest and the largest
			int smallest = Math.min(num1,Math.min(num2,num3));
			int largest  =Math.max(num1,Math.max(num2,num3));
			
			System.out.println("The smallest number : " +smallest);
			System.out.print("The largest number : "+largest);
		}
}