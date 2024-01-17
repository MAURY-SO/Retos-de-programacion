import javax.swing.JOptionPane;

public class codigomorse {
    public static void main(String[] args) {
        String [] dm = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        String d = "abcdefghijklmnopqrstuvwxyz";
        String p = JOptionPane.showInputDialog(null, "Ingresa una palabra: ");
        String m = "";

        for(int i=0;i<p.length();i++){
            m=m+dm[Index(d,p,i)]+" ";
        }

        System.out.println(m);

    }

    public static int Index(String d,String p,Integer index){
        byte c = 0;
        while(true){
            if (d.charAt(c)==p.charAt(index)){
                return c;
            } else {
                c+=1;
            }
        }
    }
}