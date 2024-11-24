/**
 * Lab14_78B
 */

import java.util.*;

public class Lab14_78B {
static class Node{
    int info;
    Node left;
    Node right;

    public Node(int info){
        this.info = info;
    }
}

    static Node root;
    static int data;
    
    public static Node bstTree(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the root node:");
        int data = sc.nextInt();
        root = new Node(data);
        System.out.println("Root node inserted successfully.");
        return root;
    }

    // insert a new node

    public static void insert(int data) {
        root = insertRec(root, data);
    }
    public static Node insertRec(Node root , int data){
        
        if (root == null) {
            root = new Node(data);
            return root;
        }
        if (data < root.info) {
            root.left = insertRec(root.left, data);
        } 
        else if (data > root.info){
            root.right = insertRec(root.right, data);
        }
        return root;
    }

    public static void preorder(Node node){
        if (node == null) {
            return;
        }
        System.out.print(node.info + "->");
        preorder(node.left);
        preorder(node.right);
    }

    public static void inorder(Node node){
        if (node == null) {
            return;
        }
        inorder(node.left);
        System.out.print(node.info + "->");
        inorder(node.right);
    }
    
    public static void postorder(Node node){
        if (node == null) {
            return;
        }
        postorder(node.left);
        postorder(node.right);
        System.out.print(node.info + "->");
        }

        public static void main(String[] args) {
        insert(3);
        insert(5);
        insert(6);
        insert(2);

        System.out.print("Preorder : ");
        preorder(root);
        System.out.println();

        System.out.print("Inorder : ");
        inorder(root);
        System.out.println();

        System.out.print("Postorder : ");
        postorder(root);
        }
    }