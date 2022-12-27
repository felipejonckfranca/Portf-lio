#include <cs50.h>
#include <string.h>
#include <stdio.h>
//Nome do criador: Felipe Jonck França. Função: indicar a quantidade de palavras, letras e sentenças em uma frase e então mostrar a media de letras por palavras e sentenças por palavras

int main (void){
    
    int letras = 0;
    int palavras = 1;
    int sentencas = 0;
    
    string texto = get_string("Texto: ");
    int n = strlen(texto);
    
    for (int i = 0; i < n; i++)
    {
        if (texto[i] == ' '){
            palavras++;
        }else if(texto[i] == '.' | texto[i] == '!'){
            sentencas++;
        }else{
            letras++;
        }
    }
    
    float medialetra = letras/(float)palavras;
    float mediasentenca = sentencas/(float)palavras;
    
    printf("Voce tem %i palavras, %i letras e %i sentenças\n a média de letras e palavras é %f e a media de sentencas é %f\n", palavras, letras, sentencas, medialetra, mediasentenca);

}
