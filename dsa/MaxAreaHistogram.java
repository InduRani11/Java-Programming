import java.util.*;

public class MaxAreaHistogram {
    public static int maxArea(int height[]){
        int maxAr=0;
        int lft[]= new int[height.length];
        int rgt[]= new int[height.length];
        Stack<Integer> left=new Stack<>();
        Stack<Integer> right=new Stack<>();
        for(int j=0;j<height.length;j++){
            while(!left.isEmpty() &&height[left.peek()]>=height[j]){
                left.pop();
            }
            if(left.isEmpty()){
                lft[j]=-1;
            }
            else{
                lft[j]=left.peek();
            }
            left.push(j);
        }
        for(int j=height.length-1;j>=0;j--){
            while(!right.isEmpty() && height[right.peek()]>=height[j]){
                right.pop();
            }
            if(right.isEmpty()){
                rgt[j]=height.length;
            }
            else{
                rgt[j]=right.peek();
            }
            right.push(j);
        }
        for(int i=0;i<height.length;i++){
            int currArea=height[i]*(rgt[i]-lft[i]-1);
            maxAr=Math.max(maxAr,currArea);
        }
        System.out.println("maximum area of histogrem = "+maxAr);
    return 1;
    }
    public static void main(String[] args) {
        int height[]={2,4};
        int res=maxArea(height);

    }
}
