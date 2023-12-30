package numeroprimo;
import javax.swing.JOptionPane;

public class primo {
    
    public static void main(String[] args) {
        
    int n = Integer.parseInt(JOptionPane.showInputDialog(null,"Escribe un numero:")); 

    if((n%2==0)||(n%3==0)||(n%5==0)||(n%7==0)||(n%11==0)){

        JOptionPane.showMessageDialog(null,"El numero "+n+" no es primo");

    }else{

        JOptionPane.showMessageDialog(null,"El numero "+n+" es primo");

    }

    }

}
