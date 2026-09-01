package beecrowd;

import java.util.Scanner;

public class led {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] leds = {6, 2, 5, 5, 4, 5, 6, 3, 7, 6};

        int N = sc.nextInt();

        for (int i = 0; i < N; i++) {
            String numero = sc.next();

            int total = 0;

            for (int j = 0; j < numero.length(); j++) {
                int digito = numero.charAt(j) - '0';

                total += leds[digito];
            }

            System.out.println(total +" leds");
        }

        sc.close();
    }
}
