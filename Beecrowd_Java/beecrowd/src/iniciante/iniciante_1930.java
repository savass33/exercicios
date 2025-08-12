package iniciante;

import java.util.Scanner;

public class iniciante_1930 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int t1 = teclado.nextInt();
        int t2 = teclado.nextInt();
        int t3 = teclado.nextInt();
        int t4 = teclado.nextInt();

        int tomadasDisponivel = (t1 + t2 + t3 + t4) - 3;

        System.out.println(tomadasDisponivel);
    }
}
