package exercicios;

import java.util.Scanner;

public class Ex8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Selecione uma opção: \n 1 - Fahrenheit para Celsius \n 2 - Celsius para Fahrenheit");
        int opcao = in.nextInt();
        System.out.println("Insira o valor que deseja converter:");
        double valor = in.nextDouble();
        double resultado = 0;

        switch (opcao) {
            case 1:
                resultado = (valor - 32) * 5 / 9;
                System.out.println(valor + "°F é igual a " + resultado + "°C");
                break;
            case 2:
                resultado = valor * 9 / 5 + 32;
                System.out.println(valor + "°C é igual a " + resultado + "°F");
                break;
            default:
                System.out.println("Opção inválida");
                break;
        }
    }

}
