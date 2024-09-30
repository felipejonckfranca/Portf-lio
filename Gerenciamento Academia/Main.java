//Felipe Jonck França

package aula8;

import model.Aluno;
import model.Staff;
import javax.swing.*;

public class Aula8 {
    
    public static void main(String[] args) {
            
        int c = JOptionPane.showConfirmDialog(null, "Olá, bem vindo ao programa!\nGostaria de criar um usuario?\n\n\n Sim = Adicionar Aluno\n Não = Adicionar Staff\n Cancelar = Sair");
        
            switch (c) {
                case 0:
                    adicionaraluno();
                    break;
                case 1:
                    adicionarstaff();
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Até Mais!");
                    break;
            }
    }
        
    public static void adicionarstaff(){
        
        String[] tipos = new String[7];
        
        tipos[0]="COD";
        tipos[1]="Nome";
        tipos[2]="CPF";
        tipos[3]="Pagamento";
        tipos[4]="Idade";
        tipos[5]="Altura";
        tipos[6]="Peso";
       
        
        for (int i = 0; tipos.length > i; i++) {
            
            tipos[i]=JOptionPane.showInputDialog("Digite o(a) "+tipos[i]+" Do novo Staff: ");
                                    
        }
        
        Staff staff = new Staff();
        
        try {
            staff.setCod(tipos[0]);
            staff.setNome(tipos[1]);
            staff.setCpf(tipos[2]);
            staff.setPagamento(Double.parseDouble(tipos[3]));
            staff.setIdade(Integer.parseInt(tipos[4]));
            staff.setAltura(Double.parseDouble(tipos[5]));
            staff.setPeso(Double.parseDouble(tipos[6]));
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Algo deu errado! Confira os valores");
        }
        
        
        imprimirstaff(staff);
    }
        
    public static void imprimirstaff(Staff staff){
        String msg = "----------Staff Cadastrado----------\n";
      
        msg+= "Cod: "+staff.getCod()+"\n";
        msg+= "Nome: "+staff.getNome()+"\n";
        msg+= "Cpf: "+staff.getCpf()+"\n";
        msg+= "Pagamento: "+staff.getPagamento()+"\n";
        msg+= "Idade: "+staff.getIdade()+"\n";
        msg+= "Altura: "+staff.getAltura()+"\n";
        msg+= "Peso: "+staff.getPeso()+"\n \nCadastrar outro Staff?\n";

//        JOptionPane.showMessageDialog(null, msg);
        
        int a = JOptionPane.showConfirmDialog(null, msg);
        
        
        if(a==0){
            adicionarstaff();
        }else{
            JOptionPane.showMessageDialog(null, "Até Mais!");
        }
    }
        
    public static void adicionaraluno(){
            
        String[] tipos = new String[7];
       
        tipos[0]="COD";
        tipos[1]="Nome";
        tipos[2]="CPF";
        tipos[3]="Mensalidade";
        tipos[4]="Idade";
        tipos[5]="Altura";
        tipos[6]="Peso";
       
        
        for (int i = 0; tipos.length > i; i++) {
           
            tipos[i]=JOptionPane.showInputDialog("Digite o(a) "+tipos[i]+" Do novo aluno: ");
                                    
        }
        
        Aluno aluno = new Aluno();
        
        try {
            aluno.setCod(tipos[0]);
            aluno.setNome(tipos[1]);
            aluno.setCpf(tipos[2]);
            aluno.setMensalidade(Double.parseDouble(tipos[3]));
            aluno.setIdade(Integer.parseInt(tipos[4]));
            aluno.setAltura(Double.parseDouble(tipos[5]));
            aluno.setPeso(Double.parseDouble(tipos[6]));
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Algo deu errado! Verifique os dados");
        }
        
        
        imprimiraluno(aluno);
    }
    
    
    public static void imprimiraluno(Aluno aluno){
        String msg = "----------Aluno Cadastrado----------\n";
      
        msg+= "Cod: "+aluno.getCod()+"\n";
        msg+= "Nome: "+aluno.getNome()+"\n";
        msg+= "Cpf: "+aluno.getCpf()+"\n";
        msg+= "Mensalidade: "+aluno.getMensalidade()+"\n";
        msg+= "Idade: "+aluno.getIdade()+"\n";
        msg+= "Altura: "+aluno.getAltura()+"\n";
        msg+= "Peso: "+aluno.getPeso()+"\n \nCadastrar outro Aluno?\n";

//        JOptionPane.showMessageDialog(null, msg);
        
        int a = JOptionPane.showConfirmDialog(null, msg);
        
        
        if(a==0){
            adicionaraluno();
        }else{
            JOptionPane.showMessageDialog(null, "Até Mais!");
        }
        
        
    }
}
