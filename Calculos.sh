import javax.swing.JOptionPane;

public class Espelhosesféricos {
static float numero;
static float f;
static float p;
static float y;
static float mensagem;
static float y1;
static float p1;

    public static void main(String[] args) {
        faz();
        calculo();
    }

    public static void faz() {
          f= digitador("Digite o valor do foco");
         while(f <= 0) {
             if (f==0){
          f = digitador("Se o valor de foco for 0 o espelho é plano!\nPor favor,digite um numero diferente");
         }
             
             
         }
           p=digitador("digite a distancia entre o objeto e o vertice");
          while( p <= 0 )   {
              if (p==0){
                      p=digitador ("o objeto esta na superficie do espelho\nPor favor , digite um numero maior que 0") ; 
              }
              else{ 
                  p=digitador("O objeto esta dentro do espelho \nIsso é impossivel de acontecer \nSe acontecer significa que o espelho irá ser quebrado \nOu seja n tem calculo seu tanso");
            
              }
          
          if (p==f){
          JOptionPane.showMessageDialog(null," o foco não pode ser igual a distancia!");
              faz();}
    
      y=digitador("entre com o valor da altura do objeto");
      while (y==0){
          
          y=digitador("objeto sem altura, digite um novo valor diferente de 0");
         }
