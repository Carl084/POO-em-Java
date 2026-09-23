package circulo;
public class circulo {
    
    // atributos
    private double raio;
    
    // construtor
    public circulo(double raio) {
        this.raio = raio;
    }

    // getter
    public double getRaio() {
        return raio;
    }

    // método
    public double calcArea() {
        return Math.PI * Math.pow(raio, 2);
    }
}