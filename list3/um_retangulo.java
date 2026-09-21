import java.util.Scanner;

public class um_retangulo {

    private double base; // base > 0.7
    private double altura; // altura > 0.5

    public um_retangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }
    //  public um_retangulo() {
    //      this.base = 1;
    //      this.altura = 1;
    //  }

    public double getBase {
        return base;
    }

    public void setBase(double base) {
        if (base > 0.0) {
            this.base = base;
        }
    }

    public double calcArea(double base, double altura) {
        return base * altura;
    }

    Scanner sc = new Scanner;

}