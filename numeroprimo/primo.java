/*
 * Escribe un programa que se encargue de comprobar si un número es o no primo.
 * Hecho esto, imprime los números primos entre 1 y 100.
 */
package numeroprimo;
import javax.swing.JOptionPane;

public class primo {
    
    public static void main(String[] args) {
        
    int n = Integer.parseInt(JOptionPane.showInputDialog(null,"Escribe un numero:")); 
    boolean esPrimo = esNumeroPrimo(n);
        
    if (esPrimo) {
        System.out.println(n + " es un número primo.");
    } else {
        System.out.println(n + " no es un número primo.");
    }

    for (int i = 2; i < 100; i++) {
        if (esNumeroPrimo(i)) {
            System.out.print(i + " ");
        }
    }

    }

    public static boolean esNumeroPrimo(int numero) {
        if (numero <= 1) {
            return false;
        }
        
        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) {
                return false;
            }
        }
        
        return true;
    }

}

