import java.util.Scanner;

public class Homework4 {
   
  public static String reverseString(String s, int i) {
      if(s != null && s.length() >= 1){
          if(s.length() == 1){
              return s.charAt(0) + "";
          }else{
              return s.charAt(s.length()-1) + reverseString(s.substring(0, s.length()-1), i);
          }
      }else if(s == null || s.length() == 0){
          return "String is empty or null.";
      }else{
          return "";
      }
  }
  
  public static int addOddNums(int[] a, int i) {
    if(!(a == null)) {
        if (i < a.length) {
            if (a[i] % 2 != 0) {
                return a[i] + addOddNums(a, i + 1);
            } else {
                return addOddNums(a, i + 1);
            }
        } else {
            return 0;
        }
    }else{
        return -1;
    }
  }
  
  public static String addSpaces(String s) { 

      if(s != null && s.length() >= 1){
          if(s.length() == 1)
              return s.charAt(0) + " ";
          else
            return s.charAt(0) + " " + addSpaces(s.substring(1));
      }else if(s == null || s.length() == 0){
          return "String is empty or null.";
      }else{
          return "";
      }
  } 
   
  public static int multByAdd(int m, int n) { 
     if(!(n < 0)){
          if((n > 0)){
              return m + multByAdd(m, n - 1);
          }else{
              return + 0;
          }
     }else{
         return 0;
     }
  }
   
  public static String weave(String s1, String s2) { 

      if(s1 != null && s2 != null){
          if(!s1.isEmpty() & !s2.isEmpty()){
              return s1.charAt(0) + "" + s2.charAt(0) + weave(s1.substring(1), s2.substring(1));
          }else{
              return s1;
          }
      }else{
          return null;
      }
  }
  
  public static boolean palindrome(String s) {

      if((s.length() == 0) || (s.length() == 1)){
          return true;
      }else if(s.charAt(0) == s.charAt(s.length()-1)){
          return palindrome(s.substring(1, s.length()-1));
      }else{
          return false;
      }
  }


  /*
  public static void main(String[] args) {
      String test = "T";
      String test2 = "his is the last test.";

      System.out.println(weave(test, test2));


      //int[] test = null;

      //System.out.print(test);
      //System.out.println(addOddNums(test, 0));
      //System.out.println(addSpaces(test));

      //System.out.println(palindrome("abca"));

      //System.out.println("Welcome to Homework4. Happy Coding!");

      //System.out.println(addSpaces(""));

      //System.out.println(reverseString("gnirts esrever", 0));

  }
  */
}





/*

test
0123





 */