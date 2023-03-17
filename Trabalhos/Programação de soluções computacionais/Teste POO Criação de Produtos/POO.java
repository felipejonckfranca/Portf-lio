package teste;
import Model.Produto;
import javax.swing.*;

public class Teste {
    
    public static void main(String[] args) {       
        criarproduto();
    }   
    
    public static void criarproduto(){
        String[] tipos = new String[5];
        
        tipos[0]="ID: ";
        tipos[1]="Nome: ";
        tipos[2]="Descrição: ";
        tipos[3]="Preço: ";
        tipos[4]="Estoque: ";
        
        
        for (int i = 0; tipos.length > i; i++) {
            tipos[i]=JOptionPane.showInputDialog("Digite o valor de "+tipos[i]);
        }
        
        Produto um = new Produto();
        um.setId(Integer.parseInt(tipos[0]));
        um.setNome(tipos[1]);
        um.setDescricao(tipos[2]);
        um.setPreco(Double.parseDouble(tipos[3]));
        um.setEstoque(Integer.parseInt(tipos[4]));
        
        imprimir(um);
    }
    
    
    public static void imprimir(Produto produto){
        String msg = "----------Produto Cadastrado----------\n";
      
        msg+= "ID: "+produto.getId()+"\n";
        msg+= "Nome: "+produto.getNome()+"\n";
        msg+= "Descrição: "+produto.getDescricao()+"\n";
        msg+= "Preço: "+produto.getPreco()+"\n";
        msg+= "Estoque: "+produto.getEstoque()+"\n Cadastrar outro produto?";

//        JOptionPane.showMessageDialog(null, msg);
        
        int a = JOptionPane.showConfirmDialog(null, msg);
        if(a==0){
            criarproduto();
        }else{
            JOptionPane.showMessageDialog(null, "Até Mais!");

        }
    }
}
