package exercicios;

import java.util.Scanner;

public class Ex9 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Informe a classificação indicativa a descubra a qual faixa etaria ela está ligada \n G \n PG \n PG-13 \n RG");
        String classificacao = in.nextLine();
        switch (classificacao) {
            case ("G"):
                System.out.println("Livre para todos os públicos");
                break;
                case ("PG"):
                System.out.println("Somente para maiores de 10 anos");
                break;
                case ("PG-13"):
                System.out.println("Somente para maiores de 13 anos");
                break;
                case ("R"):
                System.out.println("Somente para maiores de 18 anos");
                break;
            default:
            System.out.println("Classificação não encontrada");
                break;
        }
    }

}
