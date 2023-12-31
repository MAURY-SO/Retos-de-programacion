package decimalabinario;

import javax.swing.JOptionPane;

public class decimalabinario {
    public static void main(String[] args) {
    
        int n = Integer.parseInt(JOptionPane.showInputDialog(null,"Escribe un numero:"));
        String b="";

        while (n > 0) {
            int residuo = n % 2;
            b = residuo + b;
            n /= 2;
        }

        System.out.println("El numero en binario es "+b);

    }
}
