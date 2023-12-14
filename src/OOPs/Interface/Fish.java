package OOPs.Interface;

public class Fish implements Prey, Predator {

    @Override
    public void hunt() {
        System.out.println("Fish also hunts");
    }

    @Override
    public void flee() {
        System.out.println("Fish also flee");
    }
}
