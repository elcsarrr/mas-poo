
package primer.menu;

public class edad {
    int nacimiento=0, actualidad=0, resultado=0;

    public void laresta(){
    
    }
        
    public void setResta(int a, int b){
        nacimiento=b;
        actualidad=a;
        this.resultado=nacimiento-actualidad;
         
    }
    
    public void imprimirResultado(){
           System.out.println("tu tienes esta edad ="+resultado);
     }
    
}
