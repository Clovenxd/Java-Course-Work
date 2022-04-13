import java.util.Scanner;

public class TaxReturn {

    String social, last, first, addr, city, state, maritalStatus, income;
    int zip;
    double liability;

    public TaxReturn(String first, String last, String social, String maritalStatus, String addr, String city, int zip,  String state, String income){

        this.first = first;
        this.last = last;
        this.social = social;
        this.addr = addr;
        this.city = city;
        this.state = state;
        this.zip = zip;
        this.maritalStatus = maritalStatus;
        this.income = income;

        boolean hasComma = false;
        int b = 0;


        for(int i = 0; i < income.length(); i++){
            if(income.charAt(i) == ','){
                hasComma = true;
                break;
            }
        }
        if(hasComma){
            String[] s = income.split(",");
            for(int a = 0; a < s.length; a++){
                b += Integer.parseInt(s[a]);
            }
        }else{
            b = Integer.parseInt(income);
        }
        if(maritalStatus.toLowerCase().equals("m")){
            if(b >= 0 && b <= 20000){
                this.liability = b * .14;
            }else if(b >= 20001 && b <= 50000){
                this.liability = b * .20;
            }else if(b >= 50001){
                this.liability = b *.28;
            }else{
                System.out.println("Income can not be negative.");
            }
        }else{
            if(b >= 0 && b <= 20000){
                this.liability = b * .15;
            }else if(b >= 20001 && b <= 50000){
                this.liability = b * .22;
            }else if(b >= 50001){
                this.liability = b *.230;
            }else{
                System.out.println("Income can not be negative.");
            }
        }
    }

    public void display(){
        System.out.println("First          :   " + this.first + "\n" +
                            "Last           :   " + this.last + "\n" +
                            "Social         :   " + this.social + "\n" +
                            "Marital Status :   " + this.maritalStatus + "\n" +
                            "Annual Income  :   " + this.income + "\n" +
                            "Street Address :   " + this.addr + "\n" +
                            "City           :   " + this.city + "\n" +
                            "Zip Code       :   " + this.zip + "\n" +
                            "State          :   " + this.state + "\n" +
                            "Tax Liability  :   " + this.liability + "\n");
    }



/*
    public static void main(String[] args){
        String social = "", last = "", first = "", addr = "", city = "", state = "", liability = "", income = "", maritalStatus = "";
        int zip = 0;
        boolean valid = false;
        Scanner in = new Scanner(System.in);
        Scanner inInt = new Scanner(System.in);

        System.out.println("###################################");
        System.out.println("# Welcome to Anthony's Tax Return #");
        System.out.println("#         for homework 7-2        #");
        System.out.println("####################################");

        do{
            int a = 0;

            System.out.print("Enter your social security number(secured): ");

            if(in.hasNextLine()) {
                social = in.nextLine();
            }else{
                System.out.println("System.in Scanner does not have next line");
                valid = false;
            }
            for(int i = 0; i < social.length(); i++){
                if(social.charAt(i) == '-'){
                    a++;
                }
            }
            if(a == 2){
                String[] social2 = social.split("-");
                if(social2[0].length() == 3 && social2[1].length() == 2 && social2[2].length() == 4) {
                    valid = true;
                }else{
                    System.out.println("Enter Social in format 'xxx-xx-xxxx'");
                    valid = false;
                }
            }else{
                System.out.println("Social Security numbers can't contain negative numbers.");
                valid = false;
            }
        }while(!valid);

        do{
            System.out.print("Enter zip code: ");
            if(inInt.hasNextLine()){
                zip = inInt.nextInt();
            }else{
                System.out.println("System.in Scanner does not have next line");
                valid = false;
            }
            if(zip >= 10000 && zip <= 99999){
                valid = true;
            }else{
                System.out.println("Zip code must be 5 digits and not a negative number.");
                valid = false;
            }
        }while(!valid);

        do{
            System.out.print("Enter marital status((S)ingle, (M)arried: ");
            if(in.hasNextLine()){
                maritalStatus = in.nextLine();
            }else{
                System.out.println("System.in Scanner does not have next line");
                valid = false;
            }
            if(!maritalStatus.isEmpty()) {
                if (maritalStatus.length() == 1) {
                    if (maritalStatus.toLowerCase().equals("m") || maritalStatus.toLowerCase().equals("s")) {
                        valid = true;
                    } else {
                        System.out.println("Marital Status should be entered as: m for married, s for single");
                        valid = false;
                    }
                } else {
                    System.out.println("Marital Status should be entered as one character m for married, s for single");
                    valid = false;
                }
            }else{
                valid = false;
            }
        }while(!valid);

        do{
            int a = 0;
            System.out.print("Enter annual income: ");
            if(in.hasNextLine()){
                income = in.nextLine();
            }else{
                System.out.println("System.in Scanner does not have next line.");
                valid = false;
            }
            for(int i = 0; i < income.length(); i++){
                if(income.charAt(i) == '-'){
                    a++;
                }
            }
            if(a == 0){
                valid = true;
            }else{
                System.out.println("Annual income can not be negative.");
                valid = false;
            }
        }while(!valid);

        do{
            System.out.print("Enter Address: ");
            if(in.hasNextLine()){
                addr = in.nextLine();
                valid = true;
            }else{
                System.out.println("System.in scanner does not have next line.");
                valid = false;
            }
            System.out.print("Enter City: ");
            if(in.hasNextLine()){
                city = in.nextLine();
                valid = true;
            }else{
                System.out.println("System.in scanner does not have next line.");
                valid = false;
            }
            System.out.print("Enter State: ");
            if(in.hasNextLine()){
                state = in.nextLine();
                valid = true;
            }else{
                System.out.println("System.in scanner does not have next line.");
                valid = false;
            }
            System.out.print("Enter First Name: ");
            if(in.hasNextLine()){
                first = in.nextLine();
                valid = true;
            }else{
                System.out.println("System.in scanner does not have next line.");
                valid = false;
            }
            System.out.print("Enter Last name: ");
            if(in.hasNextLine()){
                last = in.nextLine();
                valid = true;
            }else{
                System.out.println("System.in scanner does not have next line.");
                valid = false;
            }
        }while(!valid);

        in.close();
        inInt.close();

        TaxReturn tax = new TaxReturn(first, last, social, maritalStatus, addr, city, zip, state, income);

        tax.display();
    }

 */
}