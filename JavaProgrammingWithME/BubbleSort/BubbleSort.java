import java.util.Scanner;
public class BubbleSort {
    static void swapElements(int[] array, int i, int j) {
        int temporaryStorage = array[i];
        array[i] = array[j];
        array[j] = temporaryStorage;
    }
    static void bubbleSort(int[] array, int arrayLength) {
        for(int i = arrayLength - 1; i >= 1; i--) {
            for(int j = 0; j < i; j++) {
                if(array[j] > array[j + 1]) {
                    swapElements(array, j, j + 1);
                }
            }
        }
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the size of Array: ");
        int arrayLength = input.nextInt();
        int[] array = new int[arrayLength];
        for(int i = 0; i < arrayLength; i++) {
            System.out.print("Enter value in " + i + " index of array: ");
            array[i] = input.nextInt();
        }
        input.close();
        System.out.println("Original Array:");
        for(int i = 0; i < arrayLength; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
        System.out.println("Sorted Array:");
        bubbleSort(array, arrayLength);
        for(int i = 0; i < arrayLength; i++) {
            System.out.print(array[i] + " ");
        }
    }
}