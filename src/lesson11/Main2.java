package lesson11;

public class Main2 {
    public static void main(String[] args) {
        Elephant elephant = new Elephant();
        Elephant elephant1 = new Elephant();
        Elephant elephant2 = new Elephant();

        Mancey mancey = new Mancey();
        Mancey mancey1 = new Mancey();
        Mancey mancey2 = new Mancey();

        ZooAnimal[] animals = new ZooAnimal[6];
        animals[0] = elephant;
        animals[1] = elephant1;
        animals[2] = mancey;
        animals[3] = elephant2;
        animals[4] = mancey1;
        animals[5] = mancey2;
        for (ZooAnimal carent:animals){
            carent.voice();// полиморфизм
        }
    }
}
