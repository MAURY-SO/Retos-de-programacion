package factorialr;

public class factorial {
    public static void main(String[] args) {
        
    System.out.println(fact(4));

    }

    public static double fact(double n){
        if(n>1){
            n = n * fact(n-1);
        }
        return(n);
    }
    
}
