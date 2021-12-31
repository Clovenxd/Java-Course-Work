import java.util.Scanner;  // Import the Scanner class

public class BST {

    public char key;
    public BST left;
    public BST right;

    public BST(char c) {
        key = c;
        left = null;
        right = null;
    }

    public static BST find(BST T, char key) {
        if(key == T.key){
            return T;
        }else{
            if(key > T.key){
                if(T.right != null){
                    return find(T.right, key);
                }else{
                    return null;
                }
            }else{
                if(T.left != null){
                    return find(T.left, key);
                }else{
                    return null;
                }
            }
        }
    }

    public static BST insert(BST T, char key) {

        if(T == null){
            return new BST(key);
        }else{
            if(key > T.key){
                T.right = insert(T.right, key);
            }else if(key < T.key){
                T.left = insert(T.left, key);
            }else{
                return T;
            }
        }

        return T;
    }

    public static void preOrder(BST T) {
        if(T != null){
            System.out.print(T.key);
            preOrder(T.left);
            preOrder(T.right);
        }
    }

    public static void inOrder(BST T) {
        if(T != null){
            inOrder(T.left);
            System.out.print(T.key);
            inOrder(T.right);
        }
    }

    public static void postOrder(BST T) {
        if(T != null){
            postOrder(T.left);
            postOrder(T.right);
            System.out.print(T.key);
        }
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
}
/*
You can not delete any code  in the BST class. But you can add code to the BST class if you wish.
All five methods must be recursive. Zero credit will be given for any non-recursive method even if it works correctly.
Do not assume any maximum length for any input string.
You need not test for the null or empty string ("") case,
You are not allowed to add any arrays or ArrayLists  or any Java built-in (ADTs), such as Lists, Sets, Maps, Stacks, Queues, Deques, Trees, Graphs, Heaps, etc. Or add any class that inherits any of those ADTs.
For your node and list class you can use the code that was used in the book, video and lecture notes related to the node and lists class examples.
You are not allowed to use Java Generics.
If hard-coding detected in any part of your solution your score will be zero for the whole assignment.

In this module you will continue your practice with dynamic structures.  However in this module we graduate from the linear structures: Linked-Lists, Stacks and Queues and move on to non-linear (hierarchical) structures.
The first structure in this category are Trees. Specifically, Binary Search Trees. The lecture videos and notes describe the importance of these structures, so I won't repeat them here.

For this assignment you will implement two methods, find() and insert() relating to Binary Search Trees.
These methods are both to be recursive functions. The signatures for those functions must be:

This method takes a tree node and a key as an argument and returns the tree node if the key is found and returns null if the key is not found.
BST find(BST T, char key)

This method takes a tree node and a key as an argument and inserts the tree node if the key is already in the tree it does not insert the node. It returns the new tree.
BST insert(BST T, char key)
 */
