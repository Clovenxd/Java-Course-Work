import java.util.ArrayList;
import java.util.Scanner;

public class test1 {


    public static void main(String[] args){
        int[] a = {1,2,3,4,5,6,7,8,9};
        linkedList b = new linkedList();
        b.makeList(a);
       // b.display();
        System.out.println(b.printList(b.head));
    }


}


class linkedList{
    Node head = null;
    Node tail = null;

    class Node{
        int data;
        Node next;

        public Node(int a){
            this.data = a;
            this.next = null;
        }




    }

    public void makeList(int[] a) {
        for (int i = 0; i < a.length; i++) {
            if(head == null){
                head = new Node(a[i]);
                tail = head;
            }else{
                tail.next = new Node(a[i]);
                tail = tail.next;
            }
        }
    }

    public void display(){
        Node index = head;
        while(index != null){
            System.out.print(index.data + " ");
            index = index.next;
        }
    }

    public String printList(Node head) {
        if(head != null){
            return  printList(head.next) + Integer.toString(head.data) + " ";
        }else{
            return "";
        }
    }
}