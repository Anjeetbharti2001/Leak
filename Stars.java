class Employee{
    int salary = 70000;
}
//Inherited or Sub Class
class Engineer extends Employee {
    int benefits = 15000;
}

public class Stars{
    public static void main(String args[]){
        Engineer E1 = new Engineer();
        System.out.println("Salary : " + E1.salary + "\nBenefits : " + E1.benefits);
    }
}