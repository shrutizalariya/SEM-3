import java.util.Scanner;

class Node{
    int info;
    Node left;
    Node right;

    public Node(int info){
        this.info = info;
    }
}
class Tree{
    Node root;

    public Node constTree(int [] arr , int i){
        if(i >= arr.length){
            return null;
        }
        Node temp = new Node(arr[i]);
        temp.left = constTree(arr , 2*i+1);
        temp.right = constTree(arr , 2*i+2);
        return temp;
    }

    public void preorder(Node node){
        if (node == null) {
            return;
        }
        System.out.print(node.info + "->");
        preorder(node.left);
        preorder(node.right);
    }

    public void inorder(Node node){
        if (node == null) {
            return;
        }
        inorder(node.left);
        System.out.print(node.info + "->");
        inorder(node.right);
    }
    
    public void postorder(Node node){
        if (node == null) {
            return;
        }
        postorder(node.left);
        postorder(node.right);
        System.out.print(node.info + "->");
        }
    }

public class BinaryTreeImplimentation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length of an array: ");
        int n = sc.nextInt();
        int [] arr = new int[n];
        for(int i = 0 ; i < arr.length ; i++){
            arr[i] = sc.nextInt();
        }
        Tree t = new Tree();
        t.root = t.constTree(arr,0);
        System.out.println("Preorder");
        t.preorder(t.root);
        System.out.println();
        System.out.println("Inorder");
        t.inorder(t.root);
        System.out.println();
        System.out.println("Postorder");
        t.postorder(t.root);
    }
}