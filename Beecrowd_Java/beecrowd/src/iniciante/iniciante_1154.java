package iniciante;

import java.util.Scanner;

public class iniciante_1154 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double idade = sc.nextDouble();
        double soma = 0;
        double cont = 0;
        while (idade > 0) {

            soma += idade;
            cont++;

            idade = sc.nextDouble();
        }
        double resultado = soma / cont;
        System.out.printf("%.2f", resultado);
    }
}
