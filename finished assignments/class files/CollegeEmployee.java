import javax.swing.*;

public class CollegeEmployee extends Person{
    String social, salary, depart;

    public CollegeEmployee(){
        this.social = JOptionPane.showInputDialog("Social Security number.");
        this.salary = JOptionPane.showInputDialog("Annually salary.");
        this.depart = JOptionPane.showInputDialog("Department.");
    }

    public void display(){
        System.out.print("First: " + first + " Last: " + last + " Address: " + address + " Zip code: " + zip + " Phone number: " + phone + " Social Security number: " + social + " Annual salary: " + salary + " Department: " + depart + "'");
    }


}
