#include <iostream>
#include <iomanip>
using namespace std;

int main() {
    int numero1 = 0, numero2 = 0, soma, subtracao, multiplicacao;
    float divisao;

    cout << "Digite o primeiro número: "; cin >> numero1;
    cout << "Digite o segundo número: "; cin >> numero2;

    soma = numero1+numero2;
    subtracao = numero1-numero2;
    multiplicacao = numero1*numero2;
    divisao = numero1/numero2;

    cout << fixed << setprecision(2);
    cout << "Soma: " << soma << endl;
    cout << "Subtração: " << subtracao << endl;
    cout << "Multiplicação: " << multiplicacao << endl;
    cout << "Divisão: " << divisao << endl;
    
    return 0;
}