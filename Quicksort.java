public class Quicksort {
    public static void printArr(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void quickSort(int arr[], int si, int ei) {
        if (si >= ei) {
            return;
        }
        int piidx = partition(arr, si, ei);
        quickSort(arr, si, piidx - 1);
        quickSort(arr, piidx + 1, ei);
    }

    public static int partition(int arr[], int si, int ei) {
        int pivit = arr[ei];
        int i = si - 1;
        for (int j = si; j < ei; j++) {
            if (arr[j] <= pivit) {
                i++;

                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }
        }
        i++;
        int temp = pivit;
        arr[ei] = arr[i]; // main point
        arr[i] = temp;
        return i;
    }

    public static void main(String arg[]) {
        int arr[] = { 2, 8, 5, 9, 4, 3, 6, 7 };
        printArr(arr);
        quickSort(arr, 0, arr.length - 1);
        printArr(arr);

    }
}
