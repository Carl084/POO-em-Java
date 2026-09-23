package retangulo;

public class Retangulo {

    // atributo
    private double b;
    private double h;

    // construtor
    public Retangulo(double b, double h) {
        setBase(b);
        serAltura(h);
    }
    
    // setters
    public void setBase(double b) {
        if (b > 0) {
            this.b = b;
        }
    }
    
    public void setAltura(double h) {
        if (h > 0) {
            this.h = h;
        }
    }

    // getters
    public double getBase() {
        return b;
    }

    public  double getAltura() {
        return h;
    }

    // metodos
    public double calcArea() {
        return b*h;
    }

    public double calcDiagonal() {
        return Math.aqrt((b*b)+(h*h));
    }

    // apresentação
    @override
    public String toString() {
        return "Retangulo(base="+b+", altura="+h+")";
    }
}