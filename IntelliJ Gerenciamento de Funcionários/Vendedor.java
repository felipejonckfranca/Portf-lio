//Felipe Jonck França, Joao Pedro Lourenco David
//Trabalho 1 - 02/09/2024

public class Vendedor extends Empregado{
    float valorVendas, comissao;

    public Vendedor(String nome, String telefone, int codigosetor, float salariobase, float imposto, float valorVendas, float comissao) {
        super(nome, telefone, codigosetor, salariobase, imposto);
        this.valorVendas = valorVendas;
        this.comissao = comissao;
    }

    public float getValorVendas() {
        return valorVendas;
    }

    public void setValorVendas(float valorVendas) {
        this.valorVendas = valorVendas;
    }

    public float getComissao() {
        return comissao;
    }

    public void setComissao(float comissao) {
        this.comissao = comissao;
    }

    @Override
    public float calcularSalario(){
        return salariobase-(salariobase*imposto)+(comissao*valorVendas);
    }

    @Override
    public String toString() {
        return "Vendedor:\n" +
                "valorVendas=" + valorVendas +
                ",\n comissao=" + comissao +
                ",\n codigosetor=" + codigosetor +
                ",\n salariobase=" + salariobase +
                ",\n imposto=" + imposto +
                ",\n nome='" + nome + '\'' +
                ",\n telefone='" + telefone + '\'';
    }
}
