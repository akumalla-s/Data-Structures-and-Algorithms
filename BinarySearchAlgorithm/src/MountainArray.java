public class MountainArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 5, 6, 4, 3, 2};
        System.out.println(peakIndexInMountainArray(arr));
    }

    private static int peakIndexInMountainArray(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start < end)  {
            int middle = start + (end - start) / 2;
            if (arr[middle] > arr[middle + 1]) {
                //you are in decreasing part of array
                //this may be the answer, but look at left side of the array
                end = middle;
            } else {
                //your are in increasing part of array
                //because we know that mid+1 element > middle element
                start = middle + 1;
            }
        }
        // In the end, start == end and pointing to the largest number because of the above two checks
        return start ;
    }
}
