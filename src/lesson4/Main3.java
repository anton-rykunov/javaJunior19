package lesson4;

public class Main3 {
    public static void main(String[] args) {
        String text = "I am programmer!";
        String[] parts = text.split(" ");
        for(int i = 0; i < parts.length; i++ )
            System.out.println(parts[i]);

    }
}
