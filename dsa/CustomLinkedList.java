// linked list
        // it is a form of linear list
        // A-B-C-D in such a way we have a linked list
        // A,B,C&D are nodes of list and --- represent link b\w two nodes
        ///0
        // **a node:- basicall a node store two information 1, data   2, reference of next node
        // for define the ending of node we assign NULL to last node
        //
        // ** */ for reference :- we don't have pointor so we use object as reference variable
        // for acces object calss must be necessary
        //
        // ***/ there are two special node in linked list 1.head node  2.tail node
        // * head node is the first node present in ll
        // * tail node is last node before the [null]
        //
        // we don't perform any task like add ,sub, etc in main function
        // we create methods or function in linkedList class

public class CustomLinkedList {
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
    public static int size;

    // methods
    public void addFirst(int data){//0(1) time complexity

        // step1:- create new node
        Node newNode= new Node(data);
        size++;
        if(head==null){
            head=tail=newNode;
            return;
        }

        // step2:- store address of head in new node's next
        newNode.next = head; //linking

        // step3:- head = new node
        head=newNode;
    }
    // Add element in last

    public void addLast(int data){//0(1) time complexity

        // step1:- create new node
        size++;
        Node newNode= new Node(data);
        if(head==null){
            head=tail=newNode;
            return;
        }

        // step2:- store address of new node in tail's next
        tail.next = newNode; //linking

        // step3:- tail= new node
        tail=newNode;
    }


    // Add element in middle

    public void add(int idx, int data){
        if(idx==0){
            addFirst(data);
            return;
        }
        size++;
        Node newNode = new Node(data);
        Node temp= head;
        int i=0;
        while(i<idx-1){
            temp=temp.next;
            i++;
        }
        // i=idx-1; temp->pervious
        newNode.next=temp.next;
        temp.next=newNode;
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
    // remove first
    public int removeFirst(){
        if(size==0){
            System.out.print("ll is empty!!!!");
            return Integer.MIN_VALUE;
        } else if(size==1){
            int val=head.data;
            head=tail=null;
            size=0;
            return val;
        }
        int val=head.data;
        head=head.next;
        size--;
        return val;
    }

    // remove last
    public int removelast(){
        if(size==0){
            System.out.print("ll is empty!!!!");
            return Integer.MIN_VALUE;
        } else if(size==1){
            int val=head.data;
            head=tail=null;
            size=0;
            return val;
        }
        // previous = i=size-2
        Node prev=head;
        for(int i=0;i<size-2;i++){
            prev=prev.next;
        }
        int val = prev.next.data;
        prev.next = null;
        tail=prev;
        size--;
        return val;
    }

    // search for key
    public int itrsearch(int key){
        int i=0;
        Node temp=head;
        while(temp!=null){
            if(temp.data==key){
                return i;
            }
            temp=temp.next;
            i++;
        }
        return -1;
    }

    public int recSearch(int key){
        return helper(head,key);
    }

    public int helper(Node head,int key){
        if(head==null){
            return -1;
        }
        if(head.data==key){
            return 0;
        }
        int idx= helper(head.next,key);
        if(idx==-1){
            return -1;
        }
        return idx+1;
    }

    // reverse a linkedList
    public void reverse(){
        Node prev=null, curr = tail = head, next;
        while(curr!=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        head=prev;
    }

    // delete nth node from end
    public void delnthfrend(int n){
        int sz=0;
        Node temp=head;
        while(temp!=null){
            temp=temp.next;
            sz++;
        }

        if(sz==n){
            head=head.next;
            return;
        }

        // sz-n
        int i=1;
        int itofind=sz-n;
        Node prev= head;
        while(i<itofind){
            prev=prev.next;
            i++;
        }
        prev.next=prev.next.next;
        return;
    }

    public Node findMid(Node head){
        Node slow=head;
        Node fast=head;

        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }

    public boolean isPalindrome(){
        if(head==null ||head.next==null){
            return true;
        }
        // step1 - find mid
        Node midNode=findMid(head);

        // step2- reverse second half
        Node prev=null, curr = midNode, next;
        while(curr!=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        Node right=prev;
        Node left=head;


        // step3 - check left half & right half
        while(right!=null){
            if(left.data!= right.data){
                return false;
            }
            right=right.next;
            left=left.next;
        }
        return true;

    }

    //  this iscyclic is also called floyd's cycle finding algorithm
    public static boolean isCyclic(){
        Node fast=head;
        Node slow=head;
        while(fast!=null &&fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(fast==slow){ //cycle exist
                return true;
            }

        }
        return false;//cycle does not exist
    }

    // remove cycle from ll *******loop can't start from *****
    public static void removecycle(){
        Node slow=head;
        Node fast=head;
        boolean cycle=false;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast){
                cycle=true;
                break;
            }
        }
        if(cycle==false){
            return;
        }

        // remove loop
        slow=head;
        Node prev=null;
        while(slow!=fast){
            prev=fast;
            slow=slow.next;
            fast=fast.next;
        }
        // break cyclr -> prev=null;
        prev.next=null;

    }

    public static void main(String[] args) {
        CustomLinkedList ll = new CustomLinkedList();
        // ll.print();
        // ll.addFirst(1);
        // ll.print();
        // ll.addFirst(2);
        // ll.print();
        // ll.addLast(3);
        // ll.print();
        // ll.addLast(4);
        // ll.print();
        // ll.add(1,89);
        // ll.print();
        // ll.add(1,77);
        // ll.print();
        // ll.add(1,67);
        // ll.print();
        // ll.add(1,87);
        // ll.print();
        // System.out.println(ll.size);
        // ll.removeFirst();
        // ll.print();
        // ll.removelast();
        // ll.print();
        // System.out.println(ll.size);
        // System.out.println(ll.itrsearch(4));
        // System.out.println(ll.recSearch(89));
        // ll.reverse();
        // ll.print();
        // ll.delnthfrend(3);
        // ll.print();
        // ll.addLast(1);
        // ll.addLast(2);
        // ll.addLast(3);
        // ll.addLast(4);
        // ll.addLast(5);
        // ll.addLast(6);
        // tail.next=head;
        head=new Node(1);
        // head.next=new Node(2);
        Node temp=new Node(6);
        head.next=temp;

        head.next.next=new Node(7);
        head.next.next.next=new Node(8);
        head.next.next.next.next=temp;

        System.out.println(ll.isCyclic());
        removecycle();
        System.out.println(ll.isCyclic());

        ll.print();
        // System.out.println(ll.isPalindrome());
    }
}
