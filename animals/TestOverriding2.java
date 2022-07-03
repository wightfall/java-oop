package testoverriding2;
import animal.Dog;
import animal.Cat;
public class TestOverriding2 {

    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.whoAmI();
        dog.bark();
        Cat cat = new Cat();
        cat.whoAmI();
        cat.screem();
        
    }
    
}