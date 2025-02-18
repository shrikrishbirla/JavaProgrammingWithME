import java.util.Scanner;
/*
             __0_1_2_
           0 | 1 2 3
           1 | 4 5 6
           2 | 7 8 9

                |
                |
                V

             __0_1_2_
           0 | 7 4 1  
           1 | 8 5 2
           2 | 9 6 3


           0 0 --> 0 2
           0 1 --> 1 2
           0 2 --> 2 2
           1 0 --> 0 1
           1 1 --> 1 1
           1 2 --> 2 1
           2 0 --> 0 0
           2 1 --> 1 0 
           2 2 --> 2 0

*/
public class RotateArray90Degree {
    static void rotate90Degree(int[][] matrix, int size) {
        for(int i = 0; i < size; i++) {
            for(int j = 0; j < size; j++) {
                System.out.print(matrix[size - j - 1][i] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter size of matrix: ");
        int size = input.nextInt();
        int[][] matrix = new int[size][size];
        for(int i = 0; i < size; i++) {
            for(int j = 0; j < size; j++) {
                matrix[i][j] = input.nextInt();
            }
        }
        input.close();
        System.out.println("Original Array");
        for(int i = 0; i < size; i++) {
            for(int j = 0; j < size; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("Rotated Array");
        rotate90Degree(matrix, size);


    }
}