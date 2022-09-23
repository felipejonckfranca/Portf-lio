#!/bin/bash

#autor: Felipe França
#descrição: esse código pega 15 numeros diferentes escolhidos pelo usuario e calcula a média dos números e qual número é maior.

clear
 
i=1
soma=0
maior=0
 
while [ $i -lt 16 ]
        do
                echo "escreva o preco do produto numero $i"
                read x
                if [ $x -gt $maior ]
                        then
                                maior=$x
                        fi
                soma=$(($soma+$x))
                i=$(($i+1))
        done
 
soma=$( bc <<< "scale=4; $soma/15" )
 
 
echo "a media dos precos e $soma"
echo "o produto mais caro e $maior"
