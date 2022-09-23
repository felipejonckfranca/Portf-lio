#!/bin/bash

#Autor: Felipe França
#Descrição: uma tentativa de usar vetores

clear
 
vetor[0]="felipe"
vetor[1]="arthur"
vetor[2]="joao"
 
for i in ${vetores[@]}
        do
                echo "oi, eu sou $i"
        done
echo ----------------------
 
i=0
 
while [ $i -lt ${vetores[@]} ]
        do
                echo "oi, eu sou $i
        done
echo ---------------------
 
i=0
x=" "
 
while [ $x != "b" ]
        do
                echo "digite um nome, para parar digite 'b'"
                read x
                echo "bem vindo $x, aperte enter para continuar"
                i=$(($i+1))
                vetor[$i]=$x
        done
tamanho=((${vetores[@]}-1))
