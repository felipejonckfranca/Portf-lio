//Felipe Jonck França
package aula6;
import javax.swing.*;

public class Aula6 {

    public static void main(String[] args) {
        int j = 0;
        int soma=0;
        int LIN=3;
        int COL=3;
        
        int matriz[][] = new int[LIN][COL];
        
        //escrever
        for (j = 0; j < LIN; j++) {
            for (int k = 0; k < COL; k++) {
                matriz[j][k] = Integer.parseInt(JOptionPane.showInputDialog("Digite o numero para a linha "+(j+1)+" e coluna "+(k+1)+":"));
            }
        }
        /*
      
        //atv A:       
        for (int i = 0; i < LIN; i++) {
            soma+=matriz[i][0];
        }
        JOptionPane.showMessageDialog(null, "A soma dos elementos da primeira coluna é: "+soma);
        
        
        
        //atv B:
        int soma1=0;
        int soma2=0;
        int soma3=0;
        
        for (int i = 0; i < LIN; i++) {
            for (j = 0; j < COL; j++) {
                if(j==0){
                    soma1+=matriz[i][j];
                }
                if(j==1){
                    soma2+=matriz[i][j];
                }
                if(j==2){
                    soma3+=matriz[i][j];
                }
            }
        }
        JOptionPane.showMessageDialog(null, "A soma dos elementos da coluna 1 é: "+soma1);
        JOptionPane.showMessageDialog(null, "A soma dos elementos da coluna 2 é: "+soma2);
        JOptionPane.showMessageDialog(null, "A soma dos elementos da coluna 3 é: "+soma3);
        
        
        //atv C:
        int numeros[] = new int[LIN];
        int total = 0;
        for (int i = 0; i < LIN; i++) {
            numeros[i]+=matriz[i][1];
        }
        for (int i = 0; i < LIN; i++) {
            total = numeros[i] * total;
        }
        JOptionPane.showMessageDialog(null, "O produto dos elementos da primera linha é: "+total);
        
        //atv D:
        for (int i = 0; i < LIN; i++) {
            for (int k = 0; k < COL; k++) {
                soma+=matriz[i][k];
            }
        }
        JOptionPane.showMessageDialog(null, "A soma de todos os elementos é: "+soma);
        
        //atv E:
        for (int i = 0; i < LIN; i++) {
            for (int k = 0; k < COL; k++) {
                soma+=matriz[i][k];
            }
        }
        JOptionPane.showMessageDialog(null, "A média de todos os elementos é: "+(soma/(COL+LIN)));

        //atv F:
        for (int i = 0; i < LIN; i++) {
            for (int k = 0; k < COL; k++) {
                soma+=matriz[i][k];
            }
        }
        int media = soma/(COL+LIN);
        String num = "";
        for (int i = 0; i < LIN; i++) {
            for (int k = 0; k < COL; k++) {
                if (matriz[i][k]>media) {
                    num+=matriz[i][k]+"\n";
                }
            }
        }
        JOptionPane.showMessageDialog(null, "Os numeros maiores que a média são: "+num);
        
        //atv G:
        int maior = 0;
        int column = 0;
        int line = 0;
                
        for (int i = 0; i < LIN; i++) {
            for (int k = 0; k < COL; k++) {
                if (matriz[i][k]>maior) {
                    maior=matriz[i][k];
                    column=k;
                    line=i;
                }
            }
        }
        JOptionPane.showMessageDialog(null, "O maior numero é : "+maior+" na lina "+line+" e coluna "+column);
        
        //atv H:
        int menor = 999999999;
        int column = 0;
        int line = 0;
                
        for (int i = 0; i < LIN; i++) {
            for (int k = 0; k < COL; k++) {
                if (matriz[i][k]<menor) {
                    menor=matriz[i][k];
                    column=k;
                    line=i;
                }
            }
        }
        JOptionPane.showMessageDialog(null, "O menor numero é : "+menor+" na lina "+line+" e coluna "+column);

      */
    }
    
}
