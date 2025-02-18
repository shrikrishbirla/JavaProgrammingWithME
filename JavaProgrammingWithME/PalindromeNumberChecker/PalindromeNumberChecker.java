import java.util.Scanner;
public class PalindromeNumberChecker {
    public boolean isPalindrome(int number) {
        int temporaryNumber=number;
        int reversedNumber=0;
        while(temporaryNumber > 0) {
            int lastDigit = temporaryNumber % 10;
            reversedNumber = reversedNumber * 10 + lastDigit;
            temporaryNumber /= 10;
        }
        if (number == reversedNumber) {
            return true;
        }
        if (number < 0) {
            return false;
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int number = input.nextInt();
        input.close();
        PalindromeNumberChecker checker = new PalindromeNumberChecker();
        if(checker.isPalindrome(number)) {
            System.out.println(number + " is a Palindrome Number");
        }
        else {
            System.out.println(number + " is not a Palindrome Number");
        }
        

    }
}