package lesson10.Homework;

public class MainHomework {
    public static void main(String[] args) {
        Square figure = new Square();
        figure.setA(4);
        figure.setB(4);
        figure.setD(4);
        figure.setC(4);

        Square figure1 = new Square(6);
        System.out.println("Стороны первого квадрата равны: " + figure.getA() + " " + figure.getB() + " " + figure.getC() + " " + figure.getD());
        System.out.println("Стороны второго квадрата равны: " + figure1.getA() + " " + figure1.getB() + " " + figure1.getC() + " " + figure1.getD());
        System.out.println("Периметр первого квадрата равен: " + figure.perimetr());
        System.out.println("Периметр второго квадрата равен: " + figure1.perimetr());
        System.out.println("Площадь первого квадрата равна: " + figure.square());
        System.out.println("Площадь второго квадрата равна: " + figure1.square());
        System.out.println();

        Rectangle figure2 = new Rectangle();
        figure2.setA(4);
        figure2.setB(6);
        figure2.setC(4);
        figure2.setD(6);

        Rectangle figure3 = new Rectangle(5, 7);
        System.out.println("Стороны первого примоугольника равны: " + figure2.getA() + " " + figure2.getB() + " " + figure2.getC() + " " + figure2.getD());
        System.out.println("Стороны второго примоугольника равны: " + figure3.getA() + " " + figure3.getB() + " " + figure3.getC() + " " + figure3.getD());
        System.out.println("Периметр первого примоугольника равен: " + figure2.perimetr());
        System.out.println("Периметр второго примоугольника равен: " + figure3.perimetr());
        System.out.println("Площадь первого примоугольника равна: " + figure2.square());
        System.out.println("Площадь второго примоугольника равна: " + figure3.square());
        System.out.println();

        Circle figure4 = new Circle(6);
        System.out.println("Радиус окружности равен: " + figure4.getR());
        System.out.println("Длинна окружности равна: " + figure4.length());
        System.out.println("Площадь окружности равна: " + Math.round(figure4.square()));
    }
}
