package palindromo;

import javax.swing.JOptionPane;
import java.util.ArrayList;

public class palindromo {
    public static void main(String[] args) {
        ArrayList<Character> listaori = new ArrayList<Character>();
        ArrayList<Character> listarever = new ArrayList<Character>();
        String p = JOptionPane.showInputDialog(null,"Ingresa una frase:");

        p = p.toLowerCase();

        for(int i=0;i<p.length();i++){
            if(p.charAt(i)!=' '){

                listaori.add(p.charAt(i));

            }
            
        }

        for(int i=p.length()-1;i>=0;i--){
            if(p.charAt(i)!=' '){

                listarever.add(p.charAt(i));

            }
        }

        boolean pal = listaori.equals(listarever);

        if(pal){

            System.out.println("Palindromos");

        }else{

            System.out.println("No palindormos");

        }
        
        System.out.println(listarever);
        System.out.println(listaori);

    }

    
}
