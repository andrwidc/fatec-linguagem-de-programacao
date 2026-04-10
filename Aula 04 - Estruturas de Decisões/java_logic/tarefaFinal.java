import java.util.Scanner;

public class estoque {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String nome_do_produto;
        int quantidade_em_estoque;
        double preco_unitario;

        System.out.print("Digite o nome do produto: ");
        nome_do_produto = scanner.nextLine();

        System.out.print("Digite a quantidade em estoque: ");
        quantidade_em_estoque = scanner.nextInt();

        System.out.print("Digite o preço unitário: ");
        preco_unitario = scanner.nextDouble();

        if (quantidade_em_estoque < 0) {
            System.out.println("Erro: A quantidade não pode ser um valor negativo. Por favor, tente novamente.");
        } else {
            System.out.println("\nNome: ", nome_do_produto);
            System.out.println("Quantidade em estoque: ", quantidade_em_estoque);
            System.out.println("Preço unitário: R$ ", preco_unitario);
        }

        scanner.close();
    }
}