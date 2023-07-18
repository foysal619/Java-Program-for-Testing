// Find the maximum difference
public class MaximumDifference {

    public static int findMaximumDifference(int[] arr) {
        int maxDifference = Integer.MIN_VALUE;
        int minValue = arr[0];

        for (int i = 1; i < arr.length; i++) {
            int currentDifference = arr[i] - minValue;
            if (currentDifference > maxDifference) {
                maxDifference = currentDifference;
            }

            if (arr[i] < minValue) {
                minValue = arr[i];
            }
        }

        return maxDifference;
    }

    public static void main(String[] args) {
        int[] arr = {1, 10, 5, 2, 9, 7, 3, 6, 8, 4};
        int maximumDifference = findMaximumDifference(arr);
        System.out.println("The maximum difference is: " + maximumDifference);
    }
}
