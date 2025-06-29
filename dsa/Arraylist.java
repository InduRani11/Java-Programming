
/* arraylist is a data structure that is in built in java it is linear structure
 *
 * array:_--  fixed size
 * primitive data can be stored
 *
 * arraylist :-- dynamic size
 * primitive data can not be stored directly
 *
 */



import java.util.*;
public class Arraylist {
    public static void swap(ArrayList<Integer> list, int idx1, int idx2){
        int temp=list.get(idx1);
        list.set(idx1,list.get(idx2));
        list.set(idx2, temp);
    }
    public static void main(String[] args) {
        //java collection framework
        ArrayList<Integer> list1 = new ArrayList<>();
        // ArrayList<String> list2 = new ArrayList<>();
        // ArrayList<Boolean> list3 = new ArrayList<>();
        // // Operations on array
        // 1. add element   0(1)
        list1.add(1);
        list1.add(2);
        list1.add(3);
        list1.add(4);
        list1.add(5);
        System.out.println(list1);
        // swap(list1,2,4);
        // System.out.println(list1);


        // list1.add(1,9); //0(n)
        // System.out.println(list1);

        // // 2. get element   0(1)
        // int element =list1.get(2);//2 is index
        //  System.out.println(element);

        //3. remove element   0(n)
        list1.remove(2);
        System.out.println(list1);

        // // 4. set element at index    0(n)
        // list1.set(2,10);
        // System.out.println(list1);

        // // 5. contains element   0(n)
        // System.out.println(list1.contains(1));
        // System.out.println(list1.contains(10));
        System.out.println(list1.contains(15));

        // // size
        // System.out.println(list1.size());
        // for(int i=0;i<list1.size();i++){
        //     System.out.print(list1.get(i)+" ");
        // }
        // System.out.println();
        // // print reverse
        // for(int i=list1.size()-1;i>=0;i--){
        //     System.out.print(list1.get(i)+" ");
        // }
        // System.out.println();

        // int max=Integer.MIN_VALUE;
        // for(int i=list1.size()-1;i>=0;i--){
        //     // if(max<list1.get(i)){
        //     //     max=list1.get(i);
        //     // }
        //     max=Math.max(max, list1.get(i));
        // }
        // System.out.println(max);
        list1.add(8);
        list1.add(2);
        list1.add(6);
        list1.add(4);
        list1.add(5);
        System.out.println(list1);
        // soarting of array list  we also can apply bubble, selection, insertion,mearge, quick ,count sort
        // but the optimize sorting is inbuilt [Colections.sort(list); ]
        //   Colection is a interface we use Collections i.e. a class

        Collections.sort(list1); //ascending order
        System.out.println(list1);

        Collections.sort(list1,Collections.reverseOrder()); //decending order
        // Collections.reverseOrder() it is a comparator that define fn logic
        System.out.println(list1);
        // multidimenational arraylist
        ArrayList<ArrayList<Integer>> main=new ArrayList<>();
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(1);
        arr.add(2);
        arr.add(3);




    }
}