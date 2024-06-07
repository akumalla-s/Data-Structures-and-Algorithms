public class RotationCount {
    public static void main(String[] args) {
        int[] arr = {4, 5, 6, 7, 0, 1, 2};
        System.out.println(countRotation(arr));
    }

    private static int countRotation(int[] arr) {
        int pivot = findPivot(arr);
        return pivot + 1;
    }


    //Use this method if array doesn't contain duplicates
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

    private static int findPivotWithDuplicates(int[] arr) {
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
}
