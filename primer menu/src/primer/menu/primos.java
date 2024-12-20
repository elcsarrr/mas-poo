
package primer.menu;

import java.util.Scanner;


public class primos {
     Scanner leer=new Scanner(System.in);
    public void todo(){
        
        int a;
        int divisores=0;
      
        
        System.err.println("digite un numerito porfa");
        a=leer.nextInt();
        for(int i=1;i<=a;i++) {
            if(a%1==0){
                divisores++;
            }
            }
        if (divisores==2) {
            System.err.println("es primo");
          
        } else {
            System.err.println("no es primo :c");
        }
        
     
           
    }
    public void repetir(){
        int intentos=0;
        int veces=0;
         System.err.println("cuantos primos quiere realizar");
        intentos=leer.nextInt(); 
        while(veces<intentos){
            todo();        
        veces++;
        }
        
        
    }
   
}
    

