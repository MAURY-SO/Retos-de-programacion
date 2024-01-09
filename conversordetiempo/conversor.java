public class conversor {
    public static void main(String[] args) {
        

    System.out.println(Conversor(23,1,5,6)+" milisegundos");

    }

    static int Conversor(int dias,int horas,int minutos,int segundos){

        int v1 = dias * 24 * 60 * 60 * 1000;
        int v2 = horas * 60 * 60 * 1000;
        int v3 = minutos * 60 * 1000;
        int v4 = segundos * 1000;

        return v1 + v2 + v3 + v4;
    }
}