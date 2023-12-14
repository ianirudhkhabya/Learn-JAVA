package Others.Generics;

public class AnotherPrinter<T, U> {
    T total;
    U name;

    public AnotherPrinter(T total, U yourName) {
        this.total = total;
        this.name = yourName;
    }

    public void print() {
        System.out.println("Sum is " + total + " and is calculated by " + name);
    }
}
