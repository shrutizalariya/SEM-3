// Write a program to construct a binary tree from given postorder and preorder 
// traversal sequence. 

public class Lab15_82A {

    static class Node{
        int data;
        Node left, right;

        Node (int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    static int i=0;
    static int j=0; 

    public static Node prePostTraversal(int[] pre , int[] post){
    
        Node root = new Node(pre[i]);
        i++;

        if(root.data != post[j]){
            root.left = prePostTraversal(pre , post);    
        }
        if(root.data != post[j]){
            root.right = prePostTraversal(pre , post);
        }
        j++;
        return root;
    }

    public static void main(String[] args) {
        int pre[] = {1,2,3,4,5,6};
        int post[] = {3,4,2,6,5,1};
        Node ans = prePostTraversal(pre , post);
        System.out.println(ans.data);
    }
}