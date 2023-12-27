import java.util.Arrays;

import javax.swing.JOptionPane;

public class anagrama{
    public static void main(String[] mauricio) {

    System.out.println("Detector de anagramas");
    String p1=JOptionPane.showInputDialog(null,"Ingresa una palabra");
    String p2=JOptionPane.showInputDialog(null,"Ingresa otra palabra");

    p1 = p1.toLowerCase();
    p2 = p2.toLowerCase();

    char pa1[]= p1.toCharArray();
    char pa2[]= p2.toCharArray();

    Arrays.sort(pa1);
    Arrays.sort(pa2);

    System.out.println("Las palabras "+p1+" y "+p2+" es "+Arrays.equals(pa1, pa2));

    }

}