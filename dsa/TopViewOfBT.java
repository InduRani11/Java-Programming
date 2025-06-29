
import java.util.*;
public class TopViewOfBT {
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
    static class Info{
        int hd;
        Node node;
        public Info(Node node, int hd){
            this.node=node;
            this.hd=hd;
        }
    }
    public static void topView(Node root){
        Queue<Info> q=new LinkedList<>();
        HashMap<Integer, Node> map=new HashMap<>();
        int min=0,max=0;
        q.add(new Info(root, 0));
        q.add(null);
        while(!q.isEmpty()){
            Info curr=q.remove();
            if(curr==null){
                if(q.isEmpty()){
                    break;
                }else{
                    q.add(null);
                }
            }else{
                if(!map.containsKey(curr.hd)){
                    map.put(curr.hd,curr.node);
                }
                if(curr.node.left!=null){
                    q.add(new Info(curr.node.left, curr.hd-1));
                    min=Math.min(min,curr.hd-1);
                }
                if(curr.node.right!=null){
                    q.add(new Info(curr.node.right, curr.hd+1));
                    max=Math.max(max,curr.hd+1);
                }
            }
        }
        for(int i=min;i<=max;i++){
            System.out.print(map.get(i).data+" ");
        }
    }
    public static void kthLevel(Node root,int level,int k){
        if(root==null){
            return;
        }
        if(level==k){
            System.out.println(root.data+" ");
            return;
        }
        kthLevel(root.left,level+1,k);
        kthLevel(root.right,level+1,k);

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
        // topView(root);
        kthLevel(root,0,2);
        System.out.println(lowestCommanAncestor(root, 4, 7).data);
    }
}