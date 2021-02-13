package lesson10.Homework;

public class Rectangle {
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
        if (c != this.a) {
            System.out.println("Это не прямоугольник");
        } else {
            this.c = c;
        }
    }

    public int getD() {
        return d;
    }

    public void setD(int d) {
        if (d != this.b) {
            System.out.println("Это не прямоугольник");
        } else {
            this.d = d;
        }
    }
    public Rectangle(){
    }
    public Rectangle(int numb1, int numb2){
        this.a = this.c = numb1;
        this.b = this.d = numb2;
    }
    public int perimetr(){
        return 2 * a + 2 * b;
    }
    public int square(){
        return a * b;
    }
}

