public class OverloadingMethods {

    public static void overLoadingMethods(){

        System.out.println(sum(15, 15));
        System.out.println(sum(20, 20, 20));
        System.out.println(sum(15.0, 16.0));

    }

    public static int sum(int a, int b){
        return a+b;
    }

    public static int sum(int a, int b, int c){
        return a+b+c;
    }

    public static double sum(double a, double b){
        return a+b;
    }

}
