package exercicios;

import java.util.Scanner;

public class Ex6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(
                "Digite o valor da Bebida que deseja: \n 1 - Café \n 2 - Chá \n 3 - Suco \n 4 - Refrigerante \n 0 - cancelar");
        int escolha = in.nextInt();

        switch (escolha) {
            case 1:
                System.out.println("Escolheu Café");
                break;
            case 2:
                System.out.println("Escolheu Chá");
                break;
            case 3:
                System.out.println("Escolheu Suco");
                break;
            case 4:
                System.out.println("Escolheu Refrigerante");
                break;
            case 0:
                System.out.println("Cancelou a compra");
                break;
            default:
                System.out.println("Opção invalida");
                break;
        }

    }

}
