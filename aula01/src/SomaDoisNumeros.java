import java.util.Scanner;

public class SomaDoisNumeros {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        int numero1 = teclado.nextInt();

        System.out.print("Digite o segundo número: ");
        int numero2 = teclado.nextInt();

        int soma = numero1 + numero2;

        System.out.println("A soma é: " + soma);
    }
}
