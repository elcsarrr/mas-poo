
package operaciones;

import java.util.Scanner;


public class menu {
    int opciones=0;
     int a=0;
        int b=0;
       Scanner leer=new Scanner(System.in);
    public void menucito(){
           System.out.println("Holi bienvenido a mi menu \n"
                    + "¿que programa desea visualizar?\n"
                    + "1. suma\n"
                    + "2. resta\n"
                    + "3. division\n"
                    + "4. multiplicacion\n"
                    + "5. mod\n"
                    + "6. arreglos\n"
                    + "Porfavor digite el numero del programa que desea ver\n");
        
        opciones=leer.nextInt();
        
        if( opciones==1){ 
       
        System.out.println("ingrese un numero");
        a=leer.nextInt();
        System.out.println("ingrese otro numero");
        b=leer.nextInt();
        suma op=new suma();
        op.sumaita(a,b);
                op.imprimir(); 
        }     
                if( opciones==2){
      
                     System.out.println("ingrese un numero");
                     b=leer.nextInt();
                     System.out.println("ingrese otro numero");
                      a=leer.nextInt();
                       resta op1=new resta();
                       op1.restica(b,a);
                       op1.imprimir();
                }
                
                if( opciones==3){
                 
                    System.out.println("ingrese un numero");
                     b=leer.nextInt();
                     System.out.println("ingrese otro numero");
                      a=leer.nextInt();
                       multiplicacion op=new multiplicacion();
                       op.multiplicasao(a, b);
                       op.imprimir();
                }
                if( opciones==4){
                   
                    System.out.println("ingrese un numero");
                     b=leer.nextInt();
                     System.out.println("ingrese otro numero");
                      a=leer.nextInt();
                       division op=new division();
                       op.divisioooon(b, a);
                       op.imprimir();
                }
                if( opciones==5){
              
                    System.out.println("ingrese un numero");
                     b=leer.nextInt();
                     System.out.println("ingrese otro numero");
                      a=leer.nextInt();
                       Mod op=new Mod();
                       op.modsito(b, a);
                       op.imprimir();
                }
                if(opciones==6){
                    elArreglo op=new elArreglo();
                    op.capacidad();
                    op.crear();
                   
                    op.llenar();
                    op.mostrar();
                    op.sumar();
                    op.pares();
                    op.imparess();
                }

    }
}
      
           
  

