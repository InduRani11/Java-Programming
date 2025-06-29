import java.util.*;

public class LinkedListCollection {
    public static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    public static Node head;
    public static Node tail;

    public static Node findMid(Node head){
        Node slow=head;
        Node fast=head.next;

        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }
    public static Node merge(Node first,Node second) {
        Node temp=new Node(-1);
        Node h=temp;
        while(first!=null &&second!=null){
            if(first.data<=second.data){
                temp.next=first;
                temp=temp.next;
                first=first.next;
            }
            else{
                temp.next=second;
                temp=temp.next;
                second=second.next;
            }
        }
        while(first!=null){
            temp.next=first;
            temp=temp.next;
            first=first.next;
        }
        while(second!=null){
            temp.next=second;
            temp=temp.next;
            second=second.next;
        }
        temp.next=null;
        head=h.next;
        h.next=null;
        return head;
    }
    public void print(){
        if(head==null){
            System.out.println("linked list is empty");
            return;
        }
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
        System.out.print("null\n");
        return;
    }
    public static Node mergeSort(Node head){
        if(head.next==null||head==null){
            return head;
        }
        Node mid=findMid(head);
        Node left=head;
        Node right=mid.next;
        mid.next=null;
        Node first=mergeSort(left);
        Node second=mergeSort(right);
        return merge(first,second);
    }
    public static Node zigZag(Node head){
        Node mid=findMid(head);
        Node rightHalf=mid.next;
        mid.next=null;

        // reverse second half

        Node prev=null, curr = tail = rightHalf, next;
        while(curr!=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        rightHalf=prev;

        // mearge in alternate fassion
        Node leftHalf=head;
        Node lnext, rnext;
        while(leftHalf!=null &&rightHalf!=null){

            lnext=leftHalf.next;
            leftHalf.next=rightHalf;
            rnext=rightHalf.next;
            rightHalf.next=lnext;

            leftHalf=lnext;
            rightHalf=rnext;

        }
        return leftHalf;



    }
    public static void main(String[] args) {
        // in linkedlist we also use object to define datatype as same as arraylist
        // create
        // LinkedList<Integer> ll=new LinkedList<>();
        //
        // add
//         ll.addLast(6);
//         ll.addFirst(4);
//         ll.addFirst(3);
//
//         // print
//         System.out.println(ll);
//         // remove
//         ll.removeLast();
//         ll.removeFirst();
//         System.out.println(ll);
        LinkedListCollection ll=new LinkedListCollection();

        ll.head=new Node(5);
        head.next=new Node(2);
        head.next.next=new Node(5);
        head.next.next.next=new Node(9);
        head.next.next.next.next=new Node(8);
        head.next.next.next.next.next=new Node(1);
        head.next.next.next.next.next.next=null;
        // ll.findMid(head);
        ll.print();
        ll.zigZag(head);
        ll.print();
    }
}
