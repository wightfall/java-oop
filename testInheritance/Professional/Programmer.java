package testInheritance.Professional;
public class Programmer extends Person{
    private String UserId;
    private String Position;
    private String Company;

    public Programmer(){

    }
    public Programmer(String UserId,String Position,String Company){
        this.UserId=UserId;
        this.Position=Position;
        this.Company=Company;
    }

    //Getters
    public String getUserId(){
        return this.UserId;
    }
    public String getPosition(){
        return this.Position;
    }
    public String getCompany(){
        return this.Company;
    }

    //Setters
    public void setUserId(String UserId){
        this.UserId=UserId;
    }
    public void setPosition(String Position){
        this.Position=Position;
    }
    public void setCompany(String Company){
        this.Company=Company;
    }
}