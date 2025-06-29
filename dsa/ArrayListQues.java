import java.util.*;
public class ArrayListQues {
    public static int pivit(ArrayList<Integer> list){
        for(int i=0;i<list.size();i++){
            if(list.get(i)>list.get(i+1)){
                return i;
            }
        }
        return -1;
    }
    
    public static boolean pairSum(ArrayList<Integer> list,int target, int pivit){
        int lp=pivit+1;
        int rp=pivit;
        int n=list.size();
        while(lp!=rp){
            if(list.get(lp)+list.get(rp)==target){
                return true;
            }else if(list.get(lp)+list.get(rp)>target){
                rp=(n+rp-1)%n;
            }else{
                lp=(lp+1)%n;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        // ArrayList<Integer> height=new ArrayList<>();
        // height.add(1);
        // height.add(8);
        // height.add(6);
        // height.add(2);
        // height.add(5);
        // height.add(4);
        // height.add(8);
        // height.add(3);
        // height.add(7);
        
        // ********////***STORE WATER FUNCTION*********//////*****
        
        // *******************BRUT FORCE APPROACH*******
        
        // int maxWater=Integer.MIN_VALUE;
        // for(int i=0;i<height.size()-1;i++){
        //     for(int j=i+1;j<height.size();j++){
        //         int minHt=Math.min(height.get(i), height.get(j));
        //         int width=j-i;
        //         int water=minHt*width;
        //         maxWater=Math.max(maxWater,water);
        //     }
        // }
        // System.out.println(maxWater);
        
        // ********////***STORE WATER FUNCTION*********//////*****
        
        // ************USING TWO POINTOR APPROCH************
        
        // int maxWater=0;
        // int i=0,j=height.size()-1;
        // while(i<j){
        //     int minHt=Math.min(height.get(i), height.get(j));
        //     int width=j-i;
        //     int water=minHt*width;
        //     maxWater=Math.max(maxWater,water);
        //     if(height.get(i) < height.get(j)){
        //         i++;
        //     }
        //     else{
        //         j--;
        //     }
        // }
        // System.out.println(maxWater);
        
        
    // there are two type of pair sum (find 2 no.whose sum== target )
    // 1. in sorted array or arraylist
    // 2. in rotated sorted array or arraylist
    // 1****************
        // 1. WE USE BRUTE FORCE TWO LOOPS
        // 2 WE USE TWO POINTOR METHOd
        
    // 2*******************
        ArrayList<Integer> list=new ArrayList<>();
        list.add(11);
        list.add(15);
        list.add(6);
        list.add(8);
        list.add(9);
        list.add(10);
        int target=10;
        int piv=pivit(list);
        if(piv>=0){
            System.out.println(pairSum(list, target, piv));
        }else{
            System.out.println("not arotated array");
        }
    }
}
