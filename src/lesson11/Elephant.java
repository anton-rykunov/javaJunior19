package lesson11;

public class Elephant implements ZooAnimal {


    @Override
    public void voice() {
        System.out.println("Fuuuuu");
    }

    @Override
    public void jump() {
        System.out.println("Elephant jump");
    }

    @Override
    public void run() {
        System.out.println("Elephant run");
    }
}
