// Queue means a line or row
// |front | | | | | |rear|
// it is a fifo data structure
// basically it has three types
// 1. add 0(n) enque
// enque is on rear position

// 2. Remove 0(n) dequeue
// Dequeue:- removing element from queue
// dequeue is always from front
// Deque:- double sided queue

// 3. peek 0(n) front
// ****Implementation***

// *from Array
// here we have a fixed size of queue
public class QueueB{
    static class Queue{
        static int arr[];
        static int size;
        static int rear;

        Queue(int n){
            arr=new int[n];
            size=n;
            rear=-1;
        }
        public static boolean isEmpty(){
            return rear==-1;
        }
        public static void add(int data){
            if(rear==size-1){
                System.out.println("Queue is full");
                return;
            }
            rear=rear+1;
            arr[rear]=data;
        }
        public static void print(){
            for(int i=0;i<=rear;i++){
                System.out.print(arr[i]+" ");
            }
        }
        public static int remove(){
            if(isEmpty()){
                System.out.println("Empty queue");
                return -1;
            }
            int front=arr[0];
            for(int i=0;i<rear;i++){
                arr[i]=arr[i+1];
            }
            // arr[rear]=0;
            rear=rear-1;
            return front;
        }
        public static int peek(){
            if(isEmpty()){
                System.out.println("Empty queue");
                return -1;
            }
            int front=arr[0];
            return front;
        }
    }
//     // remove in array having 0(n) time complexity for resolvig this we use circular queue
    // static int front;
    // Queue(int n){
    //     arr=new int[n];
    //     size=n;
    //     rear=-1;
    //     front =-1;
    // }
//     public static boolean isEmpty(){
//         return rear==-1 && front==-1;
//     }
//     public static void add(int data){
//         if((rear+1)%size==front){
//             System.out.println("Queue is full");
//             return;
//         }
//         if(front==-1){
//             front=0;
//         }
//         rear=(rear+1)%size;
//         arr[rear]=data;
//     }
//     public static void print(){
//         for(int i=front;i<front+size;i++){
//             System.out.print(arr[i%size]+" ");
//         }
//     }
//     public static int remove(){
//         if(isEmpty()){
//             System.out.println("Empty queue");
//             return -1;
//         }
//
//         int fr=arr[front];
//         arr[front]=0;
//         if(rear==front){
//             rear=front=-1;
//
//         }
//         else{
//             front=(front+1)%size;
//         }
//         // front=(front+2)%size;
//         return fr;
//     }
//     public static int peek(){
//         if(isEmpty()){
//             System.out.println("Empty queue");
//             return -1;
//         }
//         int fr=arr[front];
//         return fr;
//     }
// }
//
//
    public static void main(String[] args) {
        Queue q=new Queue(5);
        q.add(6);
        q.add(8);
        q.add(5);
        q.add(7);
        q.add(9);
        q.print();
        System.out.println();
        q.remove();
        q.add(4);
        q.remove();
        q.add(3);
        q.print();
    }
}
    // static class Node{
    //     int data;
    //     Node next;
    //     Node(int data){
    //         this.data=data;
    //         this.next=null;
    //     }
    // }
//     static class Queue{
//         static Node head=null;
//         static Node tail=null;
//
//         public static boolean isEmpty(){
//             return head==null &&tail==null;
//         }
//         public static void add(int data){
//             Node newNode =new Node(data);
//             if(isEmpty()){
//                 head=tail=newNode;
//             }else{
//                 tail.next=newNode;
//                 tail=newNode;
//             }
//         }
//         public static int remove(){
//             int val;
//             if(isEmpty()){
//                 System.out.println("Queue is empty");
//                 return -1;
//             }
//             else if(head.next==null){
//                 val=head.data;
//
//                 tail=head=null;
//             }else{
//                 val=head.data;
//                 head=head.next;
//             }
//             return val;
//         }
//         public static int peek(){
//             int val;
//             if(isEmpty()){
//                 System.out.println("Queue is empty");
//                 return -1;
//             }
//
//             return head.data;
//         }
//         public static void main(String[] args) {
//             Queue q=new Queue();
//             q.add(6);
//             q.add(8);
//             q.add(5);
//             q.add(7);
//             q.add(9);
//             // q.print();
//             // System.out.println();
//             q.remove();
//             q.add(4);
//             q.remove();
//             q.add(3);
//             // q.print();
//             // Node temp=head;
//             while(!q.isEmpty()){
//                 System.out.println(q.peek());
//                 q.remove();
//
//             }
//         }
//     }
// }