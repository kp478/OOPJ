public class Widening_Conversion {
    public static void main(String[] args) {
        int intValue = 42;

        double doubleValue = intValue; // Widening to double
        float floatValue = intValue; // Widening to float
        boolean booleanValue = (intValue != 0); // Widening to boolean
        String stringValue = String.valueOf(intValue); // Widening to String

        System.out.println("Double value: " + doubleValue);
        System.out.println("Float value: " + floatValue);
        System.out.println("Boolean value: " + booleanValue);
        System.out.println("String value: " + stringValue);
    }
}
