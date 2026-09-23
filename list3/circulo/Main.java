package circulo;

public class Main {
 
    public static void main(String[] args) {
        circulo c = new circulo(9); 
        // executa this.raio = raio, o c = raio

        double area = c.calcArea();

        System.err.println("area: "+area);
    }
}
