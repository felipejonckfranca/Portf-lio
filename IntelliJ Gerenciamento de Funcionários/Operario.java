//Felipe Jonck França, Joao Pedro Lourenco David
//Trabalho 1 - 02/09/2024

public class Operario extends Empregado{
    float valorProducao, comissao;

    public Operario(String nome, String telefone, int codigosetor, float salariobase, float imposto, float valorProducao, float comissao) {
        super(nome, telefone, codigosetor, salariobase, imposto);
        this.valorProducao = valorProducao;
        this.comissao = comissao;
    }

    public float getValorProducao() {
        return valorProducao;
    }

    public void setValorProducao(float valorProducao) {
        this.valorProducao = valorProducao;
    }

    public float getComissao() {
        return comissao;
    }

    public void setComissao(float comissao) {
        this.comissao = comissao;
    }

    @Override
    public float calcularSalario(){
        return salariobase-(salariobase*imposto)+(comissao*valorProducao);
    }

    @Override
    public String toString() {
        return "Operario:\n" +
                "valorProducao=" + valorProducao +
                ",\n comissao=" + comissao +
                ",\n codigosetor=" + codigosetor +
                ",\n salariobase=" + salariobase +
                ",\n imposto=" + imposto +
                ",\n nome='" + nome + '\'' +
                ",\n telefone='" + telefone + '\'';
    }
}
