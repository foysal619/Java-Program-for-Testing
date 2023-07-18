// Extract the Last 4 characters of any String
public class Last4Characters {

    public static String extractLast4Characters(String str) {
        if (str.length() < 4) {
            return str;
        }

        return str.substring(str.length() - 4);
    }

    public static void main(String[] args) {
        String str = "gibblegabbler";
        String last4Characters = extractLast4Characters(str);
        System.out.println("The last 4 characters of the string are: " + last4Characters);
    }
}
