public class PerfectNumber {
    private int number;

    public PerfectNumber() {
    }

    public PerfectNumber(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    // Method to check if number is perfect
    public boolean isPerfect() {
        int sum = 0;
        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                sum += i;
            }
        }
        return (sum == number);
    }

    // Main method
    public static void main(String[] args) {
        PerfectNumber checkNumber = new PerfectNumber();

        // Check perfect numbers from 1 to 10000
        for (int i = 1; i <= 10000; i++) {
            checkNumber.setNumber(i);
            if (checkNumber.isPerfect()) {
                System.out.println(i + " is a perfect number");
            }
        }
    }
}
