package lesson11;

public class Mancey implements ZooAnimal{
    @Override
    public void voice() {
        System.out.println("uuuuuuu");
    }

    @Override
    public void jump() {
        System.out.println("Moncey jump");

    }

    @Override
    public void run() {
        System.out.println("Moncey run");
    }
}
