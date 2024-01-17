import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int numero = input.nextInt();

        if (numero < 0) {
            System.out.print("O número " + numero + " é negativo");
        } else if (numero > 0) {
            System.out.print("O número " + numero + " 5é positivo");
        } else {
            System.out.print("Este número é zero");
        }

        if (numero % 2 != 0) {
            System.out.println(" e também é ímpar.");
        } else {
            System.out.println(" e também é par.");
        }

        input.close();
    }
}