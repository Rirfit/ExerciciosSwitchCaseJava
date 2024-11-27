package exercicios;

import java.util.Scanner;

public class Ex10 {
      public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número inteiro para calcular o fatorial: ");
        int numero = scanner.nextInt();
        
        long fatorial = 1;

        switch (numero) {
            case 0:
                fatorial = 1;
                break;
            default:
                if (numero < 0) {
                    
                    System.out.println("Fatorial não existe para números negativos.");
                    return; 
                } else {
                    
                    for (int i = 1; i <= numero; i++) {
                        fatorial *= i;
                    }
                }
        }
        
        System.out.println("O fatorial de " + numero + " é: " + fatorial);
    
    }

}
