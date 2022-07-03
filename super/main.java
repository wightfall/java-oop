class Car {
    public void numberOfwheels() {
        int Rubber = 8;
        System.out.println("นี่คือคลาส Car:"+ Rubber);
    }
    }

//extends
class SUVCar extends Car {
    public void numberOfwheels() {
        super.numberOfwheels();
        int Rubber = 4;
        System.out.println("จำนวนล้อของรถ SUV:"+ Rubber);
    }
    }

//main
public class Main {
    public static void main(String[] args) {
        SUVCar S = new SUVCar();
        S.numberOfwheels();
    }
    }
