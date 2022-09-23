#autor: Felipe França
#descrição: diz se um numero é positivo, negativo ou neutro

#!/bin/bash
clear
 
if [ $1 -gt $2 ]
then
        echo "$1 e maior"
fi
 
if [ $1 -eq $2 ]
then
        echo "sao iguais"
fi
 
if [ $1 -lt $2 ]
then
        echo "menor que"
fi
