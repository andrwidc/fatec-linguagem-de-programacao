import java.util.ArrayList;
import java.util.Scanner;

public class MenuProdutos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<String> nomes = new ArrayList<>();
        ArrayList<Integer> quantidades = new ArrayList<>();
        ArrayList<Double> precos = new ArrayList<>();

        int opcao = 0;

        while (true) {
            System.out.println("\n1 - Adicionar novo produto");
            System.out.println("2 - Listar produtos");
            System.out.println("3 - Sair");
            System.out.print("Escolha uma opcao: ");
            opcao = sc.nextInt();

            if (opcao == 1) {
                sc.nextLine(); // limpar buffer

                System.out.print("Nome do produto: ");
                String nome = sc.nextLine();

                System.out.print("Quantidade em estoque: ");
                int quantidade = sc.nextInt();

                System.out.print("Preco unitario: ");
                double preco = sc.nextDouble();

                if (quantidade < 0) {
                    System.out.println("Erro: quantidade nao pode ser negativa.");
                } else {
                    nomes.add(nome);
                    quantidades.add(quantidade);
                    precos.add(preco);
                    System.out.println("Produto adicionado!");
                }

            } else if (opcao == 2) {
                System.out.println("\n=== Produtos em estoque ===");
                for (int i = 0; i < nomes.size(); i++) {
                    System.out.println("Nome: " + nomes.get(i));
                    System.out.println("Quantidade: " + quantidades.get(i));
                    System.out.println("Preco: " + precos.get(i));
                    System.out.println("-------------------");
                }

            } else if (opcao == 3) {
                System.out.println("Saindo...");
                break;

            } else {
                System.out.println("Opcao invalida.");
            }
        }

        sc.close();
    }
}