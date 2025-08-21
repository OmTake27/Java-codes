public class DigitCounter {

    private int getNoOfDigits(int number) {
        if (number == 0) {
            return 1; 
        }
        number = Math.abs(number); 
        int digits = 0;
        while (number != 0) {
            digits++;
            number /= 10;
        }
        return digits;
    }

    public static void main(String[] args) {
        DigitCounter dc = new DigitCounter();

        System.out.println("Digits in 0: " + dc.getNoOfDigits(0));
        System.out.println("Digits in 12345: " + dc.getNoOfDigits(12345));
        System.out.println("Digits in -999: " + dc.getNoOfDigits(-999));
        System.out.println("Digits in 987654321: " + dc.getNoOfDigits(987654321));
    }
}

