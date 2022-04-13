import org.jetbrains.annotations.NotNull;

import java.util.Scanner;

public class TestLease {

    public static void TestLease(){

        Lease one = new Lease();
        Lease two = new Lease();
        Lease three = new Lease();
        Lease four = new Lease();

        getData(one,1);
        getData(two,2);
        getData(three,3);

        showValues(one,1);

        one.addPetFee();

        showValues(one, 1);
        showValues(two, 2);
        showValues(three, 3);
        showValues(four, 4);

    }

    public static Lease getData(@NotNull Lease o, int a) {
        String str;
        int rent;
        int term, apartNum;

        Scanner in = new Scanner(System.in);

        System.out.print("\nLease: " + a + "\n");

        System.out.print("Enter Tenant Name: ");
        if(in.hasNextLine()){
            str = in.nextLine();
            o.setTenant(str);
        }

        System.out.print("Enter rent amount(monthly): ");
        if(in.hasNextLine()){
            str = in.nextLine();
            rent = Integer.parseInt(str);
            o.setRent(rent);
        }

        System.out.print("Enter term amount(monthly): ");
        if(in.hasNextLine()) {
            str = in.nextLine();
            term = Integer.parseInt(str);
            o.setLeaseTerm(term);
        }

        System.out.print("Enter apartment number: ");
        if(in.hasNextLine()){
            str = in.nextLine();
            apartNum = Integer.parseInt(str);
            o.setApartNum(apartNum);
        }

        return o;
    }

    public static void showValues(Lease l, int a){
        System.out.println("\nLease "+ a + ":\n"
                + "Tenant: " + l.getTenant() + "\n"
                + "Rent(Monthly):" + l.getRent() + "\n"
                + "Term(s): " + l.getLeaseTerm() + "\n"
                + "Apart. Number: " + l.getApartNum() + "\n");

    }
}