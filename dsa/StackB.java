// STACK HAVING THREE OPERATION
// 1. push
// 2. pop
// 3.peek
// all operation has O(1) or constant time complexity

// upper element is very special and called it top
// It is also called LIFO or FILO data structure
// Stack can be created through Array, ArrayList or LinkedList
// HEAD of the linkedList will be the top of stack

import java.util.*;

public class StackB{
//     static class Stack{
//
//         // ****************THROUGH ARRAYLIST************//
//
// //         static ArrayList<Integer> list=new ArrayList<>();
// //         public static boolean isempty(){
// //             return list.size()==0;
// //         }
// //
// //         // push
// //         public static void push(int data){
// //             list.add(data);
// //         }
// //         // pop
// //         public static int pop(){
// //             int top=list.get(list.size()-1);
// //             list.remove(list.size()-1);
// //             return top;
// //         }
// //
// //         // peek
// //         public static int peek(){
// //             if(list.size()==0){
// //                 return  -1;
// //             }
// //             int top=list.get(list.size()-1);
// //             return top;
//         // }
//
//         //************************THROUGH LINKEDLIST******** */
//
//         static Node head=null;
//         static Node tail=null;
//         public static boolean isEmpty(){
//             return head==null;
//         }
//
//         public static void push(int data){
//
//             Node newNode=new Node(data);
//             if(isEmpty()){
//                 head=newNode;
//                 return;
//             }
//             newNode.next=head;
//             head=newNode;
//         }
//         public static int pop(){
//             if(isEmpty()){
//                 return -1;
//             }
//             int val=head.data;
//             head=head.next;
//             return val;
//         }
//         public static int peek(){
//             if(isEmpty()){
//                 return -1;
//             }
//             int val=head.data;
//
//             return val;
//         }
//     }
//     static class Node{
//         int data;
//         Node next;
//         Node(int data){
//             this.data=data;
//             this.next=null;
//         }
//     }
    public static void main(String[] args) {
        // Stack s=new Stack();
        Stack <Integer> s=new Stack<>(); //java Collection framworkS
        s.push(3);
        s.push(7);
        s.push(5);
        s.push(2);
        s.push(9);
        s.push(6);
//
        while(!s.isEmpty()){
            System.out.println(s.peek());
             s.pop();
        }
        System.out.println("end stack");
    // s.push(7);
    }
}