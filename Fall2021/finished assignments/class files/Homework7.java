import java.util.Scanner;  // Import the Scanner class

public class Homework7 {
  /*
   public static void main(String[] args) {
     MyQueue a = new MyQueue();

     a.fillQueue();
   }

   */
}

class SLLNode {
  
  public char    data;
  public SLLNode next;

  public SLLNode(char c) {
    this.data = c;
    this.next = null;
  }

}

class Queue {
  
  public SLLNode rear;
  
  public Queue() {
    this.rear = null;
  }
  
  public void enqueue(char c) {
    if(isEmpty()){
      rear = new SLLNode(c);
      rear.next = null;
    }else if(rear != null && rear.next == null){
      SLLNode a = new SLLNode(c);
      rear.next = a;
      a.next = rear;
      rear = a;
    }else{
      SLLNode a = new SLLNode(c);
      a.next = rear.next;
      rear.next = a;
      rear = a;
    }
  }

  public SLLNode dequeue() {
    SLLNode first = rear.next;
    rear.next = first.next;
    first.next = null;
    return first;
  }


  
  public char peek() {
    return rear.next.data;
  }  

  public boolean isEmpty() {
    if(rear == null){
      return true;
    }else{
      return false;
    }
  }
}
  
class MyQueue extends Queue {
  int amount;

  public void fillQueue() {
    char[] commands = {'*', '$', '#', '!'};
    String input, fixed = "";
    boolean validCommand = false, inFixed = false;
    Scanner in = new Scanner(System.in);

    input = in.nextLine();

    for(int i = 0; i < input.length(); i++){
      if(fixed.length() == 0){
        fixed += Character.toString(input.charAt(i));
      }else if(Character.isAlphabetic(input.charAt(i))){
        for(int j = 0; j < fixed.length(); j++){
          if(input.charAt(i) == fixed.charAt(j)){
            inFixed = true;
            break;
          }
        }
        if(!inFixed){
          fixed += Character.toString(input.charAt(i));
        }
      }else{
        fixed += Character.toString(input.charAt(i));
      }
    }

    for(int i = 0; i < fixed.length(); i++){
      if(Character.isAlphabetic(fixed.charAt(i))){
        if(Character.isUpperCase(fixed.charAt(i))){
          enqueue(fixed.charAt(i));
          amount++;
        }else{
          System.out.println("The illegal character '" + fixed.charAt(i) + "' was encountered in the input stream.");
        }
      }else{
        for(int j = 0; j < commands.length; j++){
          if(fixed.charAt(i) == commands[j]){
            validCommand = true;
          }
        }
      }
      if(validCommand){
        switch (fixed.charAt(i)){
          case '*':
            display();
            break;
          case '$':
            if (!isEmpty()) {
              System.out.println("peek: " + peek());
            } else {
              System.out.println("Not enough elements in the queue to perform this operation.");
            }
            break;
          case '#':
            if (!isEmpty()) {
              empty();
              amount = 0;
            }
            break;
          case '!':
            if (!isEmpty()) {
              dequeue();
              amount--;
            } else {
              System.out.println("Not enough elements in the queue to perform this operation.");
              display();
            }
            break;
          default:
            System.out.println(fixed.charAt(i) + " is not a valid command, valid commands: '*', '$', '#', '!'...");
            break;
        }
      }
    }

    in.close();
  }

  public void display(){
    if(isEmpty()) {
      System.out.println("-> <empty>");
    }else{
      SLLNode index = rear.next;
      int i = 0;
      System.out.print("-> ");
      while (i < amount) {
        System.out.print(index.data + " ");
        index = index.next;
        i++;
      }
      System.out.print("\n");
    }
  }
  public void empty() {
    if(!isEmpty()) {
      rear.next = null;
      rear = null;
    }
  }
}