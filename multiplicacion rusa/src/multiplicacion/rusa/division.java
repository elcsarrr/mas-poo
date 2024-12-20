
package multiplicacion.rusa;

import java.util.Scanner;



public class division {
 
     int a=0;
     int b=0;
     int acum;
     int multiplicar=0;
     int dividir=0;
     Scanner leer=new Scanner(System.in);
     
    public division(){
        
    }
    public void dividir(){
            
      
       if(b%2==0){
           acum=0;
           System.out.println(+acum);
       }
       else{
           acum=a;
       }
       while(b>=1){
           System.out.println(+acum);
           multiplicar=a*2;
           dividir=b/2;
                   a=multiplicar;
                   b=dividir;
                   System.out.println(+acum);
                   
                   if(b%2==0){
          
           
       }
       else{
           acum=acum+a;
       }
                   
                   
           
       }
       
   }
}
