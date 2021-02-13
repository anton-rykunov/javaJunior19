package lesson10;

public class Treugolnik {
    private int a;
    private int b;
    private int c;

    public Treugolnik() {

    }

    public Treugolnik(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public Treugolnik(int a) {
        this.a = a;
        this.b = a;
        this.c = a;
    }


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

    public int perimetr() {
        return a + b + c;
    }
}
