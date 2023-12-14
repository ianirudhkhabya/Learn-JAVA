package OOPs.Polymorphism;

public class Main {
//     polymorphism -> greek word for poly-"many", morph-"form"
//                     The ability of an object to identify as more than one type

    public static void main(String[] args) {

        Car car = new Car();
        Bicycle bicycle = new Bicycle();
        Boat boat = new Boat();

        Vehicle[] racers = {car, bicycle, boat};

        for( Vehicle x : racers){
            x.go();
        }
    }
    // Our car does identify as car but also identifies as vehicle,
    // same thing can be said with our bicycle and our boat.
    // But not only that all objects are children classes of the object class,
    // so they also identify as objects so u could write this using Object data-type.

}
