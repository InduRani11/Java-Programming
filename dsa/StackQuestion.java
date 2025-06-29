import java.util.*;

public class StackQuestion {
    public static void AddAtBottom(Stack<Integer> s,int val){
        if(s.isEmpty()){
            s.push(val);
            return;
        }
        int top=s.pop();
        AddAtBottom(s, val);
        s.push(top);
    }
//     public static String ReverseStr(String str){
//         // if(i==str.length()){
//         //     return;
//         // }
//         Stack<Character> c=new Stack<>();
//         for(int i=0;i<str.length();i++){
//             c.push(str.charAt(i));
//         }
//         StringBuilder res=new StringBuilder("");
//         while(!c.isEmpty()){
//             res.append(c.pop());
//         }
//         return res.toString();
//
//
//     }
    public static void reverseStack(Stack<Integer> s){
        if(s.isEmpty()){
            return;
        }
        int top=s.pop();
        reverseStack(s);
        AddAtBottom(s, top);
    }

    public static void stockSpan(int stock[],int span[]){
        span[0]=1;
        Stack<Integer> s=new Stack<>();
        s.push(0);
        for(int i=1;i<stock.length;i++){
            int currPrice=stock[i];
            while(!s.isEmpty() && currPrice>= stock[s.peek()]){
                s.pop();
            }
            if(s.isEmpty()){
                span[i]=i+1;
            }
            else{
                int prevHigh=s.peek();
                span[i]=i-prevHigh;
            }
            s.push(i);
        }
    }

    public static void nextGreaterEle(int arr[],int nxtGreater[]){
        // other form of same code
        // next greater right
        // next greater left
        // next smaller right
        // next smaller right
        //
        Stack<Integer> s=new Stack<>();
        for(int i=arr.length-1;i>=0;i--){
            // 1 while
            while(!s.empty() && arr[s.peek()]<=arr[i]){
                s.pop();
            }
            // 2 if else
            if(s.isEmpty()){
                nxtGreater[i]=-1;
            }
            else{
                nxtGreater[i]=arr[s.peek()];

            }
            // 3 push at s
            s.push(i);
        }

    }
    public static void main(String[] args) {
        // Stack<Integer> s=new Stack<>();
        // s.push(5);
        // // System.out.println(s.isEmpty());
        // s.push(6);
        // s.push(2);
        // s.push(4);
        // // while(!s.isEmpty()){
        // //     System.out.print(s.peek()+" ");
        // //     s.pop();
        // // }
        // AddAtBottom(s, 8);
        // while(!s.isEmpty()){
        //     System.out.print(s.peek()+" ");
        //     s.pop();
        // }

        // *******reverse string*******
        // String str="abcdef";
        // System.out.println(ReverseStr(str));

        // ***********stack reverse*****
//         Stack<Integer> s=new Stack<>();
//         s.push(5);
//         s.push(6);
//         s.push(2);
//         s.push(4);
//
//         reverseStack(s);
//         while(!s.isEmpty()){
//             System.out.print(s.peek()+" ");
//             s.pop();
//         }

// **********stock span problem************
//         int stock[]={100,80,60,70,60,85,100};
//         int span[]= new int[stock.length];
//         stockSpan(stock, span);
//
//         for(int i=0;i<span.length;i++){
//             System.out.print(span[i]+" ");
//         }
        int arr[]={6,8,0,1,3};
        int nxtGreater[]= new int[arr.length];
        nextGreaterEle(arr, nxtGreater);
        for(int i=0;i<nxtGreater.length;i++){
            System.out.print(nxtGreater[i]+" ");
        }

    }
}
