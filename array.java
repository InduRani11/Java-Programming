public class array {
    /**
     * public static boolean cheakTwice(int num[]) {
     * boolean a = false;
     * for (int i = 0; i < num.length; i++) {
     * for (int j = 0; j < num.length && j != i; j++) {
     * if (num[i] == num[j]) {
     * a = true;
     * }
     * }
     * }
     * return a;
     * }
     */
    public static void triplet(int num[]) {
        System.out.print("[");
        for (int i = 0; i < num.length; i++) {
            for (int j = 0; j < num.length && j != i; j++) {
                for (int k = 0; k < num.length && k != i && k != j; k++) {
                    if (num[i] + num[j] + num[k] == 0) {
                        System.out.print("[" + num[i] + "," + num[j] + "," + num[k] + "] ");
                    }
                }
            }
        }
        System.out.print("]");
    }

    public static void main(String args[]) {
        int num[] = {};
        triplet(num);
    }
}