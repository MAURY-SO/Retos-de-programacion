package numeroprimo;

import javax.swing.JOptionPane;

public class primo2 {
    
    

    public static void main(String[] args) {
    
        int n = 0;

        for(int i=0;i<=100;i++){
        
            n=i;
            
            if((n%2!=0)&&(n%3!=0)&&(n%5!=0)&&(n%7!=0)&&(n%11!=0)){   

            }else{

                System.out.println(n);

            }
            
        }

    }

}
