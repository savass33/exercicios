package iniciante;

import java.util.Scanner;

public class iniciante_1837 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int q = a / b;
        int r = a % b;

        if (r < 0) {
            if (b > 0) {
                q -= 1;
                r += b;
            } else {
                q += 1;
                r -= b;
            }
        }

        System.out.println(q + " " + r);
    }
}
