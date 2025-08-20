public class Power {
    private int base;
    private int exponent;

    public void setbase(int base) {
        this.base = base;
    }

    public void setexponent(int exponent) {
        this.exponent = exponent;
    }

    public int getbase() {
        return base;
    }

    public int getexponent() {
        return exponent;
    }

    public int calculatePower() {
        int power = 1;
        for (int i = 1; i <= exponent; i++) {
            power *= base;
        }
        return power;
    }

    public static void main(String[] args) {
        Power power = new Power();
        power.setbase(10);
        power.setexponent(2);

        int tempPower = power.calculatePower();
        System.out.println(power.getbase() + " ^ " + power.getexponent() + " = " + tempPower);
    }
}


