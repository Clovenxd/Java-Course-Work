public class Lease {

    public String tenant;
    public int apartNum, leaseTerm, rent;

    public Lease(){
        tenant = "XXX";
        apartNum = 0;
        rent = 1000; //per month
        leaseTerm = 12; //in months
    }

    public String getTenant(){
        return tenant;

    }
    public int getApartNum(){
        return apartNum;
    }
    public int getRent(){
        return rent;
    }
    public int getLeaseTerm(){
        return leaseTerm;
    }

    public void setTenant(String newTenant){
        tenant = newTenant;
    }
    public void setApartNum(int newApartNum){
        apartNum = newApartNum;
    }
    public void setRent(int newRent){
        rent = newRent;
    }
    public void setLeaseTerm(int newLeastTerm){
        leaseTerm = newLeastTerm;
    }

    public void addPetFee(){
        rent = rent + 10;
        explainPetPolicy();
    }
    public void explainPetPolicy(){
        System.out.println("If you have a pet, a 10$ pet fee will be added to the monthly rent amount making the new amount: "
                + Integer.toString(rent) + ".");
    }
}