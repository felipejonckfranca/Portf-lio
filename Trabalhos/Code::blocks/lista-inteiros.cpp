#include <iostream>
#include<string>

using namespace std;

const
int tamanho = 5;

struct Lista{
    int elementos[tamanho];
    int cardinalidade=0;
};

Lista l;



int main()
{
    int i;
    int numero;
    cout << "Lista de numeros!" << endl;

    //verifica se a lista esta vazia
    if(l.cardinalidade == 0){
        cout << "\nLista vazia" << endl;
    }

    //-----------------------------------------------------------------
    cout << "__________________________________________________________" << endl;

    for(i=0 ; i<5; i++){
        //insere um numero escolhido no primeiro espaço livre na lista
        cout << "\nEscreva um numero= ";
        cin >> numero;

        l.elementos[i] = numero;
        l.cardinalidade++;

        //verifica quantos espaços faltantes existem
        cout << "\nNumeros faltantes: " << (tamanho-l.cardinalidade) << endl;

        //verifica quantos elementos tem na lista
        cout << "Numero de elementos na lista: " << l.cardinalidade << endl;

    }

    //-----------------------------------------------------------------
    cout << "__________________________________________________________" << endl;


    cout << "\nSelecione um numero para verificar se ele está na lista= ";
    cin >> numero;

    //procura pelo numero escolhido na lista
    for(i = 0;i < tamanho; i++){
        int achou = 0;
        if(l.elementos[i] == numero){
            cout << "\nSim, o numero está na posição " << i << " da lista" << endl;
            achou = 1;
        }
        if(achou == 1){
            break;
        }

        if(i==tamanho-1){
            cout << "\nNão foi possivel encontrar o numero" << endl;
        }
    }

    //-----------------------------------------------------------------
    cout << "__________________________________________________________" << endl;

    cout << "\nSelecione uma posicao para saber se ela e valida= ";
    cin >> numero;

    //procura para ver se uma posicao escolhida especifica esta na lista
    if(numero==(tamanho-1)){
        if(l.elementos[numero]==0){
            cout << "\n Lugar vago";
        }else{
            cout << "\n Lugar usado";
        }
    }else{
        cout << "\n Lugar inexistente";
    }

    //-----------------------------------------------------------------
    cout << "__________________________________________________________" << endl;

    cout << "\nSua lista:" << endl;
    //Mostra a lista completa
    for(i=0 ; i<5 ; i++){
        cout << "\n";
        cout << l.elementos[i];
    }



    return 0;


}
