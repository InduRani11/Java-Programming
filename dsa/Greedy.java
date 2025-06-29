import java.util.*;

public class Greedy{
    public static void main(String[] args) {




//         int start[] = {1,3,0,5,8,5};
//         int end[]={2,4,6,7,9,9};
//
//         // sorting
//         int activities[][]= new int[start.length][3];
//         for(int i=0;i<start.length;i++){
//             activities[i][0]=i;
//             activities[i][1]=start[i];
//             activities[i][2]=end[i];
//         }
// //        lambda fn..
//         Arrays.sort(activities, Comparator.comparingDouble(o ->o[2]));
//         // end time based sorted
//         int maxAct=0;
//         ArrayList<Integer> ans=new ArrayList<>();
//
//         // 1st activity
//         maxAct=1;
//         ans.add(0);  //0 -> activities[0][0]
//         int lastEnd=end[0];  //end[0] -> activities[0][2]
//         for(int i=1;i<end.length;i++){
//             if(start[i]>=lastEnd){ //start[i] ->activities[i][1]
//                 maxAct++;
//                 lastEnd=end[i]; //end[i] -> activities[i][2]
//                 ans.add(i); //i ->activities[i][0]
//             }
//         }
//         System.out.println("Maximum activites:- "+maxAct);
//         for(int i=0;i<ans.size();i++){
//             System.out.print("A"+ans.get(i)+" ");
//         }
//         System.out.println();





    //    int val[]={60, 100, 120};
    //    int weight[]={10, 20, 30};
    //    int w=50;
    //     double ratio[][]=new double[val.length][2];
    //     for(int i=0;i<val.length;i++){
    //         ratio[i][0]=i;
    //         ratio[i][1]=val[i]/(double)weight[i];
    //     }
    //     Arrays.sort(ratio, Comparator.comparingDouble(o ->o[1]));
    //     int capacity=w;
    //     int finalVal=0;
    //     for(int i=ratio.length-1;i>=0;i--){
    //         int idx=(int)ratio[i][0];
    //         if(capacity>=weight[idx]){
    //             finalVal+=val[idx];
    //             capacity-=weight[idx];
    //         }
    //         else{
    //             // include fractional part
    //             finalVal+= (ratio[i][1]*capacity);
    //             capacity=0;
    //             break;
    //         }
    //     }
    //     System.out.println("Maximum value= "+finalVal);


        // Integer coins[]={1,2,5,10,20,50,100,500,2000};
        // int value=590;
        // Arrays.sort(coins , Comparator.reverseOrder());
        // int countOfCoins=0;
        // ArrayList<Integer> ans=new ArrayList<>();
        // for(int i=0;i<coins.length;i++){
        //     if(coins[i]<=value){
        //         while(coins[i]<=value){
        //             value-=coins[i];
        //             countOfCoins++;
        //             ans.add(coins[i]);
        //         }
        //     }
        // }
        // System.out.println("min no. of coins :- "+ countOfCoins);
        // for(int i=0;i<ans.size();i++){
        //     System.out.print(ans.get(i)+"  ");
        // }

        // // Job sequencing problem
        //
        // int jobInfo[][]={{4,20},{1,10},{1,40},{1,30}};

        // practice question on SPOJ platform

        int n=4,m=6;
        Integer costVer[]={2,1,3,1,4};
        Integer costHor[]={4,1,2};

        Arrays.sort(costVer, Collections.reverseOrder());
        Arrays.sort(costHor, Collections.reverseOrder());
        int h=0;int v=0;
        int hp=1,vp=1;
        int cost=0;
        while(h<costHor.length && v<costVer.length){
            if(costHor[h]>=costVer[v]){
                cost=cost+(costHor[h]*vp);
                hp++;
                h++;
            }
            else{
                cost=cost+(costVer[v]*hp);
                vp++;
                v++;
            }
        }
        while(h<costHor.length){
            cost=cost+(costHor[h]*vp);
            hp++;
            h++;
        }
        while(v<costVer.length){
            cost=cost+(costVer[v]*hp);
            vp++;
            v++;
        }
        System.out.println("Min cost of cuts:- "+cost);
    }
}