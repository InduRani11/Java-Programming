
import java.lang.classfile.components.ClassPrinter;
import java.math.RoundingMode;

public class SubTreeInAnotherTree {
    static class Node{
        int data;
        Node left;
        Node right;
        public Node(int data){
            this.data=data;
            this.left=null;
            this.right=null;
        }
    }
    public static boolean isIdentical(Node root,Node subRoot){
        if(root==null && subRoot==null){
            return true;
        }else if(root==null || subRoot==null){
            return false;
        }
        if(root.data!=subRoot.data){
            return false;
        }
        return isIdentical(root.left, subRoot.left)&& isIdentical(root.right, subRoot.right);
    }
    public static boolean isSubTree(Node root,Node subRoot){
        if(root==null){
            return false;
        }
        if(root.data==subRoot.data){
            if(isIdentical(root,subRoot)){
                return true;
            }
        }

        return isSubTree(root.left, subRoot)||isSubTree(root.right, subRoot);
    }
    public static void main(String arg[]){
        Node root=new Node(1);
        root.left=new Node(2);
        root.right=new Node(3);
        root.left.left=new Node(4);
        root.left.right=new Node(5);
        root.right.left=new Node(6);
        root.right.right=new Node(7);

        Node subRoot=new Node(2);
        subRoot.left=new Node(4);
        subRoot.right=new Node(5);

        System.out.println(isSubTree(root, subRoot));
    }
}
