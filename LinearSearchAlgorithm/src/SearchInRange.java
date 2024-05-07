public class SearchInRange {
    public static void main(String[] args) {
        int[] arr = {23, 45, 1, 2, 8, 19, -3, -16, 11};
        int target = 1;
        int ans = linearSearch(arr, target, 1,4);
        System.out.println(ans);
    }

    private static int linearSearch(int[] arr, int target, int start, int end) {
        if (arr.length == 0) {
            return -1;
        }
        for (int index = start; index <= end; index++) {
            int element = arr[index];
            if (target == element) {
                return index;
            }
        }
        return -1;
    }
}
