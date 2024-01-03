package factorialr;

import javax.swing.JOptionPane;

public class factorial {
    public static void main(String[] args) {
        
    double n = Double.parseDouble(JOptionPane.showInputDialog(null,"Ingresa un numero para obtener el factorial"));

    JOptionPane.showMessageDialog(null,"El factorial del numero es "+fact(n));

    }

    public static double fact(double n){
        if(n>1){
            n = n * fact(n-1);
        }
        return(n);
    }
    
}
