package model;

public class Usuario {
    String nome, cpf, msg;
    int idade;

    public Usuario() {
    }

    public Usuario(String nome, String cpf, int idade) {
        this.nome = nome;
        this.cpf = cpf;
        this.idade = idade;
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
    
    public void mostrarDados(){
        msg = "----- Dados Cadastrados -----\n\n";
        msg+="Nome: "+this.getNome()+"\n";
        msg+="Cpf: "+this.getCpf()+"\n";
        msg+="Idade: "+this.getIdade()+"\n";
    }

    void depositare(double valor) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
