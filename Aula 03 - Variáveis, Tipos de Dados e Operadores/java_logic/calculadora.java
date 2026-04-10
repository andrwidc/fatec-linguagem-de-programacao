import java.util.Locale;
import java.util.Scanner;

public class calculadora {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("--- Calculadora (Java ---)");
            
            System.out.print( "Digite o primeiro número: ");
            double numero1 = sc.nextDouble();
            
            System.out.print( "Digite o segundo número: ");
            double numero2 = sc.nextDouble();
            
            double soma = numero1 + numero2;
            double subtracao = numero1 - numero2;
            double multiplicacao = numero1 * numero2;
            double divisao = numero1 / numero2;
            
            System.out.printf("Soma: %.2f%n", soma);
            System.out.printf("Subtração: %.2f%n", subtracao);
            System.out.printf("Multiplicação: %.2f%n", multiplicacao);
            System.out.printf("Divisão: %.2f%n", divisao);
        }
    }
}
