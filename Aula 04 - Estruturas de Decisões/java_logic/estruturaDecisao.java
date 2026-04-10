import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int quantidade = scanner.nextInt();

        if(quantidade < 1) {
            System.out.println("STATUS: Em Falta.");
        } else if(quantidade<5) {
            System.out.println("Status: Alerta de estoque baixo.");
        } else {
            System.out.println("STATUS: Estoque OK.")
        }

        scanner.close();

    }
}