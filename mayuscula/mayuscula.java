import javax.swing.JOptionPane;

public class mayuscula {
    public static void main(String[] args) {
        
        String pal = JOptionPane.showInputDialog(null,"Ingresa una frase en minuscula");
        String [] frase = pal.split(" ");

        for(int i=0;i<frase.length;i++){

             System.out.print(Mayus(frase,i)+" ");

        }

       
        
    }

    public static String Mayus(String[] args,Integer index){

        String pal = args[index];
        char [] palabra = pal.toCharArray();
        char [] dic = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
        char [] dic2 = {'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};
        

        for(int i=0; i<dic.length;i++){

            if(palabra[0]==dic[i]){

                palabra[0]=dic2[i];

            }

        }

        String salida = new String(palabra);

        return salida;

    }
    
}