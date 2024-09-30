//Felipe Jonck França, Joao Pedro Lourenco David
//Trabalho 1 - 02/09/2024

public abstract class Empregado extends Pessoa{
    int codigosetor;
    float salariobase, imposto;

    public Empregado(String nome, String telefone, int codigosetor, float salariobase, float imposto) {
        super(nome, telefone);
        this.codigosetor = codigosetor;
        this.salariobase = salariobase;
        this.imposto = imposto;


    }

    public int getCodigosetor() {
        return codigosetor;
    }

    public void setCodigosetor(int codigosetor) {
        this.codigosetor = codigosetor;
    }

    public float getSalariobase() {
        return salariobase;
    }

    public void setSalariobase(float salariobase) {
        this.salariobase = salariobase;
    }

    public float getImposto() {
        return imposto;
    }

    public void setImposto(float imposto) {
        this.imposto = imposto;
    }

    public float calcularSalario(){
        return salariobase-(salariobase*imposto);
    }

    @Override
    public String toString() {
        return "Empregado{" +
                "codigosetor=" + codigosetor +
                ", salariobase=" + salariobase +
                ", imposto=" + imposto +
                ", nome='" + nome + '\'' +
                ", telefone='" + telefone + '\'' +
                "} " + super.toString();
    }
}
