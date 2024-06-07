public class SearchInMountain {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 3, 1};
        int target = 21;
        System.out.println(findInMountainArray(arr, target));
    }

    private static int findInMountainArray(int[] arr, int target) {
        int peak = peakIndexInMountainArray(arr);
        int firstTry = orderAgnosticBinarySearch(arr, target, 0, peak);
        if (firstTry != -1) {
            return firstTry;
        }
        //try to search in second half
        return orderAgnosticBinarySearch(arr, target, peak + 1, arr.length - 1);
    }

    private static int peakIndexInMountainArray(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start < end) {
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
        return start;
    }

    private static int orderAgnosticBinarySearch(int[] arr, int target, int start, int end) {
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
