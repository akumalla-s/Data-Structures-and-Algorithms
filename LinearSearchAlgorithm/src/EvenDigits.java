public class EvenDigits {
    public static void main(String[] args) {

        System.out.println(findNumbers(new int[]{12, 356, 1, -4534}));
        //System.out.println(digits2(12344));
    }

    //    {12, 356, 1, 4534}
    private static int findNumbers(int[] nums) {
        int count = 0;
        for (int num : nums) {
            if (even(num)) {
                count++;
            }
        }
        return count;
    }

    //    Function to check whether a number contains even digits or not
    private static boolean even(int num) {
        int numberOfDigits = digits2(num);
        return numberOfDigits % 2 == 0;
    }

    //    Count number of digits in a number
    private static int digits(int num) {
        if (num < 0) {
            num = num * -1;
        }
        int count = 0;
        while (num > 0) {
            count++;
            num = num / 10;
        }
        return count;
    }

    private static int digits2(int num){
        if (num < 0) {
            num = num * -1;
        }
        return (int)Math.log10(num)+1;
    }
}
