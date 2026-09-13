import java.util.Scanner;

public class IT25100113Lab5Q2 {
		public static void main(String[] args) {
			
			Scanner input = new Scanner(System.in);
			
			//Display to the user
			System.out.print("Enter the number of new members introduced: ");
			int newMembers = input.nextInt();
			
			//Input should be >=0
			if (newMembers <0) {
				System.out.print("Input must be a number 0 or greater");
			} else {
				String prize;
				
				//determining prize using switch statement
				switch(newMembers) {
					case 0:
					prize = "No Prize";
					break;
					
					case 1:
					prize = "Pen";
					break;
					
					case 2:
					prize = "Umbrella";
					break;
					
					case 3:
					prize = "Bag";
					break;
					
					case 4:
					prize = "Travelling Chair";
					break;
					
					default:
					prize = "Headphone";
					break;
					
					
				}
				
				System.out.print("Prize is a : "+ prize);
			}
			
		}
	
}