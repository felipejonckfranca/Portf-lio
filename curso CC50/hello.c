#include <cs50.h>
#include <stdio.h>
//Nome do criador: Felipe Jonck França. Função: Perguntar o nome do usuario e fazer uma saudação

int main(void)
{
    string nome = get_string("Qual é o seu nome?\n");
    printf("Olá, %s \n", nome);
    }
