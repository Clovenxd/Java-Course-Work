import javax.swing.*;

public class Faculty extends CollegeEmployee{
    boolean tenured;

    public Faculty(){
        String answer = JOptionPane.showInputDialog("Tenured yes or no.");
        if(answer.toLowerCase().equals("no")){
            this.tenured = false;
        }else if(answer.toLowerCase().equals("yes")){
            this.tenured = true;
        }else{
            JOptionPane.showMessageDialog(null, "Tenured only receives yes or no.");
        }
    }
    public void display(){
        System.out.print("First: " + first + " Last: " + last + " Address: " + address + " Zip code: " + zip + " Phone number: " + phone + " Social Security number: " + social + " Annual salary: " + salary + " Department: " + depart + " Tenured: " + tenured + ".");
    }

}
