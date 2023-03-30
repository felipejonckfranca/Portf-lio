package model;

public class Usuario {
    String nome, cpf, cod;
    int idade, livros_na_mao;

    public Usuario() {
    }

    public Usuario(String nome, String cpf, String cod, int idade, int livros_na_mao) {
        this.nome = nome;
        this.cpf = cpf;
        this.cod = cod;
        this.idade = idade;
        this.livros_na_mao = livros_na_mao;
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

    public String getCod() {
        return cod;
    }

    public void setCod(String cod) {
        this.cod = cod;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getLivros_na_mao() {
        return livros_na_mao;
    }

    public void setLivros_na_mao(int livros_na_mao) {
        this.livros_na_mao = livros_na_mao;
    }

    
}
