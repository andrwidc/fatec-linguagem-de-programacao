#include <iostream>
#include <iomanip>
using namespace std;

int main() {
    double ganho, investimento;

    cout << "Digite o ganho obtido: "; cin >> ganho;
    cout << "Digite o valor do investimento: "; cin >> investimento;

    if (investimento == 0) {
        cout << "Erro: investimento não pode ser 0." << endl;
    } else {
        double roi = (ganho - investimento) / investimento;
        cout << "ROI: " << roi << " (" << roi * 100 << "%)" << endl;
    }

    return 0;
}