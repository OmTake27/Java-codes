public class PalindromeNumber {
    private int number;

    // Default constructor
    public PalindromeNumber() {
    }

    // Parameterized constructor
    public PalindromeNumber(int number) {
        this.number = number;
    }

    // Getter
    public int getNumber() {
        return number;
    }

    // Setter
    public void setNumber(int number) {
        this.number = number;
    }

    // Palindrome check (basic logic)
    public boolean isPalindrome() {
        int original = number;
        int reverse = 0;
        int temp = number;

        while (temp != 0) {
            reverse = reverse * 10 + temp % 10;
            temp /= 10;
        }

        return original == reverse;
    }

    // Main method for testing
    public static void main(String[] args) {
        PalindromeNumber pn = new PalindromeNumber();

        // Test with 152
        pn.setNumber(152);
        if (pn.isPalindrome())
            System.out.println("152 is a palindrome number");
        else
            System.out.println("152 is not a palindrome number");

        System.out.println();

        // Test with 121
        pn.setNumber(121);
        if (pn.isPalindrome())
            System.out.println("121 is a palindrome number");
        else
            System.out.println("121 is not a palindrome number");
    }
}
