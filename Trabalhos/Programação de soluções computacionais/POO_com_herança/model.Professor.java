package model;

import javax.swing.JOptionPane;
import model.Pessoa;

public class Professor extends Pessoa{
    String rp;
    double salario;

    public Professor() {
    }

    public Professor(String rp, double salario) {
        this.rp = rp;
        this.salario = salario;
    }

    public Professor(String rp, double salario, String cod, String nome, String cpf, int idade) {
        super(cod, nome, cpf, idade);
        this.rp = rp;
        this.salario = salario;
    }

    public String getRp() {
        return rp;
    }

    public void setRp(String rp) {
        this.rp = rp;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
    
    @Override
    public void mostrarDados(){
        super.mostrarDados();
        msg+= "RP: "+this.getRp()+"\n";
        msg+= "Salário: "+this.getSalario()+"\n";
        
        JOptionPane.showMessageDialog(null, msg);

    }
}
