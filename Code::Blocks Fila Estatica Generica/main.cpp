//Felipe Jonck França
#include <iostream>
#include "header.h"

using namespace std;

int main()
{

    FilaEstaticaGenerica<int,5> fila;

    cria(fila);

    int numcomeco;
    cout << "Ola, Bem vindo ao programa de filas de duas pontas. Digite o numero que deseja começar a lista:" << endl;
    cin >> numcomeco;

    inserefim(fila,numcomeco);

    cout << "Fila atualmente: " << endl;
    mostra(fila);

    int valor;
    int rodada;
    bool fim = false;
    while(!fim){
        cout << "\n\nO que gostaria de fazer agora?"<<endl;
        cout << "1-adicionar no inicio\n2-adicionar no final\n3-remover do inicio\n4-remover do final\n5-sair"<<endl;
        cin >> rodada;
        if(rodada==1){
            cout << "digite o valor que quer adicionar:"<<endl;
            cin >> valor;
            inserecomeco(fila,valor);
        }else if(rodada == 2){
            cout << "digite o valor que quer adicionar:"<<endl;
            cin >> valor;
            inserefim(fila,valor);
        }else if(rodada == 3){
            retiracomeco(fila);
        }else if(rodada == 4){
            retirafim(fila);
        }else if(rodada == 5){
            fim = true;
        }
        cout << "\nFila atualmente: " << endl;
        mostra(fila);
    }


}
