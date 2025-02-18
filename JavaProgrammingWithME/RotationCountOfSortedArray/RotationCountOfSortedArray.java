public class RotationCountOfSortedArray {
    static boolean isSorted(int[] arr) {
        for(int i = 1; i < arr.length; i++) {
            if(arr[i] < arr[i - 1]) {
                return false;
            }
        }
        return true;
    }
    static void AntiClockwiseRotation(int[] arr) {
        int firstElement = arr[0];

        for(int i = 0; i < arr.length - 1; i++) {
            arr[i] = arr[i+1];
        }
        arr[arr.length - 1] = firstElement;

    }
    static int minRotationsToSort(int[] arr) {
        int n = arr.length;
    
        // If the array is already sorted
        if (isSorted(arr)) {
            return 0;
        }
    
        // Check each rotation
        for (int i = 0; i < n; i++) {
            AntiClockwiseRotation(arr);
            if (isSorted(arr)) {
                return i + 1; // Because i starts from 0
            }
        }
    
        // If no rotation can sort the array
        return -1;
    }
    public static void main(String[] args) {
        int[] arr = {3,4,5,1,2};
        System.out.println(minRotationsToSort(arr));
    }
}