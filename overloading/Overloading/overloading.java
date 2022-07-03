package overloading;
import calculater.calculater;

public class Overloading {

    public static void main(String[] args) {
        calculater calculater = new calculater();
        System.out.println(calculater.plus(10, 40));
        System.out.println(calculater.plus(10.40f, 5));  
        System.out.println(calculater.plus(12, 2.0f));
        System.out.println(calculater.plus(15.0f,4.0f));
        System.out.println(calculater.minus(14, 8));
        System.out.println(calculater.minus(19.0f, 9));  
        System.out.println(calculater.minus(17, 12.0f));
        System.out.println(calculater.minus(13.0f,11.0f));
        System.out.println(calculater.multiply(16, 8));
        System.out.println(calculater.multiply(15.0f, 3));  
        System.out.println(calculater.multiply(14, 6.0f));
        System.out.println(calculater.multiply(17.0f,9.0f));
        System.out.println(calculater.divide(12, 6));
        System.out.println(calculater.divide(11.0f, 7));  
        System.out.println(calculater.divide(12, 5.0f));
        System.out.println(calculater.divide(13.0f,1.0f));

    }
    
}
