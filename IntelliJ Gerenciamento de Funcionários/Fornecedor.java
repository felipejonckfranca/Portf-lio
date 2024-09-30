//Felipe Jonck França, Joao Pedro Lourenco David
//Trabalho 1 - 02/09/2024

public class Fornecedor extends Pessoa{
    float valorcredito, valordivida;

    public Fornecedor(String nome, String telefone, float valorcredito, float valordivida) {
        super(nome, telefone);
        this.valorcredito = valorcredito;
        this.valordivida = valordivida;
    }

    public float getValorcredito() {
        return valorcredito;
    }

    public void setValorcredito(float valorcredito) {
        this.valorcredito = valorcredito;
    }

    public float getValordivida() {
        return valordivida;
    }

    public void setValordivida(float valordivida) {
        this.valordivida = valordivida;
    }

    public float obterSaltdo(){
        return valorcredito - valordivida;
    }
}
