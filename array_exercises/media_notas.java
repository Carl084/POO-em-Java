package array_exercises;

public class media_notas {
    public static void main(String[] args) {
        double[] notas = {2, 4, 6, 8};

        double soma = 0;

        for (double nota : notas) {
            soma += nota;
        }

        double resultado = soma/notas.length;
        
        System.out.println("Média = "+ resultado);
    }
}
