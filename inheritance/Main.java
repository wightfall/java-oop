package testinheritance;

public class Main {

    public static void main(String[] args) {
        Soldier s = new Soldier();
        
        s.setName("Chawalsak");
        s.setLastname("Phetchanchai");
        s.setBirthdate("1-Jan-2000");
        s.setRank("Captain");
        s.setAffiliate("Army");
        s.setSalary(25000);
        System.out.println("Name: "+s.getName()+" "+s.getLastname());
        System.out.println("Affilate: "+s.getAffiliate());
        System.out.println("Salary: "+s.getSalary());
    }

}
