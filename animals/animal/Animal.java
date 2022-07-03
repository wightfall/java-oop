package animal;

public class Animal {
    private final String feature="Good";
    
    public void whoAmI(String message){
        System.out.println(this.feature);
        System.out.println("I am a "+message);
    }
    public void eat(){
        System.out.println("Animal can eat...");
    }

}