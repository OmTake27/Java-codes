class TypeCasting {   // removed 'public' to keep everything in one file
    float number;
    char charVariable;
    
    // Widening: int -> float
    public void widening(int number) {
        this.number = number; 
    }
    
    // Narrowing: byte -> char
    public void narrowingToChar(byte byteVariable) {
        this.charVariable = (char) byteVariable; 
    }
    
    public float getNumber() {
        return number;
    }
    
    public char getCharVariable() {
        return charVariable;
    }



    public static void main(String[] args) {
        TypeCasting typeCasting = new TypeCasting();
        
        int number = 10; 
        byte byteVariable = 65;  // ASCII of 'A'
        
        // Widening (int -> float)
        typeCasting.widening(number);
        
        // Narrowing (byte -> char)
        typeCasting.narrowingToChar(byteVariable);
        
        System.out.println(typeCasting.getNumber());      // prints 10.0
        System.out.println(typeCasting.getCharVariable()); // prints A
    }

}