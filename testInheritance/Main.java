package testInheritance;

import testInheritance.Professional.Soldier;
import testInheritance.Professional.Person;
import testInheritance.Professional.Programmer;
public class Main {
    public static void main(String[] args){
        Soldier s = new Soldier();
        //inputs
        s.setName("Prawit");
        s.setLastname("Pakdee");
        s.setBirthdate("24/04/1982");
        s.setRank("Gold");
        s.setAffiliate("Army");
        s.setSalary(100000);
        //Outputs
        System.out.println("Name: "+s.getName()+" "+s.getLastname());
        System.out.println("Affilate: "+s.getAffiliate());
        System.out.println("Salary: "+s.getSalary()+"\n");
        
        Programmer programmer = new Programmer();
//        input
        programmer.setName("Wiwat");
        programmer.setLastname("Yeesantea");
        programmer.setBirthdate("18/03/1999");
        programmer.setUserId("1040");
        programmer.setPosition("Project Manager");
        programmer.setCompany("Wightfall co.ltd");
//        output
        System.out.println("Name: "+programmer.getName()+" "+programmer.getLastname());
        System.out.println("Birthdate: "+programmer.getBirthdate());
        System.out.println("UserId: "+programmer.getStudentId());
        System.out.println("Position: "+programmer.getPosition());
        System.out.println("Company: "+programmer.getCompany());
    } 
}