import java.util.*;

public class Lab15_82 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        
        System.out.println("Enter number of nodes");
        int n = sc.nextInt();  

        
        int[] pre = new int[n];
        int[] post = new int[n];

        
        System.out.println("Enter Preorder Traversal");
        for (int i = 0; i < n; i++) {
            pre[i] = sc.nextInt();
        }

        
        System.out.println("Enter Postorder Traversal");
        for (int i = 0; i < n; i++) {
            post[i] = sc.nextInt();
        }

        
        ConstructBTree cb = new ConstructBTree();
        TreeNode root = cb.constructFromPrePost(pre, post);

        
        BSTTree btree = new BSTTree();
        btree.inOrder(root); 

       
        sc.close();
    }
}





class BSTTree {

    
    public TreeNode insertInBST(int element, TreeNode root) {
        TreeNode n = new TreeNode(element);  
        if (root == null) {
            root = n; 
            return root;
        }

        TreeNode temp = root;  

        
        while (temp != null) {
            if (temp.data == element) break; 
            if (temp.data > element) {
                if (temp.left == null) {
                    temp.left = n;  
                    break;
                } else {
                    temp = temp.left; 
                }
            } else if (temp.data < element) {
                if (temp.right == null) {
                    temp.right = n; 
                    break;
                } else {
                    temp = temp.right; 
                }
            }
        }

        return root; 
    }

    
    public TreeNode delete(TreeNode root, int n) {
        if (root == null) return null;  
        if (root.data == n) {
            return replace(root);  
        }
        if (root.data < n) root.right = delete(root.right, n);
        if (root.data > n) root.left = delete(root.left, n); 
        return root; 
    }

    
    public TreeNode replace(TreeNode root) {
        if (root.left == null && root.right == null) return null;  
        if (root.right == null) return root.left;  
        if (root.left == null) return root.right;  
        TreeNode temp = root.right; 

        
        if (temp.left == null) {
            temp.left = root.left;
        } else {
            TreeNode temp2 = temp;
            while (temp2.left != null) {
                temp2 = temp2.left;
            }
            temp2.left = root.left;
        }
        return temp;
    }

    
    public void searchElement(int element, TreeNode root) {
        if (root == null) {
            System.out.println("Element Not Found ");
            return;
        }
        if (root.data == element) {
            System.out.println(" Element Found ");
        } else if (root.data < element) {
            searchElement(element, root.right);  
        } else {
            searchElement(element, root.left); 
        }
    }

    
    public void inOrder(TreeNode root) {
        if (root != null) {
            inOrder(root.left);
            System.out.print(root.data + " ");
            inOrder(root.right);
        }
    }

    
    public void preOrder(TreeNode root) {
        if (root != null) {
            System.out.print(root.data + " ");
            preOrder(root.left);
            preOrder(root.right);
        }
    }

    
    public void postOrder(TreeNode root) {
        if (root != null) {
            postOrder(root.left);
            postOrder(root.right);
            System.out.print(root.data + " ");
        }
    }

    
    public int findMin(TreeNode root) {
        TreeNode temp = root; 
        while (temp.left != null) {
            temp = temp.left; 
        }
        return temp.data; 
    }

    
    public int findMax(TreeNode root) {
        TreeNode temp = root;  
        while (temp.right != null) {
            temp = temp.right; 
        }
        return temp.data;
    }

}


class TreeNode {
    int data;  
    TreeNode left; 
    TreeNode right;

    
    public TreeNode() {
        this.left = null;
        this.right = null;
    }

    
    public TreeNode(int data) {
        super();
        this.data = data;
    }
}



class ConstructBTree {
    int preIndex;
    int posIndex;

    
    public ConstructBTree() {
        preIndex = 0;
        posIndex = 0;
    }

    
    public TreeNode constructFromPrePost(int[] pre, int[] post) {
        
        TreeNode root = new TreeNode(pre[preIndex++]);
        
        
        if (root.data != post[posIndex])
            root.left = constructFromPrePost(pre, post);
        
        
        if (root.data != post[posIndex])
            root.right = constructFromPrePost(pre, post);
        
        
        posIndex++;
        
        
        return root;
    }
}
class BSTTrees {

    

    public TreeNode insertInBST(int element, TreeNode root) {
        TreeNode n = new TreeNode(element);
        if (root == null) { 
            root = n;
            return root;
        }

        TreeNode temp = root;

        
        while (temp != null) {
            if (temp.data == element)
                break; 
            if (temp.data > element) { 
                if (temp.left == null) {
                    temp.left = n; 
                    break;
                }
                else {
                    temp = temp.left; 
                }
            }
            else if (temp.data < element) { 
                if (temp.right == null) {
                    temp.right = n; 
                    break;
                }
                else {
                    temp = temp.right; 
                }
            }
        }

        return root; 
    }

    
    public TreeNode delete(TreeNode root, int n) {
        if (root == null)
            return null; 
        if (root.data == n) {
            return replace(root);
        }
        if (root.data < n)
            root.right = delete(root.right, n); 
        if (root.data > n)
            root.left = delete(root.left, n);
        return root; 
    }

    
    public TreeNode replace(TreeNode root) {
        if (root.left == null && root.right == null)
            return null; 
        if (root.right == null)
            return root.left; 
        if (root.left == null)
            return root.right;
        TreeNode temp = root.right;
        if (temp.left == null) {
            temp.left = root.left; 
        }
        else {
            TreeNode temp2 = temp;
            while (temp2.left != null) {
                temp2 = temp2.left; 
            }
            temp2.left = root.left; 
        }
        return temp; 
    }

    
    public void searchElement(int element, TreeNode root) {
        if (root == null) {
            System.out.println(" Element Not Found ");
            return;
        }
        if (root.data == element) {
            System.out.println(" Element found ");
        }
        else if (root.data < element) {
            searchElement(element, root.right); 
        }
        else {
            searchElement(element, root.left); 
        }
    }

    
    public void inOrder(TreeNode root) {
        if (root != null) {
            inOrder(root.left); 
            System.out.print(root.data + " "); 
            inOrder(root.right); 
        }
    }

    
    public void preOrder(TreeNode root) {
        if (root != null) {
            System.out.print(root.data + " "); 
            preOrder(root.left); 
            preOrder(root.right); 
        }
    }

    
    
    public void postOrder(TreeNode root) {
        if (root != null) {
            postOrder(root.left); 
            postOrder(root.right); 
            System.out.print(root.data + " "); 
        }
    }
}

class Tree {
    int data; 
    TreeNode left; 
    TreeNode right; 

    public Tree() {
        this.left = null;
        this.right = null;
    }

    public Tree(int data) {
        this();
        this.data = data;
    }
}