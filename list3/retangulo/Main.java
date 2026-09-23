package retangulo;

public class Main {
    public static void main(String[] args) {
        Retangulo r = new Retangulo(10,5);

        double area = r.calcArea();

        System.err.println("Area: "+area);
    }
}
