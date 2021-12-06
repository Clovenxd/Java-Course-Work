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
  
  public static BST find(BST T, char L) {
    if (T == null || L == T.key)
      return T;
    else if (L < T.key)
      return find(T.left, L);
    else
      return find(T.right, L);
  }

  public static BST insert(BST T, char L) {
    if (T == null)
      return new BST(L);
    if (L < T.key)
      T.left = insert(T.left, L);
    else if (L > T.key)
      T.right = insert(T.right, L);
    return T;
    }
  
  public static BST delete(BST T, char L) {
    if(T == null) {
      return T; //tree is empty
    }else if(L < T.key){ //recursively go down left branch
      T.left = delete(T.left, L);
    }else if(L > T.key){ //recursively go down right branch
      T.right = delete(T.right, L);
    }else{

    }





    return T;
 }
  
  
  public static void levelOrder(BST T) {
     System.out.print("Level-Order: ");
     System.out.println("<empty>");

  }

  public static String display(BST T){
    if(T != null){
      return Character.toString(T.key) + display(T.left) + display(T.right);
    }
    return "";
  }

  public static String inOrder(BST T){
    if(T != null){
      inOrder(T.left); //go left
      System.out.print(T.key); //print current key
      inOrder(T.right); //go right
    }
    return "";
  }


public static void main(String[] args) {
    BST tree = null;

    Scanner input = new Scanner(System.in);
    String stream = input.nextLine();
    System.out.println("Input string: " + stream);

    for(int i = 0; i < stream.length(); i ++){
      if(Character.isAlphabetic(stream.charAt(i)) && Character.isUpperCase(stream.charAt(i))){
        if(find(tree, stream.charAt(i)) == null){
            tree = insert(tree, stream.charAt(i));
        }
      }
    }

    levelOrder(tree);
    System.out.println(display(tree)); //debugging making sure tree stores proper data.
  System.out.println(inOrder(tree));

}

class QNode {
  
  public char  data;
  public QNode next;

  public QNode(char c) {
    data = c;
    next = null;
  }
}

class MyQueue {
  
  public QNode front;
  public QNode rear;
  
  public MyQueue() {
    front = null;
    rear = null;
  }
  
  public void enqueue(char c) {
    QNode temp = new QNode(c);
    if (front == null)
      front = temp;
    else
      rear.next = temp;
    rear = temp;
  }
  
  public QNode dequeue() {
    QNode temp = null;
    if (front != null) {
      temp  = front;
      front = front.next;
    }
    return temp;
  } 
}
}