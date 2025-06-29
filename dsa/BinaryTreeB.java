
import java.util.*;

public class BinaryTreeB {
    static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
           this.data=data;
           this.left=null;
           this.right=null;
        }
    }
    static class BinaryTree {
        static int index=-1;
        public static Node buildTree(int nodes[]){
            index++;
            if(nodes[index]==-1){
                return null;
            }
            Node newNode=new Node(nodes[index]);
            newNode.left=buildTree(nodes);
            newNode.right=buildTree(nodes);
            return newNode;
        }
    }
    public static void preTraversal(Node root){
        if(root==null){
            System.out.print(-1+", ");
            return;
        }
        System.out.print(root.data+", ");
        preTraversal(root.left);
        preTraversal(root.right);
    }
    public static void inOrderTraversal(Node root){
        if(root==null){
            // System.out.print(-1+", ");
            return;
        }
        inOrderTraversal(root.left);
        System.out.print(root.data+", ");
        inOrderTraversal(root.right);
    }
    public static void postOrderTraversal(Node root){
        if(root==null){
            // System.out.print(-1+", ");
            return;
        }
        postOrderTraversal(root.left);
        postOrderTraversal(root.right);
        System.out.print(root.data+", ");
    }
    // DFS :- Depth First Search (use in pre,in and post )
    // BFS :- Breadth First Order (use in level order)
    public static void LevelOrderTraversal(Node root){
        Queue<Node> q=new LinkedList<>();
        if(root==null){
            return;
        }
        q.add(root);
        q.add(null);
        while(!q.isEmpty()){
            Node currNode=q.remove();
            if(currNode==null){
                System.out.println();
                if(q.isEmpty()){
                    return;
                }else{
                    q.add(null);
                }
            }else{
                System.out.print(currNode.data+" ");
                if(currNode.left!=null){
                    q.add(currNode.left);
                }
                if(currNode.right!=null){
                    q.add(currNode.right);
                }
            }
        }
    }
    public static int height(Node root){
        int lh,rh,ht;
        if(root==null){
            return 0;
        }
        lh=height(root.left);
        rh=height(root.right);
        ht=Math.max(lh,rh)+1;
        return ht;
    }

    public static int count(Node root){
        int lc,rc,cnt;
        if(root==null){
            return 0;
        }
        lc=count(root.left);
        rc=count(root.right);
        cnt=lc+rc+1;
        return cnt;
    }
    public static int sum(Node root){
        if(root==null){
            return 0;
        }
        int sum=0,ls,rs;
        ls=sum(root.left);
        rs=sum(root.right);
        sum=ls+rs+root.data;
        return sum;
    }

    public static void main(String[] args) {
        int nodes[]={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        BinaryTree tree= new BinaryTree();
        Node root=tree.buildTree(nodes);
        // System.out.println(root.data);
        // preTraversal(root);
        // inOrderTraversal(root);
        // postOrderTraversal(root);
        // LevelOrderTraversal(root);
        System.out.println(height(root));
        System.out.println(count(root));
        System.out.println(sum(root));
    }
}
