import java.util.Scanner;

public class Substrings {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String string = sc.nextLine();

        int n = string.length();
        for (int i = 0; i < n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.println(string.substring(i, i + j));
            }
        }
    }
}
