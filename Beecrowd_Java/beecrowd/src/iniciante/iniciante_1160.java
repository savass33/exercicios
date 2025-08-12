package iniciante;

import java.util.Scanner;

public class iniciante_1160 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            int pa = sc.nextInt();
            int pb = sc.nextInt();
            double g1 = sc.nextDouble();
            double g2 = sc.nextDouble();

            int anos = 0;

            while (pa <= pb && anos <= 100) {
                pa += (int) (pa * (g1 / 100));
                pb += (int) (pb * (g2 / 100));
                anos++;
            }

            if (anos > 100) {
                System.out.println("Mais de 1 seculo.");
            } else {
                System.out.println(anos + " anos.");
            }
        }
        sc.close();
    }
}
