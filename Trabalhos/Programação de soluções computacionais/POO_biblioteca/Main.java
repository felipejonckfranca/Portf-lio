package atv3;

import javax.swing.*;
import model.Usuario;
import model.Livro;

public class Atv3 {

    public static void main(String[] args) {
        int c = JOptionPane.showConfirmDialog(null, "Olá, bem vindo ao programa!\nGostaria de adicionar um usuario?\n\n\n Sim = Adicionar Usuario/Livro\n Não = Editar quantidade de livros em um User\n Cancelar = Sair");
        
        switch (c) {
            case 0:
                adicionar();
                break;
            case 1:
                editarLivro();
                break;
            default:
                JOptionPane.showMessageDialog(null, "Até Mais!");
                break;
        }
    }
    
    public static void adicionar(){
        int c = JOptionPane.showConfirmDialog(null, "Gostaria de adicionar um usuario?\n\n\n Sim = Adicionar Usuario\n Não = Adicionar Livro\n Cancelar = Sair");
        
        switch (c) {
            case 0:
                adicionarUser();
                break;
            case 1:
                adicionarLivro();
                break;
            default:
                JOptionPane.showMessageDialog(null, "Até Mais!");
                break;
        }
    }
    
    public static void adicionarUser(){
        String[] tipos = new String[4];
       
        tipos[0]="COD";
        tipos[1]="Nome";
        tipos[2]="CPF";
        tipos[3]="Idade";
       
        
        for (int i = 0; tipos.length > i; i++) {
           
            tipos[i]=JOptionPane.showInputDialog("Digite o(a) "+tipos[i]+" Do novo usuario: ");
                                    
        }
        
        Usuario aluno = new Usuario();
        
        try {
            aluno.setCod(tipos[0]);
            aluno.setNome(tipos[1]);
            aluno.setCpf(tipos[2]);
            aluno.setIdade(Integer.parseInt(tipos[3]));
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Algo deu errado! Verifique os dados");
        }
        
        
        imprimirUser(aluno);
    }
    
    public static void imprimirUser(Usuario aluno){
        String msg = "----------Usuario Cadastrado----------\n";
      
        msg+= "Cod: "+aluno.getCod()+"\n";
        msg+= "Nome: "+aluno.getNome()+"\n";
        msg+= "Cpf: "+aluno.getCpf()+"\n";
        msg+= "Idade: "+aluno.getIdade()+"\n \nCadastrar outro usuario?\n";

//        JOptionPane.showMessageDialog(null, msg);
        
        int a = JOptionPane.showConfirmDialog(null, msg);
        
        
        if(a==0){
            adicionarUser();
        }else{
            JOptionPane.showMessageDialog(null, "Até Mais!");
        }
    }
    
    public static void adicionarLivro(){
        String[] tipos = new String[6];
       
        tipos[0]="Autor";
        tipos[1]="Nome";
        tipos[2]="Editora";
        tipos[3]="Descrição";
        tipos[4]="Ano de lançamento";
        tipos[5]="Quantidade";
       
        
        for (int i = 0; tipos.length > i; i++) {
           
            tipos[i]=JOptionPane.showInputDialog("Digite o(a) "+tipos[i]+" Do novo livro: ");
                                    
        }
        
        Livro livro = new Livro();
        
        try {
            livro.setAutor(tipos[0]);
            livro.setNome(tipos[1]);
            livro.setEditora(tipos[2]);
            livro.setDescricao(tipos[3]);
            livro.setAno_lanc(Integer.parseInt(tipos[4]));
            livro.setQuant(Integer.parseInt(tipos[5]));
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Algo deu errado! Verifique os dados");
        }
        
        
        imprimirLivro(livro);
    }
    
    public static void imprimirLivro(Livro livro){
        String msg = "----------Livro Cadastrado----------\n";
      
        msg+= "Autor: "+livro.getAutor()+"\n";
        msg+= "Nome: "+livro.getNome()+"\n";
        msg+= "Editora: "+livro.getEditora()+"\n";
        msg+= "Descrição: "+livro.getDescricao()+"\n";
        msg+= "Ano de lançamento: "+livro.getAno_lanc()+"\n";
        msg+= "Quantidade: "+livro.getQuant()+"\n\nCadastrar outro livro?\n";

//        JOptionPane.showMessageDialog(null, msg);
        
        int a = JOptionPane.showConfirmDialog(null, msg);
        
        
        if(a==0){
            adicionarLivro();
        }else{
            JOptionPane.showMessageDialog(null, "Até Mais!");
        }
    }
    
    public static void editarLivro(){
        JOptionPane.showMessageDialog(null, "Construção em progresso, venha mais tarde!");
    }
    
}
