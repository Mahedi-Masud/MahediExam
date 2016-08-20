package math;

/**
 * Created by mrahman on 4/9/16.
 */

public class FindMissingNumber {
        /*
         * If n = 10, then array will have 9 elements in the range from 1 to 10.
         * For example {10,2,1, 4, 5, 3, 7, 8, 6}. One number will be missing in array (9 in this case).
         * Write java code to find the missing number from the array. Use some static helper method to find it.
         */
        public static int count = 0;
    public static int position = 0;
    public static boolean flag = false;

    public static void main(String[] args) {

        int a[] = { 0, 1, 2, 3, 4, 5,6, 7, 8, 10, };

        findMissingNumbers(a, position);

    }

    private static void findMissingNumbers(int a[], int position) {

        if (position == a.length - 1)
            return;

        for (; position < a[a.length - 1]; position++) {

            if ((a[position] - count) != position) {
                System.out.println("Missing Number: " + (position + count));
                flag = true;
                count++;
                break;
            }
        }

        if (flag) {
            flag = false;
            findMissingNumbers(a, position);
        }
    }

}

