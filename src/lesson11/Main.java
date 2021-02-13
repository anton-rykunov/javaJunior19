package lesson11;

public class Main {
    public static void main(String[] args) {
        Animals animal = new Animals(35, "Слон");
        System.out.println(animal);
        Animals animal1 = new Animals(35, "Слон");
        boolean equalsAnimal = animal.equals(animal1);
        System.out.println(equalsAnimal);
        Elefant animal3 = new Elefant();
        animal3.voice();

    }
}
