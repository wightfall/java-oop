package animal;

public class Cat extends Animal {
    private final String color="White";

    public void whoAmI(){
        System.out.println("Hey, I am a cat with color: "+color);
        super.whoAmI("Cat"); 
        System.out.println("A cat is an animal.");       
    }
    public void screem(){
        System.out.println("Meow Meow!!");
    }

    
    
}