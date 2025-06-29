public class DiameterTree {
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
    public static int diameter(Node root){//0(n2)
        if(root==null){
            return 0;
        }
        int ld=diameter(root.left);
        int rd=diameter(root.right);
        int lh=height(root.left);
        int rh=height(root.right);
        int slfDia=lh+rh+1;
        return Math.max(Math.max(ld,rd),slfDia);
    }
    static class Info{
        int diam;
        int ht;
        public Info(int diam, int ht){
            this.diam=diam;
            this.ht=ht;
        }
    }
    public static Info diameterApp2(Node root){
        if(root==null){
            return new Info(0,0);
        }
        Info lInfo=diameterApp2(root.left);
        Info rInfo=diameterApp2(root.right);
        int dia=Math.max(Math.max(lInfo.diam,rInfo.diam),lInfo.ht+rInfo.ht+1);
        int ht=Math.max(lInfo.ht,rInfo.ht)+1;
        Info i=new Info(dia,ht);
        return i;
    }
    public static void main(String arg[]){
        Node root=new Node(1);
        root.left=new Node(2);
        root.right=new Node(3);
        root.left.left=new Node(4);
        root.left.right=new Node(5);
        root.right.left=new Node(6);
        root.right.right=new Node(7);
        System.out.println(diameterApp2(root).diam);
    }
}
