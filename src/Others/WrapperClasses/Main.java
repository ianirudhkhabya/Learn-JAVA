package Others.WrapperClasses;

public class Main {
    // Wrapper Class -> provides a way to use primitive data types as reference data types
    //                  reference data types contain useful methods
    //                  can be used with collections (ex. ArrayList)

    // primitive    |   Wrapper
    // -------------|--------------
    // boolean      |   Boolean
    // char         |   Character
    // int          |   Integer
    // double       |   Double

    // autoboxing -> the automatic conversion that the java compiler makes between the primitive types and their corresponding object wrapper classes
    // unboxing -> the reverse of autoboxing. Automatic conversion of Wrapper class to primitive

    public static void main(String[] args) {
        Boolean a = true;
        Character b = '@';
        Integer i = 234;
        Double d = 5.567;
        String s = "Ani";

        // here wrapper class automatically converted to primitive i.e. unboxing
        if (a) {
            System.out.println("This is correct");
        }
        if (b == '@') {
            System.out.println("This is correct");
        }
    }
}
