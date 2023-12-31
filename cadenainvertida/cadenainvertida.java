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
