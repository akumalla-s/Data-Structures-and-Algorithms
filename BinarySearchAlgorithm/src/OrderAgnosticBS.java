public class OrderAgnosticBS {
    public static void main(String[] args) {
        int[] arr = {-18, -12, -4, 0, 2, 3, 4, 15, 16, 18, 22, 45};
        int[] arr2 = {32, 12, 4, 5, 1, -4, -10};
        int target = 12;
        int ans = orderAgnosticBS(arr2, target);
        System.out.println(ans);
    }

    private static int orderAgnosticBS(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        //find whether the array is sorted in ascending or descending
        boolean isAscending = arr[start] < arr[end];

        while (start <= end) {
            //might be possible that (start + end) exceeds the range of int in Java
            //int middle = (start + end) / 2;
            //Better way to find the mid
            int middle = start + (end - start) / 2;

            if (arr[middle] == target) {
                return middle;
            }

            if (isAscending) {
                if (target < arr[middle]) {
                    end = middle - 1;
                } else if (target > arr[middle]) {
                    start = middle + 1;
                }
            } else {
                if (target > arr[middle]) {
                    end = middle - 1;
                } else if (target < arr[middle]) {
                    start = middle + 1;
                }
            }
        }
        return -1;
    }
}
