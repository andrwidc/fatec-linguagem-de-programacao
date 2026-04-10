#include <iostream>
#include <vector>
using namespace std;

int main() {
    vector<string> nomes;
    vector<int> quantidades;
    vector<double> precos;

    int opcao;

    while (true) {
        cout << "\n1 - Adicionar novo produto\n";
        cout << "2 - Listar produtos\n";
        cout << "3 - Sair\n";
        cout << "Escolha uma opcao: ";
        cin >> opcao;

        if (opcao == 1) {
            string nome;
            int quantidade;
            double preco;

            cout << "Nome do produto: ";
            cin >> nome;

            cout << "Quantidade em estoque: ";
            cin >> quantidade;

            cout << "Preco unitario: ";
            cin >> preco;

            if (quantidade < 0) {
                cout << "Erro: quantidade nao pode ser negativa.\n";
            } else {
                nomes.push_back(nome);
                quantidades.push_back(quantidade);
                precos.push_back(preco);
                cout << "Produto adicionado!\n";
            }

        } else if (opcao == 2) {
            cout << "\n=== Produtos em estoque ===\n";
            for (int i = 0; i < nomes.size(); i++) {
                cout << "Nome: " << nomes[i] << endl;
                cout << "Quantidade: " << quantidades[i] << endl;
                cout << "Preco: " << precos[i] << endl;
                cout << "-------------------\n";
            }

        } else if (opcao == 3) {
            cout << "Saindo...\n";
            break;

        } else {
            cout << "Opcao invalida.\n";
        }
    }

    return 0;
}