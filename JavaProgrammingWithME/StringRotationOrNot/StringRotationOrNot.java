import java.util.Scanner;
public class StringRotationOrNot {
    static boolean isRotation(String stringOne, String stringTwo) {
        int strlenOne = stringOne.length();
        int strlenTwo = stringTwo.length();
        if(strlenOne != strlenTwo) {
            return false;
        }
        String concatenateString = stringOne + stringOne;
        if(concatenateString.contains(stringTwo)) {
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.print("Enter first string: ");
        String stringOne = input.nextLine();
        System.out.print("Enter second string: ");
        String stringTwo = input.nextLine();
        if(isRotation(stringOne, stringTwo)) {
            System.out.println("YES");
        }
        else {
            System.out.println("NO");
        }

    }
}