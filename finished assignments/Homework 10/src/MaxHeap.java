import java.util.Scanner;  // Import the Scanner class

public class MaxHeap {
  
  private char[] heap;
  private int n;

  public MaxHeap() {
    //initializes the heap to two null chars
    heap = new char[]{'\0', '\0'};
    //initialize the size to zero 
    n = 0;
  }

  // returns the value of the key with the maximum value. It does not remove the node
  public char seek() {
    return heap[1]; //returns the highest value node
  }

  // returns the number of items currently in the heap. Not the size of the array.
  public int size() {
    return n; //amount of nodes in heap
  }

  // swaps the position of two elements in the heap.
  public void swap(int i, int j) {//i is index of what i want to be swapped, j is what i want to swap with.
    char temp;
    temp = heap[i];
    heap[i] = heap[j];
    heap[j] = temp;
  }

  // repositions the heap, after a delete.
  public void sink(int k) {
    while(heap[k] > heap[k-1]){
      for(int i = k; i > 1; i--){
        if(heap[i] > heap[i-1]) {
          swap(i, i - 1);
        }
      }
    }
  }

  // finds the correct position of the new key in the heap, after an add.
  public void swim(int k) {

  }

  // adds an element to the heap.
  public void add(char c) {
    if(n == 0){ //if there is no nodes in the heap
      heap[1] = c; //set root
      n++; //add node to count
    }else{ //if there are already nodes in the heap
      if(heap.length == n+1){ //increase size if there is no more room
          char[] temp = new char[heap.length*2];
          for(int i = 1; i <= n; i++){
            temp[i] = heap[i]; //transfer current nodes
          }
          heap = temp; //make the temp the current heap
      }
      heap[n+1] = c; //add new node
      n++; //increase count
      int index = n; //keep track of where i am in the tree
      while(heap[index] > heap[index/2] && index > 1){ //while the new node is larger than its parent
        swap(index/2, index); //swap to parent node
        index /= 2;//move to current position
      }
      sink(n);
    }
  }

  // removes the maximum key from the heap.
  public void delete() {
    if(n > 0) {
      char[] temp = new char[heap.length];
      System.out.print(heap[1] + "\n");
      for (int i = 1; i < n; i++) {
        temp[i] = heap[i + 1];
      }
      heap = temp;
      n--;
    }
  }

  public void printPostOrder(){
    char[] postOrder = new char[heap.length];
    int count = 0, index = n;

    while(count <= n){
      for(int i = index/2 + 1; i <= index; i += 2){
        if(i == 1){
          postOrder[count+1] = heap[i];
          count++;
        }else if(i == 0){
          return;
        }else{
          postOrder[count + 1] = heap[i];
          count++;
          postOrder[count + 1] = heap[i + 1];
          count++;
          postOrder[count + 1] = heap[i / 2];
          count++;
        }
      }
      index = index/4;
    }
    for(int i = 1; i <= n; i++){
      System.out.print(postOrder[i]);
    }
    System.out.println();
  }

  public void printLevelOrder(){
    for(int i = 1; i <= n; i++){
      System.out.print(heap[i]);
    }
    System.out.println();
  }


  public static void useCommand(char command, MaxHeap h){
    switch(command){ //check if it is a valid command to perform operations on the heap
      case '*': if(h.size() > 0){ //print largest key in heap then deletes it and reorganizes the heap
                System.out.print("Deleted: "); //print largest value
                h.delete(); //delete largest value
                //h.sink(); //reorganize heap
                }
                break;
      case '#': System.out.print("Heap-order: ");
                h.printLevelOrder(); //print in level order
                break;
      case '!': System.out.print("Post-order: ");
                h.printPostOrder(); //print in post order
                break;
      default:  break;
    }
  }

  public static void processInput(String a, MaxHeap h){
    if(a.length() > 0){ //if a is not empty
      for(int i = 0; i < a.length(); i++){
        if(Character.isAlphabetic(a.charAt(i)) && Character.isUpperCase(a.charAt(i))){
          h.add(a.charAt(i));
        }else{
          useCommand(a.charAt(i), h);
        }
      }
    }else{
      System.out.println("<empty>"); //the input string is empty
    }
  }

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    String stream = input.nextLine();
    MaxHeap h = new MaxHeap();
    /* Feel free to use these strings wherever necessary
       "Post-order: "
       "Heap-order: "
        "Deleted: "
   */
    processInput(stream, h);

  }
}

/*
In this module you will implement a binary heap. A binary heap is a collection of keys arranged in a complete heap-ordered binary tree,
represented in a level-ordered array (not using the first entry). A binary tree is heap-ordered the key in each node is larger or equal to the keys in that node's children (if any).

For this implementation we will use an array of characters to hold the keys.
Also, we will use the implementation where the first element in the array (heap[0]) is not used.
The first element of the heap will be in the array, at heap[1].

Also, for this implementation since we are dealing with arrays we want to try and be efficient with the amount of space we are using.
So, our Max-heaps will be initialized with only two elements. That means there will only be room for one key at the start.
Remember, we will not be using the first element in our implementation. Every time we run out of space in the array we will double the size of the current array, so we can fit more elements.
This will prevent us from running out room and those irritating "out-of-bounds" errors.

The input for this program will be from the keyboard and accept single-characters, which represent the keys for the heap.

For characters, 'A'-'Z': Add the key to the heap.
For the character, '*': Print the key with the maximum value (root) and delete the key with the maximum value, from the heap. Deleting from an empty heap is ignored.
For the character, '#': Print all the keys currently in the heap using heap-order (level-order) traversal.
For the character, '!': Print all the keys currently in the heap using post-order traversal.
Ignore all other characters.

You cannot modify any code given in the starter file.
You can add any code you wish except 5 & 6 below.
Do not assume any maximum length for any input string.
You need not test for the null or empty string ("") case.
You are not allowed to add any arrays or ArrayLists  or any Java built-in (ADTs), such as Trees, Graphs, or Heaps. Or add any class that inherits any of those ADTs.
You are not allowed to use Java Generics.
If hard-coding detected in any part of your solution your score will be zero for the whole assignment.

***notes***
A Binary Heap is a Binary Tree with following properties.
1) It’s a complete tree (All levels are completely filled except possibly the last level and the last level has all keys as left as possible). This property of Binary Heap makes them suitable to be stored in an array.

(i/2) parent node
(i*2) left child
(i*2) + 1 right child

 */