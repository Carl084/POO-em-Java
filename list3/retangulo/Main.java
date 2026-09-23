package retangulo;

public class Main {
    public static void main(String[] args) {
        Retangulo r = new Retangulo(10,5);

        System.out.println("Base: "+r.getBase());
        System.out.println("Altura: "+r.getAltura());

        System.out.println("Área: "+r.calcArea());

        System.out.println("Diagonal: "+r.calcDiagonal());
    }
}
