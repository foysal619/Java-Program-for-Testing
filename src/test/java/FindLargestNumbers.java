import java.util.Scanner;

public class FindLargestNumbers {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Find the largest, 2nd largest, and smallest numbers
        int largest = arr[0];
        int secondLargest = arr[0];
        int smallest = arr[0];
        for (int i = 1; i < n; i++) {
            if (arr[i] > largest) {
                secondLargest = largest;
                largest = arr[i];
            } else if (arr[i] > secondLargest) {
                secondLargest = arr[i];
            } else if (arr[i] < smallest) {
                smallest = arr[i];
            }
        }

        // Print the largest, 2nd largest, and smallest numbers
        System.out.println("The largest number is: " + largest);
        System.out.println("The 2nd largest number is: " + secondLargest);
        System.out.println("The smallest number is: " + smallest);
    }
}
