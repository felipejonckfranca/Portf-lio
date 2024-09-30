//Felipe Jonck França

public class Exercicio23 {
    public static void main(String[] args) {
        int inicio = Integer.parseInt(JOptionPane.showInputDialog("digite o primeiro numero"));
        int finale = Integer.parseInt(JOptionPane.showInputDialog("digite o ultimo numero"));
       
        int i = inicio;
        int soma = 0;
       
        while(inicio<=i&&i<=finale){
            soma+=i;
            i++;
        }
        JOptionPane.showMessageDialog(null, soma);
       
    }

}
