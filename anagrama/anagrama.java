/*
 * Escribe una función que reciba dos palabras (String) y retorne
 * verdadero o falso (Bool) según sean o no anagramas.
 * - Un Anagrama consiste en formar una palabra reordenando TODAS
 *   las letras de otra palabra inicial.
 * - NO hace falta comprobar que ambas palabras existan.
 * - Dos palabras exactamente iguales no son anagrama.
 */

import java.util.Arrays;
import javax.swing.JOptionPane;

public class anagrama{
    public static void main(String[] mauricio) {

    System.out.println("Detector de anagramas");

    //Entrada de datos

    String p1=JOptionPane.showInputDialog(null,"Ingresa una palabra");
    String p2=JOptionPane.showInputDialog(null,"Ingresa otra palabra");

    //Convertir todos los caracteres en minuscula

    p1 = p1.toLowerCase();
    p2 = p2.toLowerCase();

    //Convertir en String en array de chars

    char pa1[]= p1.toCharArray();
    char pa2[]= p2.toCharArray();

    //Ordenar los caracteres

    Arrays.sort(pa1);
    Arrays.sort(pa2);

    System.out.println(Arrays.equals(pa1, pa2));

    }

}