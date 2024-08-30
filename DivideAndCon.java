public class DivideAndCon {
    // public static void main(String arg[]) {
    // String arr[] = { "sun", "earth", "mars", "mercury" };
    // for (int i = 0; i < arr.length; i++) {
    // for (int j = 0; j < arr.length - 1; j++) {
    // if (arr[j].compareTo(arr[j + 1]) >= 0) {
    // String temp = null;
    // temp = arr[j];
    // arr[j] = arr[j + 1];
    // arr[j + 1] = temp;
    // }

    // }
    // }
    // for (int i = 0; i < arr.length; i++) {
    // System.out.print(arr[i] + "\t");
    // }
    // }

    public static int countInRange(int nums[], int num, int lo, int hi) {
        int count = 0;

        for (int i = lo; i <= hi; i++) {
            if (nums[i] == num) {
                count++;
            }
        }
        return count;
    }

    public static int majorityElementRec(int[] nums, int lo, int hi) {
        // base case;
        // the only element in an arrayof size 1 is the majority// element.
        if (lo == hi) {
            return nums[lo];
        }
        // recurse on left and right halves of thisslice.
        int mid = (hi - lo) / 2 + lo;
        int left = majorityElementRec(nums, lo, mid);
        int right = majorityElementRec(nums, mid + 1, hi);
        // if the two halves agree on the majorityelement, return it.
        if (left == right) {
            return left;
        } // otherwise, count each element and returnthe "winner".
        int leftCount = countInRange(nums, left, lo, hi);
        int rightCount = countInRange(nums, right, lo, hi);
        return leftCount > rightCount ? left : right;
    }

    public static int majorityElement(int[] nums) {
        return majorityElementRec(nums, 0, nums.length - 1);
    }

    public static void main(String args[]) {
        int nums[] = { 5, 7, 4, 5, 7, 8, 5, 4, 6, 3, 5, 7 };
        System.out.println(majorityElement(nums));
    }

}
