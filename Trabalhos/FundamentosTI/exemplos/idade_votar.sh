#!/bin/bash

#autor: Felipe França
#descrição: esse código determina se voce deve ou não votar para o presidente do Brasil

clear
 
echo em que ano voce nasceu?
read x
 
if [ $x -le 2002 ]
        then
                echo voce pode votar
        else
                echo voce nao pode votar
fi
