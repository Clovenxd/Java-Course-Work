

public class Homework5{

/*
    public static void main(String[] args){

        SDList x, y, z;
        String a, b;
        Scanner input = new Scanner(System.in);  // Create a Scanner object
        System.out.print("A: ");
        a = input.nextLine();
        x = makeSDList(a);               // convert first string to a linked list
        x.displayList();                 // call function that displays list x
        System.out.print("B: ");
        b = input.nextLine();
        y = makeSDList(b);               // convert second string to a linked list
        y.displayList();                 // call function that displays list z
        z = x.addLists(y);               // add lists x & y and store result in list y
        System.out.print("A+B: ");
        z.displayList();                 // call function that displays list z


    }

 */

    public static SDList makeSDList(String a){
        String s = "";
        SDList b = new SDList();

        for(int i = 0; i < a.length(); i++){
            if(Character.isDigit(a.charAt(i))){
                s += String.valueOf(a.charAt(i));
            }
        }

        for(int i = 0; i < s.length(); i++){
            String element = String.valueOf(s.charAt(i));
            int data = Integer.parseInt(element);
            if(i == 0){
                b.addFirst(data);
            }else{
                b.addLast(data);
            }
        }
        return b;
    }

}

class SDList{
    Node head = null;
    Node tail = null;
    class Node{
        int element;
        Node next;


        public Node(int a){
            this.element = a;
            this.next = null;
        }
    }

    public void addFirst(int a){
         if(head == null){
             Node firstNode = new Node(a);
             head = firstNode;
             tail = head;
         }else{
             Node newNode = new Node(a);
             newNode.next = head;
             head = newNode;
         }
    }

    public void addLast(int a){

         if(tail == null){
             head = tail = new Node(a);
         }else{
             tail.next = new Node(a);
             tail = tail.next;
         }
    }

    public void displayList(){
        Node index = head;
        while(index != null){
            System.out.print(index.element);
            index = index.next;
        }
        System.out.print("\n");
    }

    public SDList addLists(SDList c){
        SDList sum = new SDList();
        Node one = this.head;
        Node two = c.head;
        int nodeSum = 0, a = 0;

        while(one != null || two != null){
            nodeSum = 0;
            if(one == null){
                nodeSum = a +two.element;
                two = two.next;
            }else if(two == null){
                nodeSum = a + one.element;
                one = one.next;
            }else{
                nodeSum = a + one.element + two.element;

                one = one.next;
                two = two.next;
            }

            a = nodeSum/10;

            if(sum.head == null){
                sum.addFirst(nodeSum % 10);
            }else{
                sum.addLast(nodeSum % 10);
            }
        }
        if(a > 0){
            sum.addFirst(a);
        }
        return sum;
    }
}