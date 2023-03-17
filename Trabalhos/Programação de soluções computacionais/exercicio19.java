public class Exercicio19 {

    public static void main(String[] args) {
       
        String mensagem="";
        String frase = JOptionPane.showInputDialog("Digite uma frase: ");
        int quant = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de vezes para mostrar a frase: "));
       
        if(quant <= 0){
            JOptionPane.showMessageDialog(null, "Selecione um valor válido");
        }
               
        for(int i = 0; i < quant; i++){
            mensagem += frase+'\n';
        }
        JOptionPane.showMessageDialog(null, mensagem);        
       
       
    }
}
