import java.util.Random;

public class RandomExample {
    public static void main(String[] args) {
        Random rand = new Random();

        // Generate a random integer between 0 and 99
        int randomInt = rand.nextInt(100);
        System.out.println("Random Integer (0-99): " + randomInt);

        // Generate a random double between 0.0 and 1.0
        double randomDouble = rand.nextDouble();
        System.out.println("Random Double (0.0 - 1.0): " + randomDouble);

        // Generate a random boolean
        boolean randomBoolean = rand.nextBoolean();
        System.out.println("Random Boolean: " + randomBoolean);

        // Generate 5 random numbers between 1 and 10
        System.out.println("Five random numbers between 1 and 10:");
        for (int i = 0; i < 5; i++) {
            int num = rand.nextInt(10) + 1; // 1 to 10
            System.out.print(num + " ");
        }
    }
}
