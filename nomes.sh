import javax.swing.JOptionPane;
 
class Main {
 
 
 public static void main(String[] args) {
   int anonascimento, idade;
   String nome;   
  
 
  anonascimento = (Integer.parseInt(JOptionPane.showInputDialog("Digite o ano em que você nasceu")));
   idade = (2021 - anonascimento);
  nome = (JOptionPane.showInputDialog("digite o seu nome"));
 
   nome = ("olá, "+nome+" sua idade é "+idade);
   JOptionPane.showMessageDialog(null, nome);
 
 }
}
