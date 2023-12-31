/*
 * Crea un programa que invierta el orden de una cadena de texto
 * sin usar funciones propias del lenguaje que lo hagan de forma automática.
 * - Si le pasamos "Hola mundo" nos retornaría "odnum aloH"
 */
package cadenainvertida;

import javax.swing.JOptionPane;

public class cadenainvertida {
    public static void main(String[] args) {
        
        String c = JOptionPane.showInputDialog(null, "Ingresa una frase:");

        for(int i=c.length()-1;i>=0;i--){

            System.out.print(c.charAt(i));

        }

    }
}
