import java.util.*;

public class QueueQuestion {
//     public static void firstNonRep(String str){
//
//         int freq[]=new int[26];
//         Queue<Character> q=new LinkedList<>();
//         for(int i=0;i<str.length();i++){
//             char ch=str.charAt(i);
//             q.add(ch);
//             freq[ch-'a']=freq[ch-'a']+1;
//
//             while(!q.isEmpty() && freq[q.peek()-'a']>1){
//                 q.remove();
//             }
//             if(q.isEmpty()){
//                 System.out.println(-1+" ");
//             }else{
//                 System.out.println(q.peek()+" ");
//             }
//         }
//         System.out.println();
//     }
    public static void interleave(Queue<Integer> q){
        Queue<Integer> first=new LinkedList<>();
        int size=q.size();
        // while(!q.isEmpty()){
        //     first.add(q.remove());
        //     size++;
        // }
        for(int i=0;i<size/2;i++){
            first.add(q.remove());
        }
        while(!first.isEmpty()){
            q.add(first.remove());
            q.add(q.remove());

        }
    }
    public static void reversal(Queue<Integer> q){
        Stack<Integer> s=new Stack<>();
        while(!q.isEmpty()){
            s.push(q.remove());
        }
        while(!s.isEmpty()){
            q.add(s.pop());
        }
    }
    public static void main(String[] args) {
        // String str="aabccxb";
        // firstNonRep(str);
        Queue<Integer> q=new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        q.add(6);
        q.add(7);
        q.add(8);0
        q.add(9);
        q.add(10);
        reversal(q);
        while(!q.isEmpty()){
            System.out.print(q.remove()+" ");
        }
    }
}
