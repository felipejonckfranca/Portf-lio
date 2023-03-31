package model;

import javax.swing.JOptionPane;

public class Pessoa {
    String cod, nome, cpf;
    int idade;
    String msg;

    public Pessoa() {
    }

    public Pessoa(String cod, String nome, String cpf, int idade) {
        this.cod = cod;
        this.nome = nome;
        this.cpf = cpf;
        this.idade = idade;
    }

    public String getCod() {
        return cod;
    }

    public void setCod(String cod) {
        this.cod = cod;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
    
    public void fazerNiver(){
        this.idade++;
    }
    
    public void mostrarDados(){
        msg = "----------Dados Cadastrados----------\n";
      
        msg+= "Cod: "+this.getCod()+"\n";
        msg+= "Nome: "+this.getNome()+"\n";
        msg+= "Cpf: "+this.getCpf()+"\n";
        msg+= "Idade: "+this.getIdade()+"\n";
        
    }
      
    
}
