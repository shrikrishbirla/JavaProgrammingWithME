import java.util.Scanner;
public class SpiralTraversalOfMatrix {
    static void printSpiral(int[][] a, int r, int c) {
        // Spiral Traversing
        int top = 0, left = 0, bottom = r - 1, right = c - 1;
        
        while(left <= right && top <= bottom) {
            // left to right
            for(int i = left; i <= right; i++) {
                System.out.print(a[top][i] + " ");
            }
            top++;
            // top to bottom
            for(int i = top; i <= bottom; i++){
                System.out.print(a[i][right] + " ");
            }
            right--;
            // right to left
            if(top <= bottom) {
                for(int i = right; i >= left; i--) {
                    System.out.print(a[bottom][i] + " ");
                }
                bottom--;
            }
            // bottom to top
            if(left <= right) {
                for(int i = bottom; i >= top; i--) {
                    System.out.print(a[i][left] + " ");
                }
                left++;
            }
        }
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter n x m of a Matrix: ");
        int n = input.nextInt();
        int m = input.nextInt();
        int a[][] = new int[n][m];
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < m; j++) {
                System.out.print("Enter " + i + " " + j + " value: ");
                a[i][j] = input.nextInt();
            }
        }
        input.close();

        // Displaying Matrix
        System.out.println("\nMatrix Diagram");
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < m; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("\nSpiral Matrix");
        printSpiral(a,n,m);
    }
}