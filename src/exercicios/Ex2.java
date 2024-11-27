package exercicios;
import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        System.out.println("Digite o primeiro valor");
        float valor1 = in.nextInt();
        System.out.println("Digite o segundo valor");
        float valor2 = in.nextInt();
        System.out.println("Digite qual operação deseja realizar \n 1 - Soma \n 2 - Subtração \n 3 - Multiplicação \n 4 - Divisão");
        int operacao = in.nextInt();

        switch (operacao) {
            case 1:
                System.out.println("A soma dos valores é: " + (valor1 + valor2));
                break;
            case 2:
                System.out.println("A subtração dos valores é: " + (valor1 - valor2));
                break;
            case 3:
                System.out.println("A multiplicação dos valores é: " + (valor1 * valor2));
                break;
            case 4:
                System.out.println("A divisão dos valores é: " + (valor1 / valor2));
                break;
            default:
                System.out.println("Operação invalida");
                break;
        }
        in.close();
    }
}

