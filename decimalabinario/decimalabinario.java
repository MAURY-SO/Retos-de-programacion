package decimalabinario;

import javax.swing.JOptionPane;

public class decimalabinario {
    public static void main(String[] args) {
    
        int n = Integer.parseInt(JOptionPane.showInputDialog(null,"Escribe un numero:"));
        String b="";

        while(n>0){

            if(n%2==0){
                b = "0" + b;
                n=-1;

            }else{

                b = "1" + b;

            }
            n/=2;
            System.out.println(n);

        }

        System.out.println("El numero en binario es "+b);

    }
}
