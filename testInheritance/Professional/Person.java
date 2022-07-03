package testInheritance.Professional;
public class Person {
    private String name;
    private String lastname;
    private String birthdate;
    private String province;

    public Person(){

    }
    public Person(String name,String lastname,String birthdate,String province){
        this.name=name;
        this.lastname=lastname;
        this.birthdate=birthdate;
        this.province=province;
    }

    //Getters
    public String getName(){
        return this.name;
    }
    public String getLastname(){
        return this.lastname;
    }
    public String getBirthdate(){
        return this.birthdate;
    }
    public String getProvince(){
        return this.province;
    }

    //Setters
    public void setName(String name){
        this.name=name;
    }
    public void setLastname(String lastname){
        this.lastname=lastname;
    }
    public void setBirthdate(String birthdate){
        this.birthdate=birthdate;
    }
    public void setProvince(String province){
        this.province=province;
    }
}