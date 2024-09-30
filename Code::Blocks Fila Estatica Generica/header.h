//Felipe Jonck França
#ifndef H_H_INCLUDED
#define H_H_INCLUDED

#include <iostream>

 using namespace std;

template<typename T, int MAX>
struct FilaEstaticaGenerica{
    int cardinalidade;
    int inicio;
    int fim;
    T elementos [MAX];
};

template<typename T, int MAX>
void cria(FilaEstaticaGenerica<T, MAX> &fila){
    fila.cardinalidade = 0;
    fila.inicio = MAX - 1;
    fila.fim = MAX - 1;
}

template<typename T, int MAX>
void inserefim (FilaEstaticaGenerica<T, MAX> &fila, T elemento){
    if(fila.cardinalidade == MAX){
        throw "OVERFLOW";
    }
    fila.fim++;
    if (fila.fim > MAX - 1){
        fila.fim = 0;
    }
    fila.elementos[fila.fim] = elemento;
    fila.cardinalidade++;
}

template<typename T, int MAX>
void inserecomeco (FilaEstaticaGenerica<T, MAX> &fila, T elemento){
    if(fila.cardinalidade == MAX){
        throw "OVERFLOW";
    }

    if (fila.inicio < 0){
        fila.inicio = MAX - 1;
    }
    fila.elementos[fila.inicio] = elemento;
    fila.cardinalidade++;
    fila.inicio--;
}

template<typename T, int MAX>
void retiracomeco (FilaEstaticaGenerica<T, MAX> &fila){
    if(fila.cardinalidade == 0){
        throw "UNDERFLOW";
    }
    fila.inicio++;
    if (fila.inicio > MAX - 1){
        fila.inicio = 0;
    }
    fila.cardinalidade--;
}

template<typename T, int MAX>
void retirafim (FilaEstaticaGenerica<T, MAX> &fila){
    if(fila.cardinalidade == 0){
        throw "UNDERFLOW";
    }
    fila.fim--;
    if (fila.fim < 0){
        fila.fim = MAX - 1;
    }
    fila.cardinalidade--;
}

template<typename T, int MAX>
void mostra (FilaEstaticaGenerica<T, MAX> fila){
    int i = 1;
    int posicao = fila.inicio;
    while (i <= fila.cardinalidade){
        posicao++;
        if (posicao > MAX - 1){
            posicao = 0;
        }
        cout << fila.elementos[posicao] << " ";
        i++;
    }
    cout << endl;
}



#endif // H_H_INCLUDED
