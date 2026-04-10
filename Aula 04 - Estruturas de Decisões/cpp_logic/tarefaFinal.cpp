#include <iostream>
#include <string>
using namespace std;

int main() {

    string nome_do_produto;
    int quantidade_em_estoque;
    double preco_unitario;

    // Entrada de dados
    cout << "Digite o nome do produto: "; << cin, nome_do_produto;

    cout << "Digite a quantidade em estoque: ";
    cin >> quantidade_em_estoque;

    cout << "Digite o preco unitario: ";
    cin >> preco_unitario;

    if (quantidade_em_estoque < 0) {
        cout << "Erro: A quantidade nao pode ser um valor negativo. Por favor, tente novamente." << endl;
    } else {
        cout <<"\nNome: " << nome_do_produto << endl;
        cout << "Quantidade em estoque: " << quantidade_em_estoque << endl;
        cout << "Preco unitario: R$ " << preco_unitario << endl;
    }

    return 0;
}