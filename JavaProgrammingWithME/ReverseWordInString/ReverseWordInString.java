import java.util.Scanner;
public class ReverseWordInString {
    static void reverse(char[] str, int left, int right) {
        while(left < right) {
            char temporaryStorage = str[left];
            str[left] = str[right];
            str[right] = temporaryStorage;
            left++;
            right--;
        }
    }
    static void reverseWord(String str) {
        char[] characters = str.toCharArray();
        int strlen = str.length();
        int index = 0;
        for(int i = 0; i <= strlen; i++) {
            if(i == strlen || characters[i] == ' ' ) {
                reverse(characters, index, i - 1);
                index = i + 1;
            }
        }
        System.out.println(new String(characters));
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter any String: ");
        String str = input.nextLine();
        input.close();
        System.out.print("Reversed Word string: ");
        reverseWord(str);
    }
}