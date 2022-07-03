
package Car;

abstract class car {
    public void brand(){
        System.out.println( "Brand is honda");
    }   
    public void year(){
        System.out.println( "2010" );
    } 
    abstract void color();
    abstract void open();
    abstract void handle();
}
 
class CarHonda extends car  {
    public void color(){
        System.out.println("This car are contain color Blue,Green and Blown.");
    }
    public void open(){
        System.out.println("Car door is already open.");
    }
    public void handle(){
        System.out.println("Handle turning left and right.");
    }
    public void gear(){
        System.out.println("Gear mode is now using Auto");
    }
}
 
class AbstractCar {
    public static void main(String args[]){
        CarHonda car = new CarHonda();
        car.brand();
        car.year();
        car.color();
        car.open();
        car.handle();
        car.gear();
    }   
}
