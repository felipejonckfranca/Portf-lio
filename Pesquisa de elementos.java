//Felipe Jonck França


package aula6;
import javax.swing.*;


public class Aula6 {

    
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
                    break;
                }
            }         
        }
        if(flag==1){
            JOptionPane.showMessageDialog(null, "O nome "+nomeprocura+" está na posição "+i);
        }
        
        if(flag==0){
            JOptionPane.showMessageDialog(null, "O nome "+nomeprocura+" não foi encontrado :0");

        }
        
    }
    
}
