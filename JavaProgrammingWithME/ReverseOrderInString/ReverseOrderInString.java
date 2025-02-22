import java.util.Scanner;
public class ReverseOrderInString {
    static void reverse(char[] str, int left, int right) {
        while(left < right) {
            char temporaryStorage = str[left];
            str[left] = str[right];
            str[right] = temporaryStorage;
            left++;
            right--;
        }

    }
    static String reverseOrder(String str) {
        char[] characters = str.toCharArray();
        int strlen = str.length();
        reverse(characters, 0, strlen - 1);
        int index = 0;
        for(int i = 0; i <= strlen; i++) {
            if(i == strlen || characters[i] == ' ') {
                reverse(characters, index, i - 1);
                index = i + 1;
            }
        }
        return new String(characters);
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter string: ");
        String str = input.nextLine();
        input.close();
        System.out.print("Reversed Order String: " + reverseOrder(str));

    }
}