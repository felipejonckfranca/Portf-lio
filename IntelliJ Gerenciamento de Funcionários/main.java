import java.util.ArrayList;
import java.util.Scanner;

//Felipe Jonck França, Joao Pedro Lourenco David
//Trabalho 1 - 02/09/2024
public class Main {

    public static ArrayList<Pessoa> lista = new ArrayList<Pessoa>();

    public static void main(String[] args) {
        System.out.println("\nSelecione uma das opções: (1-Adicionar Fornecedor, 2-Adicionar Empregado, 3-Folha de pagamento, 4- Contas a pagar)");

        Scanner input = new Scanner(System.in);
        int n = input.nextInt();


        switch (n){
            case 1:
                addFornecedor();
                main(args);
                break;
            case 2:
                addEmpregado();
                main(args);
                break;
            case 3:
                folhaPagamento();
                main(args);
                break;
            case 4:
                contasPagar();
                main(args);
                break;
            default:
                System.out.println("\nErro, favor selecionar uma das opções");
                main(args);
                break;
        }
    }

    public static void folhaPagamento(){
        for (Pessoa i : lista){
            if (i instanceof Vendedor){
                Vendedor esse = (Vendedor) i;
                System.out.printf("\nNome do Vendedor: %s. Total a pagar: %.2f",esse.getNome(),esse.calcularSalario());
            }
            if (i instanceof Operario){
                Operario esse = (Operario) i;
                System.out.printf("\nNome do Operario: %s. Total a pagar: %.2f",esse.getNome(),esse.calcularSalario());
            }
        }
    }

    public static void contasPagar(){
        for (Pessoa i : lista) {
            if (i instanceof Fornecedor) {
                Fornecedor esse = (Fornecedor) i;
                System.out.printf("\nNome do Fornecedor: %s. Saldo total: %.2f", esse.getNome(), esse.obterSaltdo());
            }
        }
    }

    public static void addFornecedor(){
        int i = 1;

        float valordivida = 0;
        float valorcredito = 0;

        while(i == 1){
            Scanner input = new Scanner(System.in);

            System.out.println("\nInsira o nome para o seu Fornecedor:");
            String nome = input.nextLine();

            System.out.println("\nInsira o telefone para o seu Fornecedor:");
            String telefone = input.nextLine();

            System.out.println("\nInsira o valor de credito maximo para o seu Fornecedor:");
            try{
                valorcredito = input.nextFloat();
            }catch (Exception e){
                System.out.println("Valor invalido para o credito, favor tentar novamente com um float");
                addFornecedor();
                break;
            }

            System.out.println("\nInsira o montante de divida para o seu Fornecedor:");
            try{
                valordivida = input.nextFloat();
            }catch (Exception e){
                System.out.println("Valor invalido para a divida, favor tentar novamente com um float");
                addFornecedor();
                break;

            }

            Fornecedor f = new Fornecedor(nome, telefone, valorcredito, valordivida);

            System.out.println("\nFornecedor Cadastrado");

            lista.add(f);

            break;
        }
    }

    public static void addEmpregado(){
        System.out.println("\nSelecione uma das opções de Empregado para adicionar: (1-Operario, 2-Vendedor)");

        Scanner input = new Scanner(System.in);
        int n = input.nextInt();

        switch (n){
            case 1:
                addOperario();
                break;
            case 2:
                addVendedor();
                break;
            default:
                System.out.println("\nErro, favor selecionar uma das opções");
                addEmpregado();
                break;
        }
    }

    public static void addOperario(){

        int i = 1;
        while(i == 1) {

            int codigosetor = 0;
            float comissao = 0;
            float salariobase = 0;
            float imposto = 0;
            float valorProducao = 0;


            Scanner input = new Scanner(System.in);

            System.out.println("\nInsira o nome para o seu Operario:");
            String nome = input.nextLine();

            System.out.println("\nInsira o telefone para o seu Operario:");
            String telefone = input.nextLine();

            System.out.println("\nInsira o Codigo do setor para o seu Operario:");
            try {
                codigosetor = input.nextInt();
            }catch (Exception e){
                System.out.println("Valor invalido para o codigo de setor, favor tentar novamente com um inteiro");
                addOperario();
                break;
            }
            System.out.println("\nInsira o salario base para o seu Operario:");
            try {
                salariobase = input.nextFloat();
            }catch (Exception e){
                System.out.println("Valor invalido para o salario base, favor tentar novamente com um float");
                addOperario();
                break;
            }

            System.out.println("\nInsira o valor de imposto cobrado para o seu Operario:");
            try {
                imposto = input.nextFloat();
            }catch (Exception e){
                System.out.println("Valor invalido para o imposto, favor tentar novamente com um float");
                addOperario();
                break;
            }

            System.out.println("\nInsira o valor de producao do o seu Operario:");
            try {
                valorProducao = input.nextFloat();
            }catch (Exception e){
                System.out.println("Valor invalido para o valor de producao, favor tentar novamente com um float");
                addOperario();
                break;
            }

            System.out.println("\nInsira a % de comissao do o seu Operario:");
            try {
                comissao = input.nextFloat();
            }catch (Exception e){
                System.out.println("Valor invalido para a comissao, favor tentar novamente com um float");
                addOperario();
                break;
            }
            Operario f = new Operario(nome, telefone, codigosetor, salariobase, imposto, valorProducao, comissao);

            System.out.println("\nOperario Cadastrado");

            lista.add(f);

            break;
        }

    }

    public static void addVendedor(){

        int i = 1;
        while(i == 1) {

            int codigosetor = 0;
            float comissao = 0;
            float salariobase = 0;
            float imposto = 0;
            float valorVendas = 0;

            Scanner input = new Scanner(System.in);

            System.out.println("\nInsira o nome para o seu Vendedor:");
            String nome = input.nextLine();

            System.out.println("\nInsira o telefone para o seu Vendedor:");
            String telefone = input.nextLine();

            System.out.println("\nInsira o Codigo do setor para o seu Vendedor:");
            try {
                codigosetor = input.nextInt();
            }catch (Exception e){
                System.out.println("Valor invalido para o codigo de setor, favor tentar novamente com um inteiro");
                addVendedor();
                break;
            }

            System.out.println("\nInsira o salario base para o seu Vendedor:");
            try {
                salariobase = input.nextFloat();
            }catch (Exception e){
                System.out.println("Valor invalido para o salario base, favor tentar novamente com um float");
                addVendedor();
                break;
            }

            System.out.println("\nInsira o valor de imposto cobrado para o seu Vendedor:");
            try {
                imposto = input.nextFloat();
            }catch (Exception e){
                System.out.println("Valor invalido para o imposto, favor tentar novamente com um float");
                addVendedor();
                break;
            }

            System.out.println("\nInsira o valor de vendas do o seu Vendedor:");
            try {
                valorVendas = input.nextFloat();
            }catch (Exception e){
                System.out.println("Valor invalido para o valor de vendas, favor tentar novamente com um float");
                addVendedor();
                break;
            }

            System.out.println("\nInsira a % de comissao do o seu Vendedor:");
            try {
                comissao = input.nextFloat();
            }catch (Exception e){
                System.out.println("Valor invalido para a comissao, favor tentar novamente com um float");
                addVendedor();
                break;
            }
            Vendedor f = new Vendedor(nome, telefone, codigosetor, salariobase, imposto, valorVendas, comissao);

            System.out.println("\nVendedor Cadastrado");

            lista.add(f);

            break;
        }

    }
}
