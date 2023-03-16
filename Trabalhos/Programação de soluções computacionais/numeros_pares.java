public class Exercicio21 {
    public static void main(String[] args) {
        String mensagem="";
        for (int i =33; i < 57; i++) {
            if(i%2==0){
                mensagem+=i+"\n";
            }
        }
        JOptionPane.showMessageDialog(null, mensagem);
       
        }    
}
