

public class DoublyLL {
    public static class Node{
        int data;
        Node next;
        Node prev;
        public Node(int data){
            this.data=data;
            this.next=null;
            this.prev=null;
        }
    }
    public static Node head;
    public static Node tail;
    public static int size;

    public void addFirst(int data){
        Node newNode=new Node(data);
        if(head==null){
            head=tail=newNode;
        }

        newNode.next=head;
        head.prev=newNode;
        head=newNode;
        head.prev=null;
    }

    public void addLast(int data){
        Node newNode=new Node(data);
        if(head==null){
            head=tail=newNode;
        }

        newNode.next=null;
        newNode.prev=tail;
        tail.next=newNode;
        tail=newNode;


    }
    public void print(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+"<->");
            temp=temp.next;
        }
        System.out.println("null");

    }

    public void removeFirst(){
        if(head==null){
            return;
        }else
        if(head.next==null){
            head=tail=null;
            return;
        }else{
            head=head.next;
            head.prev=null;
        }

    }

    public void removeLast(){
        if(head==null){
            return;
        }else
        if(head.next==null){
            head=tail=null;
            return;
        }else{
            tail=tail.prev;
            tail.next=null;
        }

    }

    public static void main(String[] args) {
        DoublyLL dll=new DoublyLL();
        dll.addFirst(5);
        dll.addFirst(3);
        dll.addFirst(8);
        dll.addFirst(2);
        dll.addLast(7);
        dll.addLast(6);
        dll.print();

        dll.removeFirst();
        dll.removeLast();
        dll.print();
    }
}
