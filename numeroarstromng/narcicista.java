package numeroarstromng;
import javax.swing.JOptionPane;


public class narcicista {
    public static void main(String[] args) {
        
    String n = JOptionPane.showInputDialog(null,"Ingresa un numero:");
    int [] num = new int[n.length()];    
    int r = 0;

    for (int i = 0; i < n.length(); i++) {
        num[i] = Character.getNumericValue(n.charAt(i));
        r+=Math.pow(num[i],n.length());
    }

    if(r==Integer.parseInt(n)){

        System.out.println("Es un numero narcicista");

    }else{

        System.out.println("No es un numero narcicista");

    }

}

}
