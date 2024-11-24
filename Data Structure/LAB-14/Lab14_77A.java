// Write a menu driven program to implement Binary Search Tree (BST) & perform 
// following operations 
//  Insert a node, Delete a node, Search a node

import java.util.*;
class Tree {
class Node{
    int info;
    Node left;
    Node right;

    public Node(int info){
        this.info = info;
    }
}

    Node root;
    int data;
    
    public Node bstTree(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the root node:");
        int data = sc.nextInt();
        root = new Node(data);
        System.out.println("Root node inserted successfully.");
        return root;
    }

    // insert a new node

    public void insert(int data) {
        root = insertRec(root, data);
    }
    public Node insertRec(Node root , int data){
        
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
    public void inorder(Node node){
        if (node == null) {
            return;
        }
        inorder(node.left);
        System.out.print(node.info + "->");
        inorder(node.right);
    }

    // delete a node
    public void delete(int data){
        root = deleteRec(root, data);
    }
    public Node deleteRec(Node root, int data){
        if(root == null){
            return root;
        }
        if(data < root.info){
            root.left = deleteRec(root.left, data);
        }
        else if(data > root.info){
            root.right = deleteRec(root.right, data);
        }
        else {
            if (root.left == null){
                return root.right;
            }
            else if (root.right == null){
                return root.left;
            }
            root.info = minValue(root.right);

            root.right = deleteRec(root.right, root.info);
        }
        return root;
    }
        public int minValue(Node root) {
            int minValue = root.info;
            while (root.left != null) {
                minValue = root.left.info;
                root = root.left;
            }
            return minValue;
        }

    // search a node
        public boolean search(int data) {
            return searchRec(root, data);
        }

        public boolean searchRec(Node root, int data){
            if(root == null){
                return false;
            }
            if(root.info == data){
                return true;
            }
            if(root.info > data){
                searchRec(root.left, data);
            }
            if(root.info <= data){
                searchRec(root.right, data);
            }
            return false;
        }
     }
/**
 * Lab14_77A
 */
public class Lab14_77A {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Tree T = new Tree();
        T.bstTree();
        T.insert(3);
        T.insert(5);
        T.insert(6);
        T.insert(2);
        T.inorder(T.root);
        System.out.println();
        System.out.println("Node Deleted" );
        System.out.println("----- Final Tree ----- ");
        T.delete(3);
        T.inorder(T.root);
        System.out.println();
        boolean ans = T.search(3);
        if(ans == true){
            System.out.println("True");
        }
        else{
            System.out.println("False");
        }
    }
}