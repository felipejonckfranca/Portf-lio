#Autor: felipe França
#descrição: recebe um diretorio e diz as permissões dos outros

#!/bin/bash
clear

ls -l $1 >> resultado.txt
cut -c7-9 resultado.txt
