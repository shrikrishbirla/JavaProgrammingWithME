import java.util.Scanner;

public class ArmstrongNumberChecker {
    public static int CountDigits(int number) {
        int numberOfDigits = 0;
        while(number > 0) {
            number /= 10;
            numberOfDigits++;
        }
        return numberOfDigits; 
    }
    public boolean isArmstrong(int number) {
        int originalNumber = number;
        int digits = CountDigits(number);
        int sum = 0;
        while (number != 0) {
            int remainder = number % 10;
            sum += Math.pow(remainder, digits);
            number /= 10;
        }
        return sum == originalNumber;
    }
    public static void main(String[] args) {
        ArmstrongNumberChecker checker = new ArmstrongNumberChecker();
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int number = input.nextInt();
        input.close();
        if(checker.isArmstrong(number)) {
            System.out.println("Yes! " + number + " is an Armstrong Number" );
        }
        else {
            System.out.println("No! " + number + " is an Armstrong Number" );
        }
    }
}