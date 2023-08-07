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
    if (T == null) //if the root node is empty create new node
      return new BST(L); //return the first root node
    if (L < T.key) //if the tree is not empty but the inserted node is smaller than the root
      T.left = insert(T.left, L); //set new root node as the left child
    else if (L > T.key) //if the tree is not empty and the inserted node is larger than the root node go right
      T.right = insert(T.right, L);//set new root node as the right child
    return T; //return the tree
    }
  
  public static BST delete(BST T, char L) {
    if(T == null) {//tree is empty
      return T;
    }else if(L < T.key){ //recursively go down left branch
      T.left = delete(T.left, L);
    }else if(L > T.key){ //recursively go down right branch
      T.right = delete(T.right, L);
    }else if(L == T.key){ //L = T.key
      if(T.left == null){ // if no left child
        return T.right;
      }else if(T.right == null){ //if no right child
        return T.left;
      }else{ //if both children take inorder successor on the right.
        BST successor = find(T.right, inOrder(T.right).charAt(0));
        T.key = successor.key;
        T.right = delete(T.right, T.key);
      }
    }
    return T;
 }
  
  
  public static void levelOrder(BST T) {
    if (T != null) {

    }
  }
  public static String display(BST T){
    if(T != null){
      return Character.toString(T.key) + display(T.left) + display(T.right);
    }
    return "";
  }

  public static String inOrder(BST T){
    if(T != null){
      return inOrder(T.left) + T.key + inOrder(T.right);
    }
    return "";
  }

  public static int height(BST T){
    int lHeight = 0, rHeight = 0; //get height of tree to determine which level we are on

    if(T == null){ //if current node is null return 0
      return 0;
    }else{ //go down both sides of tree
      lHeight = height(T.left);
      rHeight = height(T.right);
    }
    if(lHeight > rHeight){ //add the amount of levels for each branch of the tree.
      return lHeight + 1;
    }else{
      return rHeight + 1;
    }
  }


public static void main(String[] args) {
    BST tree = null;
    String ordered = "";
    int added = 0;

    Scanner input = new Scanner(System.in);
    String stream = input.nextLine();
    System.out.println("Input string: " + stream);

    for(int i = 0; i < stream.length(); i ++){
      if(Character.isAlphabetic(stream.charAt(i)) && Character.isUpperCase(stream.charAt(i))){
        if(find(tree, stream.charAt(i)) == null){
            tree = insert(tree, stream.charAt(i));
            added++;
        }else{
          tree = delete(tree, stream.charAt(i));
          added--;
        }
      }
    }
    System.out.print("Level-Order: ");
    if(added == 0){
      System.out.print("<empty>");
    }
    levelOrder(tree);
    System.out.println();


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
  public int size;
  
  public MyQueue() {
    front = null;
    rear = null;
    size = 0;
  }
  
  public void enqueue(char c) {
    QNode temp = new QNode(c);
    if (front == null)
      front = temp;
    else
      rear.next = temp;
    rear = temp;
    size++;
  }
  
  public QNode dequeue() {
    QNode temp = null;
    if (front != null) {
      temp  = front;
      front = front.next;
    }
    size--;
    return temp;
  } 
}
}