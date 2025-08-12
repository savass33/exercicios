package iniciante;

import java.util.Scanner;

public class iniciante_1564 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNext()) {
            int reclamacoes = sc.nextInt();
            if (reclamacoes == 0) {
                System.out.println("vai ter copa!");
            } else {
                System.out.println("vai ter duas!");
            }
        }
    }
}
