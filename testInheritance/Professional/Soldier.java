package testInheritance.Professional;
public class Soldier extends Person{
    private String rank;
    private String affiliate;
    private double salary;

    public Soldier(){

    }
    public Soldier(String rank,String affiliate,int salary){
        this.rank=rank;
        this.affiliate=affiliate;
        this.salary=salary;
    }

    //Getters
    public String getRank(){
        return this.rank;
    }
    public String getAffiliate(){
        return this.affiliate;
    }
    public double getSalary(){
        return this.salary;
    }

        //Setters
    public void setRank(String rank){
        this.rank=rank;
    }
    public void setAffiliate(String affiliate){
        this.affiliate=affiliate;
    }
    public void setSalary(double salary){
        this.salary=salary;
    }
}