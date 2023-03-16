public class Exercicio22 {
    public static void main(String[] args) {
        double soma = 0;
        int i = 0;
        while(i<1001){
            soma+=i;
           
        }
        double media = soma/1000;
        JOptionPane.showMessageDialog(null, media);
       
    }
}
