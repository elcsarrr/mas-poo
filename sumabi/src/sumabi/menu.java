
package sumabi;
import java.util.Scanner;
public class menu {
    Scanner leer=new Scanner(System.in);
 int f;
 int c;
 int array_1 [][]=new int [f][c];
 int array_2 [][]=new int [f][c];
 int resul_suma;  
 int acum;
   public void asignar (){
      
       System.out.println("ingrese las filas");
       f=leer.nextInt();
       System.out.println("ingresa las columnas");
       c=leer.nextInt();
       
   }
   public void llenar(){
   
   for(int i=0;i<array_1.length;i++){
       for(int j=0;j<array_1.length;j++){
           System.out.println("digite un numero");
        array_1[i][j]=leer.nextInt();
       }
     }
    for(int i=0;i<array_2.length;i++){
       for(int j=0;j<array_2.length;j++){
           System.out.println("digite un numero");
        array_2[i][j]=leer.nextInt();
    
       }
     }
   }
   public void suma(){
        for(int i=0;i<array_1.length;i++){
       for(int j=0;j<array_2.length;j++){
        resul_suma=array_1[i][j]+array_2[i][j];
       }
     }
   }
      public void resta(){
        for(int i=0;i<array_1.length;i++){
       for(int j=0;j<array_2.length;j++){
        resul_suma=array_1[i][j]-array_2[i][j];
       }
     }
   }
       public void divicion(){
        for(int i=0;i<array_1.length;i++){
       for(int j=0;j<array_2.length;j++){
        resul_suma=array_1[i][j]/array_2[i][j];
       }
     }
   }
          public void multi(){
        for(int i=0;i<array_1.length;i++){
       for(int j=0;j<array_2.length;j++){
        resul_suma=array_1[i][j]*array_2[i][j];
       }
     }
   }
          public void resultado(){
               for(int i=0;i<array_1.length;i++){
       for(int j=0;j<array_1.length;j++){
            System.out.print("["+array_1[i][j]+"]");
       
              System.out.print("   ");
              
      
    
       }
     
          }
               }
          }

    

       

   
 


