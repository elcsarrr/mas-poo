
package primer.menu;

import java.util.Scanner;

public class centro {
    public void contraseñita(){
    Scanner leer=new Scanner(System.in);
         int clave;
         int contraseña=4091;
         int opciones;
         int volver;
         
             System.out.println("ingrese la contraseña");
             clave=leer.nextInt();
        if(clave == contraseña){
            System.out.println("la contraseña es correcta");
            
            System.out.println("Holi bienvenido a mi menu \n"
                    + "¿que programa desea visualizar?\n"
                    + "1. hola mundo\n"
                    + "2. tipos de datos\n"
                    + "3. su edad segun el año\n"
                    + "4. pesos colombianos-dolares\n"
                    + "5. numeros primos\n"
                    + "6. numeros perfectos\n"
                    + "Porfavor digite el numero del programa que desea ver\n");
            opciones=leer.nextInt();
            if(opciones == 1){
                holamundo obj=new holamundo();
                obj.holiwis();
            }
            if(opciones == 2){
                tiposDedatos obj=new tiposDedatos();
                obj.daticos();
            }
            if(opciones == 3){
                 int añoss;
               edad op=new edad();
               System.out.println("¿en que año nacio?");
               añoss=leer.nextInt();
              
               
        op.setResta(añoss, 2021);
        op.imprimirResultado();
            }
            if(opciones==4){
            dinero obj=new dinero();
            obj.jair();
                
            }
           if(opciones==5){
            primos obj=new primos();
            obj.repetir();
                
            }
             if(opciones==6){
            perfectos obj=new perfectos();
            obj.perfectitos();
                
            }
           if(opciones>=7){
               System.out.println("aprenda a escribir a leer y a escribir un numero >:v");
           }
            System.out.println("¿desea volver a ejecutar el programa?\n"
                    + "1.si\n"
                    + "2.no\n");
            volver=leer.nextInt();
           while(volver==1){
               contraseñita();
            if(volver==2){
                break;
            }             
           }
             }else{
            System.out.println("error contraseña incorrecta");
        }
        
}
    
}
