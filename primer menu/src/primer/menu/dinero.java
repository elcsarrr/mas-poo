
package primer.menu;

import java.util.Scanner;

public class dinero {
    int peso=0, dolar=0, resultado=0;
    
     public void convercion(){
    
    }
      public void setDivision(int a, int b){
        peso=a;
        dolar=b;
        this.resultado=peso/dolar;
      }
      
      public void condiciones(){
          if (peso>=1000000) {
              System.out.println("el valor es demasiado grande");
        } else {
        
           System.out.println("esto equivale "+resultado+" dolar ");
              
          }
          
              
      }
      public void jair(){
          
        Scanner leer=new Scanner(System.in);
          int lospesos;
        int intentos=0;
        while(intentos<3){
            
        System.out.println("ingrese los pesos");
        lospesos=leer.nextInt();
        if (lospesos >=1000000){
            intentos=intentos+1;
        }
        else{
            
        
        setDivision(lospesos,3989);
        condiciones();
        intentos=3;
      }
        }
      }
}


      
