package fizzbuzz;
public class fizzbazz{
    public static void main(String[] mauricio) {

    System.out.println("fizzbuzz");

    for(byte i=1;i<=100;i++){

        if((i%3==0)&&(i%5==0)){

            System.out.println("fizzbuzz");

        }else if(i%3==0){

            System.out.println("fizz");

        }else if(i%5==0){

            System.out.println("buzz");

        }else{

            System.out.println(i);

        }

    }

    }


}