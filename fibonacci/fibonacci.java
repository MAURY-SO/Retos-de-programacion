package fibonacci;

public class fibonacci {
    
    public static void main(String[] args) {
        
    long num = 0;
    long num2 = 1;
    long a = 0;

    for(int i=0;i<50;i++){

        System.out.println(num);

        a = num + num2;
        num = num2;
        num2 = a;

    }

    }

System.out.println(num);

}
