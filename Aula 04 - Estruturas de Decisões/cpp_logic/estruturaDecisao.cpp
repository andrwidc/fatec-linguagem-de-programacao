#include <iostream>
using namespace std;

int main() {
    int quantidade;
    cout << "Digite a quantidade em estoque: "; cin >> quantidade;

if(quantidade<1){
    cout << "Status: Em Falta." << endl;
} else if(quantidade < 5){
    cout << "Status Alerta de Estoque Baixo." << endl;
} else {
    cout << "Status: Estoque OK." << endl;
}
    return 0;
}