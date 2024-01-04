import javax.swing.JOptionPane;

public class mayuscula {
    public static void main(String[] args) {
        
        String pal = JOptionPane.showInputDialog(null,"Ingresa una frase en minuscula");

        String [] p = pal.split(" ");

        System.out.println(Mayus(p,0));

    }

    public static String Mayus(String palabra){

        char aux[] = palabra.toCharArray();
        
        System.out.println(aux);

        return palabra;
    }

    
}