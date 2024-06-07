public class RotatedBinarySearchWithDuplicates {
    public static void main(String[] args) {
        int[] arr = {2, 9, 2, 2, 2, 1};
        int target = 2;
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
            //If elements at middle, start and end are equal then just skip the duplicates
            if (arr[middle] == arr[start] && arr[middle] == arr[end]) {
                //skip the duplicates
                //check if start is pivot
                if (arr[start] > arr[start + 1]) {
                    return start;
                }
                start++;

                //check if the end is pivot
                if (arr[end] < arr[end - 1]) {
                    return end - 1;
                }
                end--;
            }
            //left side is sorted, so pivot should be in the right
            else if (arr[start] < arr[middle] || (arr[start] == arr[middle] && arr[middle] > arr[end])) {
                start = middle + 1;
            } else {
                end = middle - 1;
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
