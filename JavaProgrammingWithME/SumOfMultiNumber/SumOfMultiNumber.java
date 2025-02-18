import java.util.Scanner;
public class SumOfMultiNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter digit: ");
        int n=input.nextInt();
        input.close();
        int sum=0;
        for(int i=1; i<=n; i++) {
            sum+=i;
        }
        System.out.println("Total: " + sum);
    }    
}