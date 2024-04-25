# Disciplina: Arquitetura e Organização de Processadores
# Avaliação: 01 – Programação em Linguagem de Montagem
# Alunos: Felipe, Bianca, Victor e Janine

.data

pede_num: .string "Insira um numero: "

A0r: .string "\nA[0]: "
A1r: .string "\nA[1]: "
A2r: .string "\nA[2]: "
A3r: .string "\nA[3]: "

.text

main:
	addi s0, x0, 0 # t0 = 0
	
#--------------------------------------------------
#Pedindo os numeros e salvando
#--------------------------------------------------
# Trecho em C++:
#
# for(i==0; i<4; i++){
#	cout << "Insira um numero: ";
#	cin >> A[i];
#}

Loop:
	slti t0, s0, 4		# Se i<4 então $t0=1 senão $t0=0
	beq  t0, x0, Next 	# Se t0=0 então goto next
	
	la   a0, pede_num 	# Carrega a string pede_num
	addi a7, x0, 4 		# Carrega o serviço 4 (printString)
	ecall

	addi a7, x0, 5 		# Carrega o serviço 5 (readInt)
	ecall

	addi t1, zero, 4
	sub  sp, sp, t1		# Ajusta a pilha para 1 valor por loop

	sw   a0, 0(sp) 		# Salva a resposta

	addi s0, s0, 1 		# s0++
	j    Loop
	
#----------------------------------------------------
#Resultados calculados, agora printar eles
#----------------------------------------------------
# Trecho em C++:
#
# cout << "\nA[0]: " << A[0];
# cout << "\nA[1]: " << A[1];
# cout << "\nA[2]: " << A[2];
# cout << "\nA[2]: " << A[2];
#

Next:
	la   a0, A0r		# Carrega a string A0r para a0
	addi a7, x0, 4 		# Carrega a função 4 (printString)
	ecall
	
	lw   a0, 12(sp) 	# Carrega a resposta do A0 para a0
	addi a7, x0, 1 		# Carrega a função 1 (printInt)
	ecall
	
	la   a0, A1r 		# Carrega a string A1r para a0
	addi a7, x0, 4 		# Carrega a função 4 (printString)
	ecall
	
	lw   a0, 8(sp) 		# Carrega a resposta do A1 para a0
	addi a7, x0, 1 		# Carrega a função 1 (printInt)
	ecall
	
	la   a0, A2r 		# Carrega a string A2r para a0
	addi a7, x0, 4 		# Carrega a função 4 (printString)
	ecall
	
	lw   a0, 4(sp) 		# Carrega a resposta do A2 para a0
	addi a7, x0, 1 		# Carrega a função 1 (printInt)
	ecall
	
	la   a0, A3r 		# Carrega a string A3r para a0
	addi a7, x0, 4 		# Carrega a função 4 (printString)
	ecall
	
	lw   a0, 0(sp) 		# Carrega a resposta do A3 para a0
	addi a7, x0, 1 		# Carrega a função 1 (printInt)
	ecall
	
	addi t1, x0, 12
	add  sp, sp, t1		# Ajusta a pilha de volta
