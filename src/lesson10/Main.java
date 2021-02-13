package lesson10;

public class Main {
    public static void main(String[] args) {
        People people1 = new People();
        people1.setName("Василий");
        People people2 = new People();
        people2.setName("Петр");
        people1.setAge(14);
        people2.setAge(15);
        int ageOfPeople1 = people1.getAge();
        int ageOfPeople2 = people2.getAge();
        System.out.println(ageOfPeople1 + " возраст Василия");
        System.out.println(ageOfPeople2 + " возраст Петра");
    }
}
