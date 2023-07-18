
    // Find the first non-repeated character
    public class FirstNonRepeatedCharacter {

        public static char findFirstNonRepeatedCharacter(String str) {
            int[] charCount = new int[256];
            for (int i = 0; i < str.length(); i++) {
                charCount[str.charAt(i)]++;
            }

            for (int i = 0; i < str.length(); i++) {
                if (charCount[str.charAt(i)] == 1) {
                    return str.charAt(i);
                }
            }

            return '\0';
        }

        public static void main(String[] args) {
            String str = "gibblegabbler";
            char firstNonRepeatedCharacter = findFirstNonRepeatedCharacter(str);
            System.out.println("The first non-repeated character in the string is: " + firstNonRepeatedCharacter);
        }
    }

