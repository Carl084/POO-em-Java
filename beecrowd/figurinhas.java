package beecrowd;

import java.util.Scanner;

public class figurinhas {
 
    static int mdc(int a, int b) {
        while (b != 0) {
            int temp = a % b;
            a = b;
            b = temp;
        }
        return a;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        for (int i = 0; i < N; i++) {
            int F1 = sc.nextInt();
            int F2 = sc.nextInt();

            System.out.println(mdc(F1, F2));
        }

        sc.close();
    }
 
}