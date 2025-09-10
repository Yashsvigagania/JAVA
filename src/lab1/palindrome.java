package lab1;

public class palindrome {
    public static boolean isPalindrome(String text) {
        int left = 0;
        int right = text.length() - 1;

        while (left < right) {
            if (text.charAt(left) != text.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    public static void main(String[] args) {
        String text1 = "java";
        String text2 = "hello";
        String text3="level";
        System.out.println(text1 + " is a palindrome: " + isPalindrome(text1));
        System.out.println(text2 + " is a palindrome: " + isPalindrome(text2));
        System.out.println(text3 + " is a palindrome: " + isPalindrome(text3));
    }
}
