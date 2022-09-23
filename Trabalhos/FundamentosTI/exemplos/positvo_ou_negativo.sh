#autor: Felipe frança
#descrição: Diz se um numero é maior ou menor que o outro

#!/bin/bash
clear 

if [ $1 -gt 0 ]
then
        echo "e positivo"
fi
 
if [ $1 -eq 0 ]
then
  echo "e neutro"
fi

if [ $1 -lt 0 ]
then
  echo "e negativo"
fi
