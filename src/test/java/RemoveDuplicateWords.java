import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class RemoveDuplicateWords {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String string = sc.nextLine();

        Set<String> set = new HashSet<>();
        for (String word : string.split(" ")) {
            set.add(word);
        }

        System.out.println("String after removing duplicate words: " + set);
    }
}
