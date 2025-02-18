import java.util.Scanner;
public class SumOfMultiNumberMethodOmega {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter digit: ");
        int n=input.nextInt();
        input.close();
        int sum=n*(n+1)/2;
        System.out.println("Total: " + sum);
    }    
}
