package iniciante;

public class iniciante_1097 {
    public static void main(String[] args) {
        int j = 7;
        for (int i = 1; i < 10; i++) {
            if (i % 2 != 0) {
                System.out.printf("I=%d J=%d\n", i, j);
                System.out.printf("I=%d J=%d\n", i, j - 1);
                System.out.printf("I=%d J=%d\n", i, j - 2);
                j+=2;
            }
        }
    }
}
