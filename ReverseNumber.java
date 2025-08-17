import java.util.Scanner;

public class ReverseNumber {
    int number;

    public ReverseNumber() {
    }

    public ReverseNumber(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getReverseNumber() {
        int reverseNumber = 0;
        int temp = number;
        while (temp != 0) {
            reverseNumber = reverseNumber * 10 + temp % 10;
            temp /= 10;
        }
        return reverseNumber;
    }

    public static void main(String[] args) {
        ReverseNumber checkNumber = new ReverseNumber();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int a = scanner.nextInt();
        checkNumber.setNumber(a);

        System.out.println("Original Number: " + checkNumber.getNumber());
        System.out.println("Reversed Number: " + checkNumber.getReverseNumber());

        scanner.close();
    }
}
