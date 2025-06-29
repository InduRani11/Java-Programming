// public class A{
//     int add(int i,int j){
//         return i+j;
//     }
// }
// public class B extends A{
//     public static void main(String arg[]){
//        short s=8;
//        System.out.println(add(s,6));
//     }
// }
public class B {
    public static void main(String[] args) {
    // try {
    //     Float f1 = new Float("3.0");
    //     int x = f1.intValue();
    //     byte b = f1.byteValue();
    //     double d = f1.doubleValue();
    //     System.out.println(x + b + d);
    // }catch (NumberFormatException e) /* Line 9 */
    //  {
    //     System.out.println("bad number"); /* Line 11 */
    //  }
        // int mask = 0x000F;
        // int value = 0x2222;
        // System.out.println(value & mask);
        int prices[]={3,78,8,9,3,6,8};
        int arr[]=new int[prices.length];
        int max=0;
        for(int i=arr.length-1;i>=0;i--){
            arr[i]=max;
            max=Math.max(max,arr[i]);
            System.out.print(max+" ");
        }
        int maxpr=0;
        int pr;
        for(int i=0;i<arr.length-1;i++){
            pr=arr[i]-prices[i];
            maxpr=Math.max(maxpr,pr);

        }
    }
}