/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula6;
import javax.swing.*;

/**
 *
 * @author 10723113325
 */
public class Aula6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int flag = 0;
        String i = "";
        int qtdnomes = Integer.parseInt(JOptionPane.showInputDialog("Informe a quantidade de elementos:"));
        String nomes[] = new String[qtdnomes];
        for (int j = 0; j < qtdnomes; j++) {
            nomes[j] = JOptionPane.showInputDialog("Digite o nome para a posição "+(j+1));
        }
        String nomeprocura = JOptionPane.showInputDialog("Digite o nome que você quer achar:");
        for (int j = 0; j < qtdnomes; j++) {
            if(nomes[j].equalsIgnoreCase(nomeprocura)){
                if(flag==0){
                    i+=(1+j);
                    flag=1;
                }
                else{
                    i+=", "+(1+j);
                    flag=2;
                }
            }         
        }
        if(flag==1){
            JOptionPane.showMessageDialog(null, "O nome "+nomeprocura+" está na posição "+i);
        }
        
        if(flag==2){
            JOptionPane.showMessageDialog(null, "O nome "+nomeprocura+" está nas posições "+i);
        }

        if(flag==0){
            JOptionPane.showMessageDialog(null, "O nome "+nomeprocura+" não foi encontrado :0");

        }
        
    }
    
}
