import java.util.Scanner;

public class MaiorNumero {
    int num1;
    int num2;

    private static int maiorNumero(int num1, int num2) {
        return Math.max(num1, num2);
    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        int num1 = entrada.nextInt();
        System.out.print("Digite o segundo número: ");
        int num2 = entrada.nextInt();

        System.out.println("O maior número é: " + maiorNumero(num1, num2));
    }
}
