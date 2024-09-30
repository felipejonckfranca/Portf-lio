//Felipe Jonck França
#include <iostream>
#include "header.h"

using namespace std;

int main()
{
    FilaDuplamenteEncadeada<int> fila;
    cria(fila);

    int numcomeco;
    cout << "Ola, Bem vindo ao programa de filas de duas pontas. Digite o numero que deseja começar a lista:" << endl;
    cin >> numcomeco;

    insere(fila,numcomeco,4);

    cout << "Fila atualmente: " << endl;
    mostrar(fila);

    int priori;
    int valor;
    int rodada;
    bool fim = false;
    while(!fim){
        cout << "\n\nO que gostaria de fazer agora?"<<endl;
        cout << "1-adicionar\n2-remover\n3-verificar se elemento existe\n4-retirar elemento da fila\n5-sair"<<endl;
        cin >> rodada;
        if(rodada==1){
            cout << "digite o valor que quer adicionar:"<<endl;
            cin >> valor;
            cout << "digite a prioridade do valor: (1,2,3)"<<endl;
            cin >> priori;
            insere(fila,valor,priori);
        }else if(rodada == 2){
            if(fila.cardinalidade == 1){
                cout << "Não pode retirar o primeiro elemento"<<endl;
            }else{
                retirar(fila);
            }

        }else if(rodada == 3){
            cout << "digite o valor que quer verificar:"<<endl;
            cin >> valor;
            if(verificaelemento(fila,valor)==0){
                cout << "Nao" <<endl;
            }else if(verificaelemento(fila,valor)==1){
                cout << "Sim" <<endl;
            }
        }else if(rodada == 4){
            cout << "digite o valor que quer retirar:"<<endl;
            cin >> valor;
            if(fila.cardinalidade == 1){
                cout << "Não pode retirar o primeiro elemento"<<endl;
            }else{
                retiraelemento(fila,valor);
            }
        }else if(rodada == 5){
            fim = true;
        }
        cout << "\nFila atualmente: " << endl;
        mostrar(fila);
    }
}
