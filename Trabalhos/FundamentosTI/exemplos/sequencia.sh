#!/bin/bash

#autor: Felipe França
#descrição: esse código faz uma sequencia de 1 até um numero positivo, se for negativo, ele repete o proprio codigo ate ser positivo

clear
 
echo digite um numero
read x
 
if [ $x -gt 0 ]
then
        for i in $(seq 1 $x)
                do
                        echo $i
                done
else
        echo tem q ser positivo >:P
        sh ./5.sh
fi
