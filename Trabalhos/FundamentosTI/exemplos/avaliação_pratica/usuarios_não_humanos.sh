#autor: Felipe França
#descrição: Mostra todos os usuarios não-humanos

#!/bin/bash
clear

valor=$(cut -d":" -f3 /etc/passwd)
for i in $valor
do
        if [[ $i -gt 0 ]]
        then
                if [[ $i -lt 1000 ]]
                then
                        cut -s -d: -f1 /etc/passwd > texto.txt
                        sed -n $i"p" texto.txt
                fi
        fi
done
