import java.util.Scanner;
public class UniqueCharactersOrNot {
    static boolean isUniqueCharacter(String string) {
        char[] character = string.toCharArray();
        int strlen = string.length();
        for(int i = 0; i < strlen; i++) {
            for (int j = i + 1; j < strlen; j++) {
                if(character[i] == character[j]) {
                    return false;
                }
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter string: ");
        String string = input.nextLine();
        input.close();
        if(isUniqueCharacter(string)) {
            System.out.println("YES");
        }
        else {
            System.out.println("NO");
        }
    }
}