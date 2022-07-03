package animal;

public class Dog extends Animal {
    private final String color="Black";

    public void whoAmI(){
        System.out.println("Hey, I am a dog with color: "+color);
        super.whoAmI("Dog"); 
        System.out.println("A dog is an animal.");       
    }
    public void bark(){
        System.out.println("Hong! Hong! hong!!!!");
    }

    
    
}