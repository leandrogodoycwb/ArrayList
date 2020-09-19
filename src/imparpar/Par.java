package imparpar;
public class Par extends Numero {
    private int par;

    public Par(int n) {
        super(n);
    }

    public int getPar() {
        return par;
    }

    @Override
    public String toString() {
        
        return "Par, nº " +super.toString(); 
    }
}
