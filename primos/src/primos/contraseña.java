
package primos;

import java.util.Scanner;


public class contraseña {
     public void laclave(){
        Scanner leer=new Scanner(System.in);
        clase2 obj=new clase2();
         int clave;
         int contraseña=4091;
         
             System.out.println("ingrese la contraseña");
             clave=leer.nextInt();
        if(clave == contraseña){
            System.out.println("correcto");
            obj.repetir();
             }else{
            System.out.println("error");
        }
    }
}

