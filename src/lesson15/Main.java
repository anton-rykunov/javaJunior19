package lesson15;

public class Main {
    public static void main(String[] args) {
        Person person = new Person();
        try {
            person.setAge(-10);
            System.out.println("!!!");
        } catch (UncurrgjentAgeException e) {
            e.printStackTrace();
        }
        System.out.println("OK");
    }
}
