import java.util.HashSet;
import java.util.Set;

// Find only repeating elements
public class RepeatingElements {

    public static void findRepeatingElements(int[] arr) {
        Set<Integer> repeatingElements = new HashSet<>();
        for (int i = 0; i < arr.length; i++) {
            if (repeatingElements.contains(arr[i])) {
                System.out.println(arr[i]);
            } else {
                repeatingElements.add(arr[i]);
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 1, 2, 3, 5, 6, 7};
        findRepeatingElements(arr);
    }
}
