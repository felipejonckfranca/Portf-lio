package model;

import javax.swing.JOptionPane;
import model.Usuario;

public class Conta extends Usuario{
    String numero;
    double saldo;
    Usuario titular;

    public Conta() {
    }

    public Conta(String numero, double saldo, Usuario titular) {
        this.numero = numero;
        this.saldo = saldo;
        this.titular = titular;
    }

    public Conta(String numero, double saldo, Usuario titular, String nome, String cpf, int idade) {
        super(nome, cpf, idade);
        this.numero = numero;
        this.saldo = saldo;
        this.titular = titular;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public Usuario getTitular() {
        return titular;
    }

    public void setTitular(Usuario titular) {
        this.titular = titular;
    }
    
    @Override
    public void mostrarDados(){
        super.mostrarDados();
        msg+="Numero da conta: "+this.getNumero()+"\n";
        msg+="Saldo: "+this.getSaldo()+"\n";
        
        JOptionPane.showMessageDialog(null, msg);
    }
    
    @Override
    public void depositare(double valor) {
        saldo += valor;
    }

    public void sacar(double valor) {
        if (saldo >= valor) {
            saldo -= valor;
        } else {
            System.out.println("Saldo insuficiente!");
        }
    }
    
    public void transferencia(double valor, Usuario destino){
        if (saldo >= valor) {
            saldo -= valor;
            destino.depositare(valor);
        } else {
            System.out.println("Saldo insuficiente!");
        }
    }
}
