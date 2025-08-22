import java.util.Scanner;

public class ArmstrongNumber {
    private int number;

    public ArmstrongNumber(int number) {
        this.number = number;
    }

    public boolean isArmstrong() {
        int temp = number;
        int armstrongNumber = 0;
        int digits = String.valueOf(temp).length(); // count digits

        while (temp != 0) {
            int digit = temp % 10;
            armstrongNumber += Math.pow(digit, digits);
            temp /= 10;
        }

        return number == armstrongNumber;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        ArmstrongNumber obj = new ArmstrongNumber(num);
        if (obj.isArmstrong()) {
            System.out.println(num + " is an Armstrong number.");
        } else {
            System.out.println(num + " is not an Armstrong number.");
        }
        sc.close();
    }
}
