#include <cs50.h>
#include <stdio.h>
//Nome do criador: Felipe Jonck França. Função: criar uma meia piramide do tamanho que o usuario escolher
int main(void)
{
    int tamanho = get_int("Digite o tamanho da sua piramide: ");
    
    
        
        for(int a=0; a<tamanho;a++){
            
            for(int y=tamanho; y>=a; y--){
                printf(" ");
            }
            
            for(int x=0; x<=a;x++){
                printf("#");
            }
            printf("\n");
            
        }
        
        
        
    
}
