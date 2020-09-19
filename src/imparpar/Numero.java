
package imparpar;

/**
 *
 * @author Leandro
 */
public abstract class Numero {
    private int n ;
    
    public Numero(int n) {
       this.n = n;
    }
    
    @Override
    public String toString() {
     if(n % 2 == 0 ){
         return n + "Par";
     }
        return n + "Impar"; 
    }
}
