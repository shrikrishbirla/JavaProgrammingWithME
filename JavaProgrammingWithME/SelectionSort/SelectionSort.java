import java.util.Scanner;
public class SelectionSort {
    static void swapElements(int[] array, int i , int j) {
        int temporaryStorage = array[i];
        array[i] = array[j];
        array[j] = temporaryStorage;
    }
    
    static void selectionSort(int[] array, int arrayLength) {
        for(int i = 0; i < arrayLength - 1; i++) {
            int minNumberIndex = i;
            for(int j = i + 1; j < arrayLength; j++) {
                if(array[j] < array[minNumberIndex]) {
                    minNumberIndex = j;
                }
            }
            swapElements(array, i, minNumberIndex);
        }
    }
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int arrayLength = input.nextInt();
        int [] array = new int[arrayLength];
        for(int i = 0; i < arrayLength; i++) {
            System.out.print("Enter value for " + i + " index of array: ");
            array[i] = input.nextInt();
        }
        input.close();
        System.out.println("Original Array");
        for(int i = 0; i < arrayLength; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
        System.out.println("Sorted Array");
        selectionSort(array, arrayLength);
        for(int i = 0; i < arrayLength; i++) {
            System.out.print(array[i] + " ");
        }
    }
}