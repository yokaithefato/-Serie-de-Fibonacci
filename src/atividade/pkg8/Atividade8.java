
package atividade.pkg8;


public class Atividade8 {

  
    public static void main(String[] args) {
    
        System.out.println("exibindo a serie de Fibonacci ate o decimo quinto termo. ");
      int primeiro = 0;
    int anterior = 1;
    
      
      
        for(int i = 0;i<=15;i++){
           int proximo = primeiro+anterior;
              System.out.println(proximo);
              primeiro=anterior;
              anterior=proximo;
     
        }
       
    }
    
}
