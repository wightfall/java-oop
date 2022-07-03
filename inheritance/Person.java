package testinheritance;

public class Person {
    private String name;
    private String lastname;
    private String birthdate;
    public Person(String name, String lastname, String birthdate){
        this.name=name;
        this.lastname=lastname;
        this.birthdate=birthdate;
    }
    public Person(){
        //empty
    }
    //getters
    public String getName(){
        return this.name;
    }
    public String getLastname(){
        return this.lastname;
    }
    public String getBirthdate(){
        return this.birthdate;
    }
    
    //setters
    public void setName(String name){
        this.name=name;
    }
    public void setLastname(String lastname){
        this.lastname=lastname;
    }
    public void setBirthdate(String birthdate){
        this.birthdate=birthdate;
    }
}
