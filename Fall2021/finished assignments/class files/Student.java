import javax.swing.*;

public class Student extends Person{
    String gpa, major;

    public Student(){
        this.gpa = JOptionPane.showInputDialog("Grade point average.");
        this.major = JOptionPane.showInputDialog("Major.");
    }
    public void display(){
        System.out.print("First: " + first + " Last: " + last + " Address: " + address + " Zip code: " + zip + " Phone number: " + phone + " GPA: " + gpa + " Major: " + major + ".");
    }
}
