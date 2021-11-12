import javax.swing.*;

public class Person {

    String first, last, address, zip, phone;

    public Person(String a, String b, String c, String d, String e){

    }

    public Person(){
        this.first = JOptionPane.showInputDialog("First name.");
        this.last = JOptionPane.showInputDialog("Last name.");
        this.address = JOptionPane.showInputDialog("Address.");
        this.zip = JOptionPane.showInputDialog("Zip code.");
        this.phone = JOptionPane.showInputDialog("Phone number.");
    }
    public void display(){
        System.out.print("First: " + first + " Last: " + last + " Address: " + address + " Zip code: " + zip + " Phone number: " + phone + ".");
    }


/*
    public static void main(String[] args){
        Person jerry = new Person();
        Student jordan = new Student();
        CollegeEmployee andrew = new CollegeEmployee();
        Faculty ramiz = new Faculty();

        jerry.display();
        System.out.println();
        jordan.display();
        System.out.println();
        andrew.display();
        System.out.println();
        ramiz.display();

    }

 */




}



/*

Person—A Person contains a first name, last name, street address, zip code, and phone number. The class also includes a method that sets each data field, using a series of dialog boxes and
a display method that displays all of a Person’s information on a single line at the command line on the screen.


CollegeEmployee—CollegeEmployee descends from Person. A CollegeEmployee also includes a Social Security number, an annual salary, and a department name, as well as methods that override
the Person methods to accept and display all CollegeEmployee data.


Faculty—Faculty descends from CollegeEmployee. This class also includes a Boolean field that indicates whether the Faculty member is tenured, as well as methods that override the
CollegeEmployee methods to accept and display this additional piece of information.


Student—Student descends from Person. In addition to the fields available in Person, a Student contains a major field of study and a grade point average as well as methods that



 */