public class bits {
    /*
     * public static int getIthBit(int n, int i) {
     * int bitMask = 1 << i;
     * if ((n & bitMask) == 0) {
     * return 0;
     * }
     * return 1;
     * }
     */
    // set ith bits means makes ith bit to 1;
    public static int setIthBit(int n, int i) {
        int bitMask = 1 << i;
        return n | bitMask;
    }

    public static int clearIthBit(int n, int i) {
        int bitMask = ~(1 << i);
        return n & bitMask;
    }

   /******************************ERROR***************  
    * public static int updateIthBit(int n, int i, int newBit) {
        if (newBit == 0) {
            return clearIthBit(n, i);
        } else {
            return setIthBit(n, i);
        }
    }
    */

    public static void main(String args[]) {
        // System.out.println(getIthBit(15, 2));
        // System.out.println(setIthBit(10, 0));
        // System.out.println(clearIthBit(15, 3));
        //System.out.println(updateIthBit(15, 2, 1));
    }
}
