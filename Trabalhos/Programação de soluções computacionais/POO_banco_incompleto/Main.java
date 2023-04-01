package banco;

import javax.swing.*;
import model.Usuario;
import model.Conta;

public class Banco {

    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, "Olá, você está em um sistema de testes e vai precisar criar "
                + "dois usuarios diferentes e fazer diferentes ações como sacar, depositar e transferir");
        
        criarUser1(0);
    }
    
    public static void criarUser1(int vez){
        
        Usuario um = new Usuario();
        Conta cum = new Conta();

        
        if(vez==0){
            String[] tipos = new String[3];
            
            tipos[0]="Nome";
            tipos[1]="CPF";
            tipos[2]="Idade";
       
        
            for (int i = 0; tipos.length > i; i++) {
           
               tipos[i]=JOptionPane.showInputDialog("Digite o(a) "+tipos[i]+" do usuario 1: ");
                                    
         }
        
        
            try {
                um.setNome(tipos[0]);
                um.setCpf(tipos[1]);
                um.setIdade(Integer.parseInt(tipos[2]));
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Algo deu errado! Verifique os dados");
            }
        
        
        

          String[] conta = new String[2];
       
            tipos[0]="Numero";
            tipos[1]="Saldo";
                    
        
            for (int i = 0; conta.length > i; i++) {
           
                conta[i]=JOptionPane.showInputDialog("Digite o "+conta[i]+" da conta do usuario 1: ");
                                    
            }
        
            
        
            try {
                cum.setNumero(conta[0]);
                cum.setTitular(um);
                cum.setSaldo(Double.parseDouble(conta[1]));
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Algo deu errado! Verifique os dados");
            }
    
        
            cum.mostrarDados();
        
            criarUser2();
            
        }else if(vez==1){
            cum.sacar(100);
        }
       
        
    }
    
    public static void criarUser2(){
        String[] tipos = new String[3];
       
        tipos[0]="Nome";
        tipos[1]="CPF";
        tipos[2]="Idade";
       
        
        for (int i = 0; tipos.length > i; i++) {
           
            tipos[i]=JOptionPane.showInputDialog("Digite o(a) "+tipos[i]+" do usuario 2: ");
                                    
        }
        
        Usuario dois = new Usuario();
        
        try {
            dois.setNome(tipos[0]);
            dois.setCpf(tipos[1]);
            dois.setIdade(Integer.parseInt(tipos[2]));
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Algo deu errado! Verifique os dados");
        }
        
        
        

        String[] conta = new String[2];
       
        tipos[0]="Numero";
        tipos[1]="Saldo";
                    
        
        for (int i = 0; conta.length > i; i++) {
           
            conta[i]=JOptionPane.showInputDialog("Digite o "+conta[i]+" da conta do usuario 2: ");
                                    
        }
        
        Conta cdois = new Conta();
        
        try {
            cdois.setNumero(conta[0]);
            cdois.setTitular(dois);
            cdois.setSaldo(Double.parseDouble(conta[1]));
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Algo deu errado! Verifique os dados");
        }
    
        
        cdois.mostrarDados();
        
        acoes();
    }
    
    public static void acoes(){
        Object[] options = { "Saque/Deposito", "Transferencia" }; 
        int i = JOptionPane.showOptionDialog(null, "Olá, seja bem vindo ao programa\n\nGostaria de "
                + "Fazer um saque/deposito ou um transferencia?", "Teste", JOptionPane.YES_NO_OPTION, 
                JOptionPane.QUESTION_MESSAGE, null, options, options[0]);
        switch (i) {
            case JOptionPane.YES_OPTION:
                saque_deposito();
                break;
            case JOptionPane.NO_OPTION:
                trasnfer();
                break;
            default:
                System.exit(0);
        }
    }
    
    public static void trasnfer(){
        
    }
    
    public static void saque_deposito(){
        Object[] options = { "Saque", "Deposito" }; 
        int i = JOptionPane.showOptionDialog(null, "Olá, seja bem vindo ao programa\n\nGostaria de "
                + "Fazer um saque ou um deposito?", "Teste", JOptionPane.YES_NO_OPTION, 
                JOptionPane.QUESTION_MESSAGE, null, options, options[0]);
        switch (i) {
            case JOptionPane.YES_OPTION:
                saque();
                break;
            case JOptionPane.NO_OPTION:
                deposito();
                break;
            default:
                System.exit(0);
        }
    }
    
    public static void saque(){
        String a = JOptionPane.showInputDialog("Selecione o usuario para sacar (um ou dois)");
        
        if(a=="um"){
            criarUser1(1);
        }else if(a=="dois"){
            criarUser2(1);
        }
    }
    
    public static void deposito(){
        String a = JOptionPane.showInputDialog("Selecione o usuario para depositar (um ou dois)");
        
        if(a=="um"){
            criarUser1(1);
        }else if(a=="dois"){
            criarUser2(1);
        }
    }
    
}
