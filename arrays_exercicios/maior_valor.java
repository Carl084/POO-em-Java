package arrays_exercicios;

public class maior_valor {
    public static void main(String[] args) {
        int[] valores = {2, 4, 6, 8};

        int maior = 0;

        for (int valor : valores) {
            if (valor > maior) {
                maior = valor;
            }
        }

        System.out.println("Maior valor = "+ maior);
    }
}
