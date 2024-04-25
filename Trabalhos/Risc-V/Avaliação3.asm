# Disciplina: Arquitetura e Organização de Processadores
# Avaliação: 03 – Programação em Linguagem de Montagem
# Alunos: Felipe, Bianca, Victor e Janine

.data
vetor_a: .word 0,0,0,0,0,0,0,0

pedirMax: .string "Digite um valor de tamanho máximo para os vetores (máximo 8): "
erro: .string "Valor inválido\n"
pedirA: .string "Vetor_A["
string2: .string "]: "

.text
j main

leaf:
	addi t3, zero, 8 
 	sub sp, sp, t3 # ajusta a pilha para 2 valores
 	sw ra, 4(sp) # salva o conteúdo de ra
 	sw a0, 0(sp) # salva o tamanho do vetor

leafloop:
	add s1, t0, t0 		# s1 = 2i
	add s1, s1, s1 		# s1 = 4i
	add s1, s1, a1 		# s1 = a+4i (endereço base + deslocamento)
	
	addi t0, t0, 1		# t0 ++
	beq t0, a0, repete

	add s2, t0, t0 		# s2 = 2i
	add s2, s2, s2 		# s2 = 4i
	add s2, s2, a1 		# s2 = a+4i (endereço base + deslocamento)
	
	lw s4, 0(s1)		# salva o valor de 0(s1) (valor atual no loop) em s4
	lw s5, 0(s2)		# salva o valor de 0(s2) (proximo valor no loop) em s5
	
	slt s3, s4, s5		# Se s4 (atual) for maior que s5 (proximo):
	beq s3, x0, switch	# Vá para switch
	j repete		# Senão, vá para repete
	
switch:
	sw s5, 0(s1)		# Salva o valor de s5 (proximo no loop) no lugar do atual
	sw s4, 0(s2)		# Salva o valor do s4 (atual no loop) no lugar do proximo

repete:

	bne t0, a0, leafloop	# Se t0 = tamanho, continua, senão goto leafloop
	
	addi t1, t1, 1 		# t1 ++ 
	add t0, x0, x0		# zera o t0
	bne t1, a0, leafloop	# Se t1 = tamanho, continua, senão goto leafloop
		
	lw ra, 4(sp)		# Carrega o valor de 4(sp) em ra
	lw s0, 0(sp)		# Carrega o valor de 0(sp) em s0
	add sp, sp, t3
	jr ra			# Retorna para o ra 
	
#-----------------Fim do leaf-----------------------------------------
	
main:
	la a1, vetor_a 		#inicializa a1 como o vetor A
	
#------------------Pede o tamanho total do vetor------------------------
Catch:
	la    a0, pedirMax 	# Carrega a string "pedirMax"
	addi  a7, x0, 4 	# Carrega o serviço 4 (Print string)
	ecall 			# Imprime a string
	
	addi  a7, x0, 5 	# Carrega o serviço 5 (Read int)
	ecall			# Lê o inteiro digitado
	
	slti  t1, a0, 8 	# Verifica se o valor é menor que 8
	beq   t1, x0, Erro 	# Se o valor for menor que 8, continua, senão goto Erro
	
	slti  t1, a0, 1 	# Verifica se o valor é menor que 1
	bne   t1, x0, Erro 	# Se o valor for maior que 1, continua, senão goto Erro
	
	add s0, x0, a0 		# Salva o total em s0
	
	j PedirA		# Pula para a pedirA
	
#----------Mensagem de erro---------------------------------------------
Erro:
	la    a0, erro		# Carrega a String "erro"
	addi  a7, x0, 4		# Carrega o serviço 4 (Print string)
	ecall 			# Imprime a string
	
	j Catch			# Volta para o loop Catch para pedir novamente
	
#-----------Pedindo valores de A----------------------------------------

PedirA:
	add t0, t2, t2 		# t0 = 2i
	add t0, t0, t0 		# t0 = 4i
	add t0, t0, a1 		# t0 = a+4i (endereço base + deslocamento)
	
	la   a0, pedirA 	# Carrega o endereço da string "pedirA"
	addi a7, x0, 4 		# Carrega o serviço 4 (Print string)
	ecall			# Imprime a string
	
	addi a0, t2, 0		# Carrega o valor de t2 no registrrador a0
	addi a7, x0, 1		# Carrrega o serviço 1 (Print int)
	ecall			# Imprime o i
	
	la   a0, string2 	# Carrega o endereço da string "string2"
	addi a7, x0, 4 		# Carrega o serviço 4 (Print string)
	ecall			# Imprime o fecha colchete
	
	addi a7, x0, 5		# Carrega o serviço 5 (Read int)
	ecall			# Lê o inteiro digitado
	
	sw   a0, 0(t0) 		# Salva o valor escrito em 0(t0)
	
	addi t2, t2, 1 		# t2++
	
	bne  t2, s0, PedirA 	# se t2 (i) for diferente de s0 (tamanho do vetor) repete o loop

#---------------Fim de adicionar valores em A-----------------------------------------------------
	
	add a0, x0, s0		# Carrega o valor total em a0
	addi t0, x0, 0 		# iniciando o t0 como 0
	jal leaf
	
	addi t0, x0, 0 		# iniciando o t0 como 0
	
#---------------Mostra o valor de A-------------------------------------------------------------

loopmostra:	

	add t1, t0, t0 		# t1 = 2i
	add t1, t1, t1 		# t1 = 4i
	add t1, t1, a1 		# t1 = c+4i
	
	lw   a0, 0(t1) 		# Chama o valor de 0(t1) para a0
	addi a7, x0, 1 		# Carrega o serviço 1(print int)
	ecall			# escreve o inteiro na memoria

	addi t0, t0, 1		# t0++
	bne t0, s0, loopmostra	#se t0 != s0, volta pro loop
