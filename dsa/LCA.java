import java.util.ArrayList;
public class LCA {
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
    public static boolean findPath(Node node,int n,ArrayList<Node> path){
        if(node==null){
            return false;
        }
        path.add(node);
        if(node.data==n){
            return true;
        }
        boolean foundleft = findPath(node.left,n,path);
        boolean foundright = findPath(node.right,n,path);
        if(foundleft || foundright){
            return true;
        }
        path.remove(path.size()-1);
        return false;

    }
    public static Node lowestCommanAncestor(Node root,int n1,int n2){
        ArrayList<Node> path1=new ArrayList<>();
        ArrayList<Node> path2=new ArrayList<>();

        findPath(root, n1, path1);
        findPath(root, n2, path2);
        int i=0;
        for(;i<path1.size()&&i<path2.size();i++){
            if(path1.get(i)!=path2.get(i)){
                break;
            }
        }
        return path1.get(i-1);
    }

    public static void main(String[] args) {
        Node root=new Node(1);
        root.left=new Node(2);
        root.right=new Node(3);
        root.left.left=new Node(4);
        root.left.right=new Node(5);
        root.right.left=new Node(6);
        root.right.right=new Node(7);
        System.out.println(lowestCommanAncestor(root, 4, 5).data);
    }
}
