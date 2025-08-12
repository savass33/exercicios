package iniciante;

import java.util.Scanner;

public class iniciante_1146 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int X = teclado.nextInt();
        do {
            for (int i = 1; i <= X; i++) {
                System.out.print(i + " ");
            }

            X = teclado.nextInt();
        } while (X != 0);
    }
}