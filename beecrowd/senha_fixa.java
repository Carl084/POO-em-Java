package beecrowd;

import java.util.Scanner;

public class senha_fixa {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int senha = 2002;
        
        while (true) {
            int entrada = scanner.nextInt();
            
            if (entrada == senha) {
                System.out.println("Acesso Permitido");
                break;
            } else {
                System.out.println("Senha Invalida");
                continue;
            }

        }
        scanner.close();
    }
}