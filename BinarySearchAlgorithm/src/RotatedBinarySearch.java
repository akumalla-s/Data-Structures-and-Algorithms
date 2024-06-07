public class RotatedBinarySearch {
    public static void main(String[] args) {
        int[] arr = {4, 5, 6, 7, 0, 1, 2};
        int target = 1;
        System.out.println(search(arr, target));

    }

    private static int search(int[] arr, int target) {
        int pivot = findPivot(arr);
        //If you did not find a pivot the array is not rotated
        if (pivot == -1) {
            //just do a normal BS
            return binarySearch(arr, target, 0, arr.length - 1);
        }

        //If pivot is found, you have found 2 ascending arrays
        if (arr[pivot] == target) {
            return pivot;
        } else if (target > arr[0]) {
            return binarySearch(arr, target, 0, pivot);
        } else {
            return binarySearch(arr, target, pivot + 1, arr.length - 1);
        }
    }

    private static int findPivot(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int middle = start + (end - start) / 2;

            //4 cases over here
            if (middle < end && arr[middle] > arr[middle + 1]) {
                return middle;
            }
            if (middle > start && arr[middle] < arr[middle - 1]) {
                return middle - 1;
            }
            if (arr[middle] <= arr[start]) {
                end = middle - 1;
            } else {
                start = middle + 1;
            }

        }
        return -1;
    }

    private static int binarySearch(int[] arr, int target, int start, int end) {
        while (start <= end) {
            int middle = start + (end - start) / 2;
            if (target < arr[middle]) {
                end = middle - 1;
            } else if (target > arr[middle]) {
                start = middle + 1;
            } else {
                return middle;
            }
        }
        return -1;
    }
}
