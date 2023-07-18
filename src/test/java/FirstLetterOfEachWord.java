import java.util.Scanner;

public class FirstLetterOfEachWord {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String string = sc.nextLine();

        String[] words = string.split(" ");
        for (String word : words) {
            System.out.print(word.charAt(0));
        }
    }
}
