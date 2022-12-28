#include <cs50.h>
#include <stdio.h>
#include <string.h>
//Nome do criador: Felipe Jonck França. Função: O usuario insere uma frase e a quantidade de caracteres que ele deseja pular para criar uma mensagem criptografada

int main (void){
    string texto = get_string("Digite a mensagem que você quer criptografar: ");
    int tamanho = get_int("Digite a quantidade de espaços pulados: ");
    int n = strlen(texto);
    int cripto = 0;
    

    for (int i = 0; i < n; i++){
        if(texto[i] != ' '){
            cripto = ((int)texto[i]+tamanho)%26;
        }
        printf("%c", (char)cripto);
    }
    printf("\n");
    
    
}
