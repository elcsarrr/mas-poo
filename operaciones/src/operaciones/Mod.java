
package operaciones;

public class Mod {
         int x=0;
        int y =0;
        int z=0;
    public void modsito(int a, int b){  
       
       x=a;
       y=b;
       this.z=x%y;
    }      
       public void imprimir (){
           System.out.println("el mod es = "+ z);
       }
}
