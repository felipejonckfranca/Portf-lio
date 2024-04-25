# Disciplina: Arquitetura e Organização de Processadores
# Avaliação: 02 – Programação em Linguagem de Montagem
# Alunos: Felipe, Bianca, Victor e Janine

.data
#------iniciando os vetores------------------------------------
Vetor_A: .word 0,0,0,0,0,0,0,0
Vetor_B: .word 0,0,0,0,0,0,0,0
Vetor_C: .word 0,0,0,0,0,0,0,0

#------introduzindo as strings---------------------------------
pedirMax: .string "Digite um valor de tamanho máximo para os vetores (máximo 8): "
erro: .string "Valor inválido\n"
pedirA: .string "Vetor_A["
pedirB: .string "Vetor_B["
printC: .string "\nVetor_C["
string2: .string "]: "

.text
#---------pedir para entrar com o tamanho dos vetores----------
Catch:
	la    a0, pedirMax 	# Carrega a string "pedirMax"
	addi  a7, x0, 4 	# Carrega o serviço 4 (Print string)
	ecall 			# Imprime a string
	
	addi  a7, x0, 5 	# Carrega o serviço 5 (Read int)
	ecall			# Lê o inteiro digitado
	
	slti  t1, a0, 8 	# Verifica se o valor é menor que 8
	beq   t1, x0, Erro 	# Se o valor for menor que 8, continua, senão goto Erro
	
	slti  t1, a0, 1 	# Verifica se o valor é menor que 1
	bne   t1, x0, Erro 	# Se o valor for menor que 8, continua, senão goto Erro
	
	j main			# Pula para a próxima sessão pulando o erro
	
#----------Mensagem de erro------------------------------------
Erro:
	la    a0, erro		# Carrega a String "erro"
	addi  a7, x0, 4		# Carrega o serviço 4 (Print string)
	ecall 			# Imprime a string
	
	j Catch			# Volta para o loop Catch para pedir novamente

main:
#---------Pedindo os valores de A------------------------------
	
	add s0, x0, a0 		# Leva o valor do a0 (Tamanho do vetor) para s0
	la  t4, Vetor_A 	# inicializa o t4 com o endereço de memória do vetor
	
	li  t2, 0 		# inicializa t2 como 0 (i=0)

LoopA:
	add t0, t2, t2 		# t0 = 2i
	add t0, t0, t0 		# t0 = 4i
	add t0, t0, t4 		# t0 = a+4i (endereço base + deslocamento)
	
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
	
	bne  t2, s0, LoopA 	# se t2 (i) for diferente de s0 (tamanho do vetor) repete o loop
	
#---------Pedindo os valores de B------------------------------

	la t4, Vetor_B 		# inicializa o t4 como o vetor b
	
	li t2, 0 		# inicializa t2 como 0

LoopB:

	add  t0, t2, t2 	# t0 = 2i
	add  t0, t0, t0 	# t0 = 4i
	add  t0, t0, t4 	# t0 = b+4i
	
	la   a0, pedirB 	# Carrega a string "pedirb"
	addi a7, x0, 4 		# Carrega o serviço 4 (Print string)
	ecall			# Imprime a string
	
	addi a0, t2, 0		# Carrega o valor de t2 no registrrador a0
	addi a7, x0, 1		# Carrrega o serviço 1 (Print int)
	ecall			# Imprime o i
	
	la   a0, string2 	# Carrega o endereço da string "string2"
	addi a7, x0, 4 		# Carrega o serviço 4 (Print string)
	ecall 			# Imprime o fecha colchete
	
	addi a7, x0, 5 		# Carrega o serviço 5 (Read int)
	ecall 			# Lê o inteiro digitado
	
	sw   a0, 0(t0) 		# Salva o valor escrito em c(t0)
	
	addi t2, t2, 1		# t2++
	
	bne  t2, s0, LoopB 	# se t2 (i) for diferente de s0 (tamanho do vetor) repete o loop

#---------Carculando os valores de C------------------------------

	la t4, Vetor_A 		# inicializa o t4 como o endereço do vetor A
	la t5, Vetor_B 		# inicializa o t5 como o endereço do vetor B
	la t6, Vetor_C 		# inicializa o t6 como o endereço do vetor C
	
	li t3, 0 		# inicializa t3 como 0

LoopC:

	add t0, t3, t3 		# t0 = 2i
	add t0, t0, t0 		# t0 = 4i
	add t0, t0, t4 		# t0 = a+4i
	
	add t1, t3, t3 		# t1 = 2i
	add t1, t1, t1 		# t1 = 4i
	add t1, t1, t5 		# t1 = b+4i
	
	add t2, t3, t3 		# t2 = 2i
	add t2, t2, t2 		# t2 = 4i
	add t2, t2, t6 		# t2 = c+4i
	
	lw  s2, 0(t0) 		# Carrega o valor 0(a) para s2
	lw  s3, 0(t1) 		# Carrega o valor 0(b) oara s3
	
	slt s4, s2, s3		# Se S2 for menor que S3, S4 = 1
	beq s4, x0, MaiorA	# Se S4 for 0, vai para MaiorA
	j   MaiorB		# Pula para MaiorB

MaiorA:
	sw  s2, 0(t2) 		# Salva o valor de s2(a) em 0(t2) (c)
	
	j   Exit		# Pula para saida
MaiorB:
	sw  s3, 0(t2) 		# Salva o valor de s3(b) em 0(t2) (c)
	
Exit:
	addi t3, t3, 1 		# t2++
	
	bne  t3, s0, LoopC 	# se t2 (i) for diferente de t1 (tamanho do vetor) repete o loop

#-----------Imprimir o vetor C--------------------------------------------------------------------

	la t4, Vetor_C 		# Carrega o vetor C para t4
	
	li t2, 0 		# inicializa t2 como 0

LoopPrintC:

	add t0, t2, t2 		# t0 = 2i
	add t0, t0, t0 		# t0 = 4i
	add t0, t0, t4 		# t0 = c+4i
	
	la   a0, printC 	# Carrega a string respostac
	addi a7, x0, 4 		# Carrega o serviço 4 (Print string)
	ecall			# Imprime a string
	
	addi a0, t2, 0		# Carrega o valor de t2 no registrrador a0
	addi a7, x0, 1		# Carrrega o serviço 1 (Print int)
	ecall			# Imprime o i
	
	la   a0, string2 	# Carrega o endereço da string "string2"
	addi a7, x0, 4 		# Carrega o serviço 4 (Print string)
	ecall			# Imprime o fecha colchete
	
	lw   a0, 0(t0) 		# Chama o valor de 0(t0) para a0
	addi a7, x0, 1 		# Carrega o serviço 1(print int)
	ecall			# Lê o inteiro digitado
	
	addi t2, t2, 1 		# t2++
	
	bne  t2, s0, LoopPrintC # se t2 (i) for diferente de t1 (tamanho do vetor) repete o loop
