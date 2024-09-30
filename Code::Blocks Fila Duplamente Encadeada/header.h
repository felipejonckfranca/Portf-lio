//Felipe Jonck França

#ifndef HEADER_H_INCLUDED
#define HEADER_H_INCLUDED

#include <iostream>

using namespace std;

template <typename T>
struct Nodo{
    T elemento;
    Nodo<T>* proximo;
    Nodo<T>* anterior;
    int prioridade;
};

template<typename T>
struct FilaDuplamenteEncadeada{
    int cardinalidade;
    Nodo<T>* inicio;
    Nodo<T>* fim;
};

template<typename T>
void cria(FilaDuplamenteEncadeada<T> &fila){
    fila.cardinalidade = 0;
    fila.inicio = NULL;
    fila.fim = NULL;
}

template<typename T>
void destroi(FilaDuplamenteEncadeada<T> &fila){
    Nodo<T> *p;
    while (fila.inicio != NULL){
        p = fila.inicio;
        fila.inicio = fila.inicio->proximo;
        delete p;
    }
    fila.cardinalidade = 0;
}

template<typename T>
void insere(FilaDuplamenteEncadeada<T> &fila, T elemento, int prioridade){

    Nodo<T> *p = new Nodo<T>;
    Nodo<T> *a = new Nodo<T>;
    p->elemento = elemento;
    p->prioridade = prioridade;
    p->proximo = NULL;
    fila.fim = p;

    if(fila.cardinalidade == 0){
        fila.inicio = p;
    }else{
        a = fila.inicio;
        while(a->proximo != NULL){
            a = a->proximo;
        }
        a->proximo = p;
        p->anterior = a;
    }
    fila.cardinalidade++;
}

template<typename T>
void retirar(FilaDuplamenteEncadeada<T> &fila){
    int menor = 100;
    for (Nodo<T>* p = fila.inicio; p != NULL; p = p->proximo){
        if(p->prioridade<menor){
            menor = p->prioridade;
        }
    }

    if(menor == 1){

        Nodo<T> *p = fila.inicio;

        while(p->prioridade != 1){
            p = p->proximo;
        }

        if(p->anterior == NULL){
            fila.inicio = p->proximo;
        }

        if(p->proximo == NULL){
            p->anterior->proximo = NULL;

        }else{
            p->proximo->anterior = p->anterior;
            p->anterior->proximo = p->proximo;
        }


    }else if(menor == 2){

        Nodo<T> *p = fila.inicio;

        while(p->prioridade != 2){
            p = p->proximo;
        }

        if(p->anterior == NULL){
            fila.inicio = p->proximo;
        }

        if(p->proximo == NULL){
            p->anterior->proximo = NULL;

        }else{
            p->proximo->anterior = p->anterior;
            p->anterior->proximo = p->proximo;
        }
    }else if(menor == 3){

        Nodo<T> *p = fila.inicio;

        while(p->prioridade != 3){
            p = p->proximo;
        }

        if(p->anterior == NULL){
            fila.inicio = p->proximo;
        }

        if(p->proximo == NULL){
            p->anterior->proximo = NULL;

        }else{
            p->proximo->anterior = p->anterior;
            p->anterior->proximo = p->proximo;
        }
    }
    fila.cardinalidade--;
}

template<typename T>
void mostrar(FilaDuplamenteEncadeada<T> &fila){
    for (Nodo<T>* p = fila.inicio; p != NULL; p = p->proximo){
        if(p->prioridade == 4 || p->prioridade == 1){
            cout << p->elemento << "  ";
        }
    }
    for (Nodo<T>* p = fila.inicio; p != NULL; p = p->proximo){
        if(p->prioridade == 2){
            cout << p->elemento << "  ";
        }
    }
    for (Nodo<T>* p = fila.inicio; p != NULL; p = p->proximo){
        if(p->prioridade == 3){
            cout << p->elemento << "  ";
        }
    }
    cout << endl;
}

template<typename T>
bool verificaelemento(FilaDuplamenteEncadeada<T> &fila, T elemento){
    for (Nodo<T>* p = fila.inicio; p != NULL; p = p->proximo){
        if(p->elemento == elemento){
            return true;
        }
    }
    return false;
}

template<typename T>
void retiraelemento(FilaDuplamenteEncadeada<T> &fila, T elemento){
    for (Nodo<T>* p = fila.inicio; p != NULL; p = p->proximo){
        if(p->elemento == elemento){
            if(p->anterior == NULL){
                fila.inicio = p->proximo;
            }

            if(p->proximo == NULL){
                p->anterior->proximo = NULL;

            }else{
                p->proximo->anterior = p->anterior;
                p->anterior->proximo = p->proximo;
            }
        }

    }
    fila.cardinalidade--;
}


#endif // HEADER_H_INCLUDED
