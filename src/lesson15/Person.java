package lesson15;

public class Person {
    private int age;
    private String name;

    public void setAge(int age) throws UncurrgjentAgeException {
        if (age < 0 || age > 150) {
            throw new UncurrgjentAgeException("Возраст не мжет быть больше 150 иои меньше 0");
        }
        this.age = age;
    }
}
