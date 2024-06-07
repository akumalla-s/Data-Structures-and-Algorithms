import java.util.Arrays;

public class FirstAndLastPosition {
    public static void main(String[] args) {
        int[] nums = {5, 7, 7, 7, 7, 8, 8, 10};
        int target = 7;
        int[] ans = searchRange(nums, target);
        System.out.println(Arrays.toString(ans));
    }

    private static int[] searchRange(int[] nums, int target) {
        int[] ans = {-1, -1};
        // check for first occurrence if target first
        ans[0] = search(nums, target, true);
        if(ans[0] != -1){
            ans[1] = search(nums, target, false);
        }
        return ans;
    }

    //this method will return the index of target
    private static int search(int[] nums, int target, boolean findStartIndex) {
        int ans = -1;
        int start = 0;
        int end = nums.length - 1;

        while (start <= end) {
            int middle = start + (end - start) / 2;
            if (target > nums[middle]) {
                start = middle + 1;
            } else if (target < nums[middle]) {
                end = middle - 1;
            } else {
                //potential ans found
                ans = middle;
                if (findStartIndex) {
                    end = middle - 1;
                } else {
                    start = middle + 1;
                }
            }
        }
        return ans;
    }
}
