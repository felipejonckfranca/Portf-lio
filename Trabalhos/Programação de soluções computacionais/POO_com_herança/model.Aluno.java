package model;

import javax.swing.JOptionPane;
import model.Pessoa;

public class Aluno extends Pessoa{
    String ra;
    double mensalidade;

    public Aluno() {
    }

    public Aluno(String ra, double mensalidade) {
        this.ra = ra;
        this.mensalidade = mensalidade;
    }

    public Aluno(String ra, double mensalidade, String cod, String nome, String cpf, int idade) {
        super(cod, nome, cpf, idade);
        this.ra = ra;
        this.mensalidade = mensalidade;
    }  

    public String getRa() {
        return ra;
    }

    public void setRa(String ra) {
        this.ra = ra;
    }

    public double getMensalidade() {
        return mensalidade;
    }

    public void setMensalidade(double mensalidade) {
        this.mensalidade = mensalidade;
    }
    
    @Override
    public void mostrarDados(){
        super.mostrarDados();
        msg+= "RA: "+this.getRa()+"\n";
        msg+= "Mensalidade: "+this.getMensalidade()+"\n";
        
        JOptionPane.showMessageDialog(null, msg);

    }
    
}
