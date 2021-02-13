package lesson11;

import java.util.Objects;

public class Animals {
    private int age;
    private String nickname;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }
    public void voice(){
        System.out.println("мяу-мяу-мяу");
    }

    public Animals() {

    }

    public Animals(int age, String nickname) {
        this.age = age;
        this.nickname = nickname;
    }

    public Animals(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Animals{" +
                "age=" + age +
                ", nickname='" + nickname + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Animals animals = (Animals) o;
        return age == animals.age && Objects.equals(nickname, animals.nickname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(age, nickname);
    }
}
