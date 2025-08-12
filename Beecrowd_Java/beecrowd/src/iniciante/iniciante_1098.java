package iniciante;

public class iniciante_1098 {
    public static void main(String[] args) {
        for (double i = 0; i < 1.9; i += 0.2) {
            for (int j = 1; j <= 3; j++) {
                double valorJ = j + i;

                // Se for inteiro, imprime sem casas decimais
                if (i % 1 == 0 && valorJ % 1 == 0) {
                    System.out.printf("I=%.0f J=%.0f\n", i, valorJ);
                } else {
                    System.out.printf("I=%.1f J=%.1f\n", i, valorJ);
                }
            }
        }
        System.out.println("I=2 J=3");
        System.out.println("I=2 J=4");
        System.out.println("I=2 J=5");
    }
}
