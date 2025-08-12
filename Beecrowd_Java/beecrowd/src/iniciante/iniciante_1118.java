package iniciante;

import java.util.Scanner;

public class iniciante_1118 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int opc = 1;

        double soma = 0;
        int notaValida = 0;

        while (opc == 1) {

            while (notaValida < 2) {
                double nota = sc.nextDouble();
                if (nota > 10 || nota < 0) {
                    System.out.println("nota invalida");
                } else {
                    soma += nota;
                    notaValida++;
                }
            }

            double media = soma / 2;
            System.out.printf("media = %.2f\n", media);

            soma = 0;
            notaValida = 0;

            System.out.println("novo calculo (1-sim 2-nao)");
            opc = sc.nextInt();
            while (opc != 1 && opc != 2) {
                System.out.println("novo calculo (1-sim 2-nao)");
                opc = sc.nextInt();
            }
        }
    }
}

