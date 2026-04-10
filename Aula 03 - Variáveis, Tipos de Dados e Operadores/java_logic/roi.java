
import java.util.Locale;
import java.util.Scanner;

public class roi {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("--- Calculadora (Java ---)");

            System.out.print("Digite o ganho obtido: ");
            double ganho = sc.nextDouble();

            System.out.print("Digite o valor do investimento: ");
            double investimento = sc.nextDouble();

            if (investimento == 0) {
                System.out.println("Erro: investimento não pode ser 0.");
            } else {
                double roi = (ganho - investimento) / investimento;
                System.out.println("ROI: " + roi + " (" + (roi * 100) + "%)");
            }

            sc.close();
        }
    }
}
