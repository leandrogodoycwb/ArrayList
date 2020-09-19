package imparpar;

import java.util.ArrayList;

public class ImparPar {

    public static void main(String[] args) {
        
            
        ArrayList<Impar> Impar = new  ArrayList<>();
        ArrayList<Par> Par = new  ArrayList<>();
        ArrayList<Numero> ImparPar = new  ArrayList<>();
        
        Impar.add(new Impar(21));
        Impar.add(new Impar(9));
        Par.add(new Par(4));
        Par.add(new Par(1000));
        ImparPar.add(new Impar(21));
        ImparPar.add(new Impar(22));
        ImparPar.add(new Par(662));
        
        for(Impar i : Impar){
            System.out.println(i);
        }
            for(Par p : Par){
            System.out.println(p);
        }
        for(Numero n : ImparPar){
            System.out.println(n);
        }
    }

    private static void add(Impar impar) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }
    }
    
    
    

