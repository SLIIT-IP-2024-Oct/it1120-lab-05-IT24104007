import java.util.Scanner;

public class IT24104007Lab5Q3 {
   
    static final double ROOM_CHARGE_PER_DAY = 48000.00;
    static final int MAX_DAYS = 31;
    static final int MIN_DAYS = 1;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Start Date (1-31): ");
        int startDate = scanner.nextInt();

        System.out.print("Enter End Date (1-31): ");
        int endDate = scanner.nextInt();

        if (startDate < MIN_DAYS || startDate > MAX_DAYS || endDate < MIN_DAYS || endDate > MAX_DAYS) {
            System.out.println("Error: Days must be between 1 and 31");
        } else if (startDate >= endDate) {
            System.out.println("Error: Start Date must be less than End Date");
        } else {

            int daysReserved = endDate - startDate;

            double discountRate;
            if (daysReserved < 3) {
                discountRate = 0.0; 
            } else if (daysReserved <= 4) {
                discountRate = 0.10;
            } else {
                discountRate = 0.20;             }

            double totalCharge = daysReserved * ROOM_CHARGE_PER_DAY;
            double discountedAmount = totalCharge - (totalCharge * discountRate);

            System.out.println("Room Charge Per Day: Rs. " + ROOM_CHARGE_PER_DAY);
            System.out.println("Number of Days Reserved: " + daysReserved);
            System.out.println("Total Amount to be Paid: " + discountedAmount);
        }

        scanner.close();
    }
}
