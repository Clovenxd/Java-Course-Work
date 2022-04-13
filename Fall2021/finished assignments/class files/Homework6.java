import java.util.Scanner;

public class Homework6 {
    /*
    public static void main(String[] args){
        String input;
        Scanner in = new Scanner(System.in);
        stack a = new stack();

        System.out.print("Enter data to put on stack and PostScript command in that order... ");
        input = in.nextLine();

        String[] arguments = input.split(" ");

        if(arguments[arguments.length - 1].equals("index") || arguments[arguments.length - 1].equals("copy")){
            if(arguments[arguments.length-1].equals("index")) {
                for (int i = 0; i < arguments.length - 2; i++) {
                    a.push(arguments[i]);
                }
                a.index(Integer.parseInt(arguments[arguments.length - 2]));
            }else{
                for (int i = 0; i < arguments.length - 2; i++) {
                    a.push(arguments[i]);
                }
                for (int i = 0; i < arguments.length - 2; i++) {
                    a.push(arguments[(arguments.length - 3) - i]);
                }
            }
        }else{
            for (int i = 0; i < arguments.length; i++) {
                boolean isCommand = false;
                String data = arguments[i];
                for (int j = 0; j < data.length(); j++) {
                    if (!(Character.isDigit(data.charAt(j))) && data.charAt(j) != '-') {
                        isCommand = true;
                    }
                }
                if (isCommand) {
                    switch (data) {
                        case "pop":
                            a.pop();
                            break;
                        case "dup":
                            a.dup();
                            break;
                        case "exch":
                            a.exch();
                            break;
                        case "clear":
                            a.clear();
                            break;
                        case "count":
                            a.count();
                            break;
                        default:
                            System.out.println(data + " is not a recognized command...");
                            break;
                    }
                } else {
                    a.push(data);
                }
            }
        }
        a.display();
        in.close();
    }

     */
}

class stack{
    element top = null;
    int amount;

    class element{
        String data;
        element next;

        public element(String a){
            this.data = a;
            this.next = null;
        }
    }


    public void push(String a){
        if(top == null){
            top = new element(a);
            top.next = null;
        }else{
            element b = new element(a);
            b.next = top;
            top = b;
        }
        amount++;
    }

    public void pop(){
        if(top != null) {
            if(top.next == null) {
                top = null;
            }else{
                top = top.next;
            }
            amount--;
        }else{
            System.out.println("The stack is empty, nothing to pop....");
        }
    }

    public void display(){
        if(top != null) {
            element index = top;
            while (index != null) {
                System.out.print(index.data + " ");
                index = index.next;
            }
        }else{
            System.out.println("<empty>");
        }
    }

    public void dup(){
        if(top != null) {
            element a = new element(top.data);
            a.next = top;
            top = a;
            amount++;
        }else{
            System.out.println("The stack is empty, nothing to duplicate....");
        }
    }

    public void exch(){

        if(top != null && top.next != null){
            String temp = top.data;
            top.data = top.next.data;
            top.next.data = temp;

        }
    }

    public void clear(){
        top = null;
        amount = 0;
    }

    public void index(int a){
        if(a <= amount){
            element index = null;
            for(int i = 0; i < a; i++){
                if(i == 0){
                    index = top;
                }else{
                    index = index.next;
                }
            }
            push(index.data);
            amount++;
        }else{
            System.out.println("Index must be less than stack count...");
        }
    }

    public void count(){
        push(Integer.toString(amount));
    }
}

/*


dup duplicates an object
13 12 dup
-> 12 12 13

exch exchanges the top two elements of the stack.
13 -50 exch
-> 13 -50

count counts the number of elements in the stack.
10 20 30 40 50 count
-> 5 50 40 30 20 10

clear clears the stack.
1 -50 22 100 99 6 clear
-> <empty>

index accesses the stack as if it were an indexable array
34 12 92 2 index
-> 12 92 12 34

copy duplicates portions of the operand stack.
12 6 2 copy
-> 12 6 6 12

pop removes the top element from the stack.
35 -100 22 pop
-> -100 35

You can add or delete any methods. You can add or delete any code.
You must use a singly-linked list but you can choose your own list implementation such-as with or without sentinels,
with head and/or tail points, etc.
Do not assume any maximum length for any input string.
You need not test for the null or empty string ("") cases.

For this assignment you will be writing a program that evaluates some PostScript® commands.
Specifically, you will be using a special version of a linked-list, called a Stack.

The stack description above uses an array implementation for examples. You will be not be using arrays,
 you will be using linked-lists.

 */