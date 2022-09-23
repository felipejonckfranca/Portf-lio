
#Autor: Felipe Franca
#Descrição: testando uma forma de fazer um while onde é preciso digitar algo para parar o while

#!/bin/bash
clear
 
i="a"
u=0
 
echo "digite 'bye' para parar"
echo "digite os nomes dos seus amigos"
echo "--------------------------------"
 
while [ $i != "bye" ]
        do
                echo "Digite um nome (bye para sair)"
                read i
                fatorial[$u]=$i
                u=$((u+1))
                echo "Voce digitou $i"
                echo "----------------------------------"
        done
echo "${fatorial[@]}"
