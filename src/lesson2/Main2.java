package lesson2;

public class Main2 {
    public static void main(String[] args) {
        int mark = 1;
        switch (mark) {
            case 5:
                System.out.println("Молодец");
                break;
            case 4:
                System.out.println("Можно и лучше");
                break;
            case 3:
                System.out.println("Еща ра попоробуй так сделать");
                break;
            case 2:
                System.out.println("Засранец");
                break;
            case 1:
                System.out.println("........");
                break;
            default:
                System.out.println("Это не оценка");
        }


    }
}
