// import java.util.*;
// public class Backtracking {
//     public static void asignArr(int arr[],int i,int value){
//         if(i==arr.length){
//             printArr(arr);
//             return;
//         }
//         arr[i]=value;
//         asignArr(arr,i+1,value+1); //function calling step
//         arr[i]=arr[i]-2;  //backtracking steps
//     }
//     public static void printArr(int arr[]){
//         for(int i=0;i<arr.length;i++){
//             System.out.print(arr[i]+" ");
//         }
//         System.out.println();
//     }
//     public static void main(String arg[]){
//         int arr[]=new int[5];
//         asignArr(arr,0,1);
//         printArr(arr);
//     }
// }

// **********FIND SUBSETS*******
// time complexity O(n*2^n) space O(n)
// public class Backtracking {
//     public static void findSubset(String str,String ans,int i){
//         // base  case
//         if(i==str.length()){
//             System.out.println(ans);
//             return;
//         }
//         // recursion
//         // choice yes
//         findSubset(str, ans+str.charAt(i), i+1);
//         // choice No
//         findSubset(str, ans, i+1);
//     }
//     public static void main(String arg[]){
//         String str="abc";
//         String ans="";
//         findSubset(str, ans, 0);
//     }
// }


// **********FIND PERMUTATION*******
// time complexity O(n*n!) space O(n)




// **********Nqueens*******
// time complexity O(n!) 
// changes for finding solution is possible or not or for print one solution
// public class Backtracking{
//     public static void printBoard(char board[][]){
//         System.out.println("-----------------");
//         for(int i=0;i<board.length;i++){
//             for(int j=0;j<board.length;j++){
//                 System.out.print(board[i][j]);
//             }
//             System.out.println();
//         }
//     }
//     public static boolean isSafe(char board[][],int row,int col){
//         //column up
//         for(int i=row;i>=0;i--){
//             if(board[i][col]=='Q'){
//                 return false;
//             }
//         }
//          //diagonal left
//          for(int i=row, j=col;j>=0&&i>=0;j--,i--){
//             if(board[i][j]=='Q'){
//                 return false;
//             }
//         }
//          //diagonal right
//          for(int i=row, j=col;j<board.length&&i>=0;j++,i--){
//             if(board[i][j]=='Q'){
//                 return false;
//             }
//         }
//         return true;
//     }
//     // change void --> boolean
//     public static /*void*/boolean nQueen(char board[][],int row){
//         if(row==board.length){
//             // count++;
//             // printBoard(board);
//             return true;
//         }
//         for(int j=0;j<board.length;j++){
//             if(isSafe(board,row,j)){
//                 board[row][j]='Q';
//                 if(nQueen(board,row+1)){
//                     return true;
//                 }
//                 // board[row][j]='_';
//             }
        
//         }
//         return false;
//     }
//     static int count=0;
//     public static void main(String[] args) {
//         int n=3;
//         char[][] board=new char[n][n];
//         for(int i=0;i<n;i++){
//             for(int j=0;j<n;j++){
//                 board[i][j]='_';
                
//             }
//         }
//         if(nQueen(board,0)){
//             System.out.println("Solution is possible");
//             printBoard(board);
//         }else{
//             System.out.println("solution is not possible");
//         }
//         // System.out.println("the no. of solutions:-   "+count);
//     }
// }


// grid ways 
// every grid has two choices either is left or down 
// fn that define recursion
// f(x,y) = f(x+1,y) + f(x,y+1);
// time complexity 2^m*n

// public class Backtracking{
//     public static int gridWays(int i,int j,int n,int m){
//         // if((i==n-1&&j==n-2)||(i==n-2&&j==n-1)){
//         //     return 1;
//         // }
//         if((i==n-1&&j==n-1)){
//             return 1;
//         }
//         else if(i==n||j==n){
//             return 0;
//         }
//         int w1=gridWays(i+1, j, n, m);
//         int w2=gridWays(i, j+1, n, m);
//         return w1+w2;

//     }
//     public static void main(String[] args) {
//         int n=3,m=3;
//         int ways=gridWays(0, 0, n, m);
//         System.out.println(ways);
//     }
// }

// TRICK WAY OF GRIDWAYS

public class Backtracking{
    public static int fact(int n){
        int res=1;
        for(int i=1;i<=n;i++){
            res*=i;
        }
        return res;
    }
    // rrdd,rdrd (n-1 )down and (m-1 )right
    public static int permutation(int m,int n){
        int result = fact(m+n-2)/((fact(n-1))*(fact(m-1)));
        return result;
    }  
    public static void main(String[] args) {
        int n=3,m=3;
        int ways=permutation( n, m);
        System.out.println(ways);
    }
}