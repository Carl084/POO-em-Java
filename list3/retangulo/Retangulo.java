package retangulo;

public class Retangulo {

    // atributo
    private double b;
    private double h;

    // construtor
    public Retangulo(double b, double h) {
        this.b = b;
        this.h = h;
    }

    // getter
    public double getBase() {
        return b;
    }

    public  double getAltura() {
        return h;
    }

    // metodo
    public double calcArea() {
        return b*h;
    }
}