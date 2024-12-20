
package operaciones;

import java.util.Scanner;

public class elArreglo {
Scanner leer=new Scanner(System.in);
private int x[];
private int tamaño;

private int sumar;
private int pares;
private int impares;

public void capacidad(){
    System.out.println("de cuanto quiere el tamaño del arreglo caballero ;D");
    tamaño=leer.nextInt();
}
public void crear(){
    x=new int[tamaño];
}
public void llenar(){
    int i=0;
    while(i<tamaño){
        System.out.println("ingrese un numero");
        x[i]=leer.nextInt();
        i++;
    }
}
public void mostrar(){
    for(int a=0;a<tamaño;a++){
        System.out.println(x[a]+" ");
    }
    
}
public void sumar (){
    for(int a=0;a<tamaño;a++){
        sumar=sumar+this.x[a];
        System.out.println("la suma de todos los pares"+sumar);
    }
    
}
public void pares (){
    for(int a=0;a<tamaño;a++){
        if(a%2==0){
            pares=pares+x[a];
        }
            
    }

    
}
public void imparess (){
    for(int a=0;a<tamaño;a++){
        if(a%1==0){
            impares=impares+x[a];
        }
        System.out.println("la suma de todos los impares"+impares);
    }
}
}
