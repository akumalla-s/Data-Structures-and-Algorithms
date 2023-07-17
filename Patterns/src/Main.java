public class Main {
    public static void main(String[] args) {
        pattern5(5);
    }

    private static void pattern5(int num){
        for (int row = 1; row <= 2* num - 1; row++) {
            //for every row, run the col
            int totalColsInRow = row>num ? (2*num-row): row;

            for (int col = 1; col <= totalColsInRow; col++) {
                System.out.print("* ");
            }
            //when one row is printed, we need to add a newline
            System.out.println();
        }
    }

    private static void pattern4(int num){
        for (int row = 1; row <= num; row++) {
            //for every row, run the col
            for (int col = 1; col <= row ; col++) {
                System.out.print(col+" ");
            }
            //when one row is printed, we need to add a newline
            System.out.println();
        }
    }

    private static void pattern3(int num){
        for (int row = 1; row <= num; row++) {
            //for every row, run the col
            for (int col = 1; col <= num-row+1 ; col++) {
                System.out.print("* ");
            }
            //when one row is printed, we need to add a newline
            System.out.println();
        }
    }

    private static void pattern2(int num){
        for (int row = 1; row <= num; row++) {
            //for every row, run the col
            for (int col = 1; col <= row ; col++) {
                System.out.print("* ");
            }
            //when one row is printed, we need to add a newline
            System.out.println();
        }
    }
}