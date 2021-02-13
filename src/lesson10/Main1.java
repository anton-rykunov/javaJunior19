package lesson10;

public class Main1 {
    public static void main(String[] args) {
        Treugolnik figure = new Treugolnik();
        figure.setA(3);
        figure.setB(5);
        figure.setC(7);
        int perimetrFigure = figure.perimetr();

        Treugolnik figure1 = new Treugolnik(3, 6, 8);
        int perimetrFigure1 = figure1.perimetr();
        System.out.println(perimetrFigure);
        System.out.println(perimetrFigure1);
    }
}
