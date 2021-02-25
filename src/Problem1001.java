import java.util.Scanner;

public class Problem1001 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o primeiro número: ");
        int x1 = scanner.nextInt();
        System.out.println("Digite o segundo número");
        int x2 = scanner.nextInt();
        int soma = x1 + x2;
        System.out.println("X = " + soma);

    }
}
