

public class Factorial {
    int number;

    public Factorial() {
    }

    public Factorial(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public long calculateFactorial() {
        long fact = 1;
        for (int i = 1; i <= number; i++) {
            fact *= i;
        }
        return fact;
    }
    public static void main(String[] args) {
        Factorial f = new Factorial(5); 
        System.out.println("Factorial of " + f.getNumber() + " = " + f.calculateFactorial());
    }
}
