package heranca;

import javax.swing.*;
import model.Aluno;
import model.Professor;

public class Heranca {

    public static void main(String[] args) {
        
        Object[] options = { "Aluno", "Professor" }; 
        int i = JOptionPane.showOptionDialog(null, "Olá, seja bem vindo ao programa\n\nGostaria de "
                + "Cadastrar Alunos ou Professores?", "Inicialização", JOptionPane.YES_NO_OPTION, 
                JOptionPane.QUESTION_MESSAGE, null, options, options[0]);
        switch (i) {
            case JOptionPane.YES_OPTION:
                aluno();
                break;
            case JOptionPane.NO_OPTION:
                prof();
                break;
            default:
                System.exit(0);
        }
        
    }
    
    public static void aluno(){
        Object[] options = { "Adicinar", "Editar" }; 
        int i = JOptionPane.showOptionDialog(null, "Olá, seja bem vindo ao setor de alunos\n\n\n"
                + "Gostaria de adicionar um aluno, ou editar um aluno existente?",
                "Alunos", JOptionPane.YES_NO_OPTION, 
                JOptionPane.QUESTION_MESSAGE, null, options, options[0]);
        switch (i) {
            case JOptionPane.YES_OPTION:
                adicionarAluno();
                break;
            case JOptionPane.NO_OPTION:
                editarAluno();
                break;
            default:
                System.exit(0);
        }
    }
    
    public static void prof(){
        Object[] options = { "Adicinar", "Editar" }; 
        int i = JOptionPane.showOptionDialog(null, "Olá, seja bem vindo ao setor de profs\n\n\n"
                + "Gostaria de adicionar um professor, ou editar um professor existente?",
                "Professores", JOptionPane.YES_NO_OPTION, 
                JOptionPane.QUESTION_MESSAGE, null, options, options[0]);
        switch (i) {
            case JOptionPane.YES_OPTION:
                adicionarProf();
                break;
            case JOptionPane.NO_OPTION:
                editarProf();
                break;
            default:
                System.exit(0);
        }
    }

//------------------------------------------------------------------------------    
    
    public static void adicionarProf(){
        String[] tipos = new String[6];
       
        tipos[0]="COD";
        tipos[1]="Nome";
        tipos[2]="CPF";
        tipos[3]="Idade";
        tipos[4]="RP";
        tipos[5]="Salário";
       
        
        for (int i = 0; tipos.length > i; i++) {
           
            tipos[i]=JOptionPane.showInputDialog("Digite o(a) "+tipos[i]+" Do novo professor: ");
                                    
        }
        
        Professor prof = new Professor();
        
        try {
            prof.setCod(tipos[0]);
            prof.setNome(tipos[1]);
            prof.setCpf(tipos[2]);
            prof.setSalario(Double.parseDouble(tipos[5]));
            prof.setIdade(Integer.parseInt(tipos[3]));
            prof.setRp(tipos[4]);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Algo deu errado! Verifique os dados");
        }
        
        
        prof.mostrarDados();
    }
    
    public static void editarProf(){
        JOptionPane.showMessageDialog(null, "Ainda estou aprendendo a criar um BD, então essa função"
                + " não funciona ainda :p");
    }
    
    public static void adicionarAluno(){
        
        String[] tipos = new String[6];
       
        tipos[0]="COD";
        tipos[1]="Nome";
        tipos[2]="CPF";
        tipos[3]="Idade";
        tipos[4]="RA";
        tipos[5]="Mensalidade";
       
        
        for (int i = 0; tipos.length > i; i++) {
           
            tipos[i]=JOptionPane.showInputDialog("Digite o(a) "+tipos[i]+" Do novo aluno: ");
                                    
        }
        
        Aluno aluno = new Aluno();
        
        try {
            aluno.setCod(tipos[0]);
            aluno.setNome(tipos[1]);
            aluno.setCpf(tipos[2]);
            aluno.setMensalidade(Double.parseDouble(tipos[5]));
            aluno.setIdade(Integer.parseInt(tipos[3]));
            aluno.setRa(tipos[4]);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Algo deu errado! Verifique os dados");
        }
        
        
        aluno.mostrarDados();
    }
    
    public static void editarAluno(){
        JOptionPane.showMessageDialog(null, "Ainda estou aprendendo a criar um BD, então essa função"
                + " não funciona ainda :p");
    }
    
}
    

