import java.util.Scanner;  // Import the Scanner class

public class BST {
  
  public char key;
  public BST  left;
  public BST  right;

  public BST(char c) {
    key   = c;
    left  = null;
    right = null;
  }
  
  public static BST find(BST T, char key) {
  // put your solution here
  }

  public static BST insert(BST T, char key) {
  //  put your solution here
  }
    
  public static void preOrder(BST T) {
  //  put your solution here
  }
  
  public static void inOrder(BST T) {
  //  put your solution here 
  }
  
  public static void postOrder(BST T) {
  //  put your solution here
  }
  
  public static void main(String[] args) {
     Scanner input = new Scanner(System.in);
     BST t = null;
     String stream = input.nextLine();
     for (int i = 0; i < stream.length(); i++)
       t = insert(t, stream.charAt(i));
     System.out.print("Preorder: ");
     preOrder(t);
     System.out.println();
     System.out.print("Inorder: ");
     inOrder(t);
     System.out.println();
     System.out.print("Postorder: ");
     postOrder(t);
     System.out.println();
     System.out.println("Enter a character to search for: ");
     char c = input.nextLine().charAt(0);
     if (find(t, c) == null)
       System.out.println("The character " + "'" + c + "' was not found.");
     else
       System.out.println("The character " + "'" + c + "' was found.");
   }