import java.util.Scanner;

public class main {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            float[] notas = new float[4]; // Declaração de um vetor de quatro posições.
            float media = 0;

            System.out.println("*******************************");
            System.out.println("Calculador de média escolar");
            System.out.println("*******************************");

            for (int i = 0; i < 4; i++) {
                System.out.println("Digite a nota " + (i + 1) + ":");
                notas[i] = scanner.nextFloat();
            }

            // cálculo para calcular a média das notas.
            for (int i = 0; i < 4; i++) {
                media += notas[i];
            }

            media /= 4;

            System.out.printf("A média é de: %.2f\n", media);
            System.out.println("*******************************");
        }
}


