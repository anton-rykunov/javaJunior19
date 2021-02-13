package lesson10.Homework;

public class Square {

    private int a;
    private int b;
    private int c;
    private int d;

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public int getC() {
        return c;
    }

    public void setC(int c) {
        this.c = c;
    }

    public int getD() {
        return d;
    }

    public void setD(int d) {
        this.d = d;
    }

    public Square(){
    }

    public Square(int numb){
        this.a = numb;
        this.b = numb;
        this.c = numb;
        this.d = numb;
    }

    public int perimetr(){
        return 4 * a;
    }

    public int square(){
        return a * a;
    }
}
