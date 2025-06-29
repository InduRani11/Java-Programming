import java.util.*;
public class paranthesis {
    public static boolean validParanthesis(String str){
        Stack<Character> s=new Stack<>();
        for(int i=0;i<str.length();i++){
            // opening bracket
            if(str.charAt(i)=='('||str.charAt(i)=='{'||str.charAt(i)=='['){
                s.push(str.charAt(i));
            }
            // closing bracket
            if(str.charAt(i)==')'){
                if(s.peek()=='('){
                    s.pop();
                }else{
                    return false;
                }
            }
            if(str.charAt(i)=='}'){
                if(s.peek()=='{'){
                    s.pop();
                }else{
                    return false;
                }
            }
            if(str.charAt(i)==']'){
                if(s.peek()=='['){
                    s.pop();
                }else{
                    return false;
                }
            }

        }
        if(!s.isEmpty()){
                return false;
            }
        return true;
    }
    public static boolean isDoublicateParantheses(String str){
        Stack<Character> s=new Stack<>();
        int count;
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);

            // closing
            if(ch==')'){
                count=0;
                while(s.peek()!='('){
                    count++;
                    s.pop();
                }
                if(count<1){
                    return true;
                }else{
                    s.pop();
                }
            }else{
                s.push(ch);
            }

        }
        return false;
    }
    public static void main(String[] args) {
        String str="(((a+b)+(c-d)))";
        System.out.println(isDoublicateParantheses(str));
    }
}
