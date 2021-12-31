import java.util.Scanner;

public class CellPhoneService {

    /*
    public static void main(String[] args){

    int mins = 0, texts = 0, data = 0, plan = 0;

    Scanner in = new Scanner(System.in);

    System.out.println("#######################");
    System.out.println("# Welcome to Horizon! #");
    System.out.println("#######################");

    System.out.println("\nI'm going to ask for some details to provide the best recommendation " +
                        "i can for a phone plan that suits you!");

    System.out.print("\nWhat is the max amount of minutes you'll use for calling in a month?: ");
    if(in.hasNextLine()){
        mins = in.nextInt();
    }
    System.out.print("What is the max amount of texts that will be sent ina month?: ");
    if(in.hasNextLine()){
        texts = in.nextInt();
    }
    System.out.print("What is the max amount of Gigabyets of data that will be used in a month?: ");
    if(in.hasNextLine()){
        data = in.nextInt();
    }

    in.close();

    plan = whichPlan(mins, texts, data);

    if(mins >= 0 && texts >= 0 && data >= 0){
        switch (plan){
            case 1:     System.out.println("I recommend Plan A it suits your needs the best!");
                        System.out.println("Plan A(49$/month):\n" +
                                            "<500 minutes/Month\n" +
                                            "0 texts/Month\n" +
                                            "0 Gigabytes/Month");
                        break;
            case 2:     System.out.println("I recommend Plan B it suits your needs the best!");
                        System.out.println("Plan B(55$/month):\n" +
                                            "<500 minutes/Month\n" +
                                            ">0 texts/Month\n" +
                                            "0 Gigabytes/Month");
                        break;
            case 3:     System.out.println("I recommend Plan C it suits your needs the best!");
                        System.out.println("Plan C(61$/month):\n" +
                                            ">=500 minutes/Month\n" +
                                            "<100 texts/Month\n" +
                                            "0 Gigabytes/Month");
                        break;
            case 4:     System.out.println("I recommend Plan D it suits your needs the best!");
                        System.out.println("Plan D(70$/month):\n" +
                                            ">=500 minutes/Month\n" +
                                            ">=100 texts texts/Month\n" +
                                            "0 Gigabytes/Month");
                        break;
            case 5:     System.out.println("I recommend Plan E it suits your needs the best!");
                        System.out.println("Plan E(79$/month):\n" +
                                            "0 minutes/Month\n" +
                                            "0 texts/Month\n" +
                                            "<3 Gigabytes/Month");
                        break;
            case 6:     System.out.println("I recommend Plan F it suits your needs the best!");
                        System.out.println("Plan F(87$/month):\n" +
                                            "0 minutes/Month\n" +
                                            "0 texts/Month\n" +
                                            ">=3 Gigabytes/Month");
                        break;
            default:    System.out.println("No recommended plan.");
                        break;
        }
    }
    }

    public static int whichPlan(int a, int b, int c){
        int plan = 7;

        if(c == 0){
            if(a < 500){
                if(b == 0){
                    plan = 1;
                }else{
                    plan = 2;
                }
            }
            if(a >= 500){
                if(b < 100){
                    plan = 3;
                }
                if(b >= 100){
                    plan = 4;
                }
            }
        }
        if(c < 3 && c != 0){
            plan = 5;
        }
        if(c >= 3){
            plan = 6;
        }

        return plan;
    }

     */
}




/*
Plans
Plan A 49$/month
<500 mins
0 texts
0 data

Plan B 55$/month
<500 minutes
0>texts
0 data

Plan C 61$ month
>=500 minutes
0 data
<= 100 texts

Plan D 70$/month
>=500 minutes
>= 100 texts
0 data

Plan E 79$
0 minutes
0 texts
<= 3 data

Plan F 87$
>= 3 data

Test Cases
300 minutes of Talk, No Text, No Data
600 minutes of Talk, 100 Texts, No data
3000 minutes of talk, No Text, No data

 */