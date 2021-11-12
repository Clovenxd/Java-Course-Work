import java.util.Scanner;

public class TimesAndInstructors {
    /*
    public static void main(String[] args){
        System.out.println("########################");
        System.out.println("# Time and Instructors #");
        System.out.println("########################\n");

        String[][] courses = new String[5][3];

        fill(courses);

        request(courses);
    }

    public static void fill(String[][] s){
        Scanner in = new Scanner(System.in);
        for(int i = 0; i < 5; i++){
            for(int j = 0; j < 3; j++){
                switch(j){
                    case 0: System.out.print("Enter class... ");
                            s[i][j] = in.nextLine();
                            break;
                    case 1: System.out.print("Enter first time of meet in week... ");
                            s[i][j] = in.nextLine();
                            break;
                    case 2: System.out.print("Enter instructors name...");
                            s[i][j] = in.nextLine();
                            break;
                }

            }
        }
    }

    public static void request(String[][] a){

        Scanner in = new Scanner(System.in);
        String input = "";
        boolean inlist = false;

        while(!input.equals("stop")){
            System.out.print("Enter class name...");
            input = in.nextLine();
            for(int i = 0; i < 5; i++){
                if(a[i][0].equals(input)){
                    System.out.println("Class " + input + " first meets at "
                            + a[i][1] + " and the instructor is " + a[i][2]);
                    inlist = true;
                }
            }
            if(!inlist){
                System.out.println("The course is not in the list...");
            }
        }
    }

     */
}
