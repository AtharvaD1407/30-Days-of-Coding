public class Strings {
    public static void main(String[] args) {

        // 1. String Declaration and Initialization
        String str = "Hello, Java!";
        System.out.println("String: " + str);

        // 2. Accessing Characters of a String
        System.out.println("Character at index 4: " + str.charAt(4));

        // 3. Modifying a String (Strings are Immutable)
        // Strings cannot be modified directly as they are immutable.
        // Example: Using StringBuilder
        StringBuilder sb = new StringBuilder(str);
        sb.setCharAt(7, 'X');
        System.out.println("Modified String: " + sb.toString());

        // 4. Finding String Length
        System.out.println("Length of the String: " + str.length());

        // 5. Concatenating Strings
        String str2 = " How are you?";
        String result = str.concat(str2);
        System.out.println("Concatenated String: " + result);

        // 6. Comparing Strings
        String str3 = "hello, java!";
        System.out.println("Is str equal to str3? " + str.equals(str3));

        // 7. Converting String to Uppercase and Lowercase
        System.out.println("Uppercase: " + str.toUpperCase());
        System.out.println("Lowercase: " + str.toLowerCase());

        // 8. Checking for Substring Presence
        System.out.println("Does the string contain 'Java'? " + str.contains("Java"));

        // 9. Trimming Leading and Trailing Whitespaces
        String strWithSpaces = "   Hello, Java!   ";
        System.out.println("Trimmed String: '" + strWithSpaces.trim() + "'");

        // 10. Splitting a String
        String sentence = "Java is fun";
        String[] words = sentence.split(" ");
        System.out.println("Words in the sentence: " + java.util.Arrays.toString(words));

        // 11. Replacing Characters or Substrings
        String replacedStr = str.replace("Java", "World");
        System.out.println("Replaced String: " + replacedStr);

        // 12. Extracting Substrings
        System.out.println("Substring (7, 11): " + str.substring(7, 11));

        // 13. Converting String to Character Array
        char[] charArray = str.toCharArray();
        System.out.println("Character Array: " + java.util.Arrays.toString(charArray));

        // 14. Checking if a String is Empty or Null
        String emptyStr = "";
        System.out.println("Is str empty? " + str.isEmpty());
        System.out.println("Is emptyStr empty? " + emptyStr.isEmpty());

        // 15. String Formatting
        String formattedStr = String.format("Hello, %s! You are %d years old.", "John", 25);
        System.out.println("Formatted String: " + formattedStr);

        // 16. String Search (Index of, Last Index of)
        System.out.println("Index of 'Java': " + str.indexOf("Java"));
        System.out.println("Last index of 'a': " + str.lastIndexOf("a"));

        // 17. Removing Specific Characters
        String withoutJava = str.replace("Java", "");
        System.out.println("String without 'Java': " + withoutJava);

        // 18. Converting String to Integer/Other Data Types
        String numberStr = "100";
        int num = Integer.parseInt(numberStr);
        System.out.println("Converted to integer: " + num);
    }
}
