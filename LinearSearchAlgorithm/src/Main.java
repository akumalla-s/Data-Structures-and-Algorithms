public class Main {
    public static void main(String[] args) {

        int[] arr = {23, 45, 1, 2, 8, 19, -3, -16, 11};
        int target = 19;
        int ans = linearSearch(arr, target);
        System.out.println(ans);
    }

    //Search in the array: return the index if item found
    //Otherwise if item not found return -1
    public static int linearSearch(int[] arr, int target) {
        if (arr.length == 0) {
            return -1;
        }
        //run a for loop
        for (int index = 0; index < arr.length; index++) {
            int element = arr[index];
            if (element == target) {
                return index;
            }
        }

        //this line will execute when target is not found
        return -1;
    }
}