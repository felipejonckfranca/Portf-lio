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
        String lin = "";
        String col = "";
        
        int qtdlin = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de linhas da sua matriz:"));
        int qtdcol = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de colunas da sua matriz:"));

        String matriz[][] = new String[qtdlin][qtdcol];
        
        //escrever
        for (int j = 0; j < qtdlin; j++) {
            for (int k = 0; k < qtdcol; k++) {
                matriz[j][k] = JOptionPane.showInputDialog("Digite o nome para a linha "+(j+1)+" e coluna "+(k+1)+":");
            }
        }
        
        //ler
        String nomeprocura = JOptionPane.showInputDialog("Selecione o nome que deseja encontrar:");
        for (int j = 0; j < qtdlin; j++) {
            for (int k = 0; k < qtdcol; k++) {
                if(matriz[j][k].equalsIgnoreCase(nomeprocura)){
                    if(flag==0){
                        lin += (1+j);
                        col += (1+k);
                        flag = 1;
                    }else{
                        lin += ", "+(1+j);
                        col += ", "+(1+k);
                        flag = 2;
                    }
                    
                    
                }
                
            }
        }
        if(flag==0){
            JOptionPane.showMessageDialog(null, "Nome não encontrado :0");
        }
        if(flag==1){
            JOptionPane.showMessageDialog(null, "Nome "+nomeprocura+" encontrado na linha "+lin+" e coluna "+col+"!");;;;
        }
        if(flag==2){
            JOptionPane.showMessageDialog(null, "Nome "+nomeprocura+" encontrado nas linhas "+lin+" e colunas "+col+"!");
        }
        
        

    }
    
}
