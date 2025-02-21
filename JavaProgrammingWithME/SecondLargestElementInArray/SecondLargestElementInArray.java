import java.util.Scanner;
public class SecondLargestElementInArray {
    static void swapElement(int[] array, int i ,int j) {
        int temporaryStorage = array[i];
        array[i] = array[j];
        array[j] = temporaryStorage;
    }
    static void selectionSort(int[] array, int arrayLength) {
        for(int i = 0; i < arrayLength; i++) {
            int minNumberIndex = i;
            for(int j = i + 1; j < arrayLength; j++) {
                if(array[j] < array[minNumberIndex]) {
                    swapElement(array, j, minNumberIndex);
                }
            }
        }
    }
    static void bubbleSort(int[] array, int arrayLength) {
        for(int i = arrayLength - 1; i > 0; i--) {
            for(int j = 0; j < i; j++){
                if(array[j] > array[j + 1]) {
                    swapElement(array, j, j + 1);
                }
            }
        }
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int arrayLength = input.nextInt();
        int[] array = new int[arrayLength];
        for(int i = 0 ; i < arrayLength; i++) {
            System.out.print("Enter value of "+ i + " index of array: ");
            array[i] = input.nextInt();
        }
        input.close();
        System.out.println("Original Array");
        for(int i = 0 ; i < arrayLength; i++) {
            
            System.out.print(array[i] + " ");
        }
        bubbleSort(array, arrayLength);
        System.out.println("\nSorted Array");
        for(int i = 0 ; i < arrayLength; i++) {
            
            System.out.print(array[i] + " ");
        }
        System.out.print("\nSecond Largest Element in array: ");
        System.out.println(array[arrayLength - 2]);
    }
}