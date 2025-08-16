
class DefaultAccessModifiers {
    int number; 

    DefaultAccessModifiers() {
        super();
    }

    DefaultAccessModifiers(int number) {
        super();
        this.number = number;
    }

    int getNumber() {
        return number;
    }

    void setNumber(int number) {
        this.number = number;
    }
}

class TestDefaultAccessModifiers {
    DefaultAccessModifiers obj = new DefaultAccessModifiers(100);

    int getNumberFormDefaultClass() {
        return obj.getNumber(); 
    }
}

public class efaultAccessModifier {
    public static void main(String[] args) {
        TestDefaultAccessModifiers test = new TestDefaultAccessModifiers();
        System.out.println(test.getNumberFormDefaultClass());
    }
}
