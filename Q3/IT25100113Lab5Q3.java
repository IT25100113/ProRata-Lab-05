import java.util.Scanner;

public class IT25100113Lab5Q3 {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		//giving value for room charge per day
		final double ROOM_CHARGE_PER_DAY = 48000.00;
		
		System.out.print("Enter Start Date (1-31): ");
		int startDate = input.nextInt();
		
		System.out.print("Enter End Date (1-31):  ");
		int endDate = input.nextInt();
		
		//validation1: checking whether the startDate and endDateless 1 or greater than 31
		if (startDate < 1 || startDate > 31 || endDate < 1 || endDate > 31) {
			System.out.println("Error: Days must be between 1 and 31");
			return;
		}
		
		if (startDate > endDate) {
			System.out.println("Error: Start Date should be less than the End Date");
			return;
		}
		
		//calculation of number od days reserved
		int daysReserved = endDate-startDate;
		
		int discountRate;
		if (daysReserved < 3) {
			discountRate = 0;
		}  else if (daysReserved > 3 && daysReserved < 4) {
			discountRate = 10;
		}   else {
			discountRate = 20;
		}
		
		//calculation of discount amount
		double TotalAmount = daysReserved*ROOM_CHARGE_PER_DAY;
		double discountAmount = TotalAmount*discountRate/100;
		double TotalAmountToPay = TotalAmount-discountAmount;
		
		//displaying to the user
		System.out.println("Room Charge Per Day:  Rs." + String.format("%.0f", ROOM_CHARGE_PER_DAY) +".0/=");
		System.out.println("Number of days Reserved: " + daysReserved);
		System.out.println("Total Amount to be Paid: " + String.format("%.1f", TotalAmountToPay));
	} 
}