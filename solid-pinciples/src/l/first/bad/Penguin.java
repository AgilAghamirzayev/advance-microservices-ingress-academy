package l.first.bad;

public class Penguin implements Bird {

    @Override
    public void eat() {
        System.out.println("Can I eat taco?");
    }

    @Override
    public void fly() {
        throw new UnsupportedOperationException("Help! I cannot fly!");
    }
}