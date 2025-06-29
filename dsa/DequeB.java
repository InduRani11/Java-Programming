import java.util.*;

// deque: double ended queue
// dequeue: verb, action , method

public class DequeB {
    static class Stack{
        static Deque<Integer> deque=new LinkedList<>();
        public static void push(int data){
            deque.addFirst(data);
        }
        public static int pop(){
            int val=deque.removeFirst();
            return val;
        }
        public static int peek(){
            return deque.getFirst();
        }
        public static void print(){
            System.out.println(deque);
        }
    }
    static class Queue{
        static Deque<Integer> deque=new LinkedList<>();
        public static void add(int data){
            deque.addLast(data);
        }
        public static int remove(){
            int val=deque.removeFirst();
            return val;
        }
        public static int peek(){
            return deque.getFirst();
        }
        public static void print(){
            System.out.println(deque);
        }
    }
    public static void main(String[] args) {
        // Deque<Integer> deque=new LinkedList<>();
        // deque.addFirst(3);
        // deque.addFirst(9);
        // deque.addFirst(6);
        // deque.addLast(5);
        // deque.addLast(7);
        // System.out.println(deque);
        // System.out.println(deque.getFirst());
        // System.out.println(deque.getLast());
        // deque.removeFirst();
        // deque.removeLast();
        // System.out.println(deque);
        Stack s=new Stack();
        s.push(4);
        s.push(5);
        s.push(7);
        s.push(9);
        s.print();
        s.pop();
        s.pop();
        s.print();

    }
}
