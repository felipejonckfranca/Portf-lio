package model;

public class Livro {
    String nome, descricao, autor, editora;
    int ano_lanc, quant;

    public Livro() {
    }

    public Livro(String nome, String descricao, String autor, String editora, int ano_lanc, int quant) {
        this.nome = nome;
        this.descricao = descricao;
        this.autor = autor;
        this.editora = editora;
        this.ano_lanc = ano_lanc;
        this.quant = quant;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getEditora() {
        return editora;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }

    public int getAno_lanc() {
        return ano_lanc;
    }

    public void setAno_lanc(int ano_lanc) {
        this.ano_lanc = ano_lanc;
    }

    public int getQuant() {
        return quant;
    }

    public void setQuant(int quant) {
        this.quant = quant;
    }
    
    
}
