package exercicios;

import java.util.Scanner;

public class Ex7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Digite o seu sálario e receba um calculo informando o quanto deve pagar de imposto");
        double salario = in.nextDouble();
        double imposto = 0;
        switch ((salario <= 1500) ? 1 : (salario <= 3000) ? 2 : 3) {
            case 1:
                imposto = salario * 0.05;
                break;
            case 2:
                imposto = salario * 0.10;
                break;
            case 3:
                imposto = salario * 0.15;
                break;
            default:
                System.out.println("Salário invalido");
                break;

        }
        System.out.printf("O imposto a ser pago é: R$ %.2f%n",imposto);
    }

}
