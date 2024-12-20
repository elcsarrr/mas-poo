
package primer.menu;

import java.util.Scanner;


public class perfectos {
    Scanner leer=new Scanner(System.in);
   public void perfectitos(){
       int suma=0;
       int numero=0;
       System.out.println("Digite un numero entero");
       numero=leer.nextInt();
       for (int i=1;i<numero;i++){
           if(numero%i==0)
               suma=suma+1;
           
               
           
       }
       if (suma==numero)
           System.out.println("el numero es perfecto");
       else
           System.out.println("el numero no es perfecto");
   }
}

