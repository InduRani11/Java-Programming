public class SortedAndRotatedArr {
    public static int search(int arr[], int tar, int si, int ei) {
        // kaam
        int mid = si + (ei - si) / 2;
        // case found
        if (tar == arr[mid]) {
            return mid;
        }
        // mid on L1
        if (arr[si] <= arr[mid]) {
            // case a :- left
            if (arr[si] <= tar && tar <= arr[mid]) {
                return search(arr, tar, si, mid - 1);
            }
            // case d:- right
            else {
                return search(arr, tar, mid + 1, ei);
            }
        }
        // mid on L2
        if (arr[mid] <= arr[ei]) {
            // case c :- right
            if (arr[mid] <= tar && tar <= arr[ei]) {
                return search(arr, tar, mid + 1, ei);
            }
            // case d:- left
            else {
                return search(arr, tar, si, mid - 1);
            }
        }

        return -1;

    }

    public static void main(String arg[]) {
        int arr[] = { 4, 5, 6, 7, 0, 1, 2 };
        int target = 0;
        int index = search(arr, target, 0, arr.length - 1);
        System.out.println(index);
    }

}
