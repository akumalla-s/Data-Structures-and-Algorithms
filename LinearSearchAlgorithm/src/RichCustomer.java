public class RichCustomer {
    public static void main(String[] args) {
        int[][] accounts = {
                {1, 5},
                {7, 3},
                {3, 5}
        };
        System.out.println(maximumWealth(accounts));
    }

    private static int maximumWealth(int[][] accounts) {
        int maxSum = 0;
        for (int person = 0; person < accounts.length; person++) {
//            When you start a new col take a sum for that row
            int accountSum = 0;
            for (int account = 0; account < accounts[person].length; account++) {
                accountSum = accountSum + accounts[person][account];
            }
            if (maxSum < accountSum) {
                maxSum = accountSum;
            }
        }
        return maxSum  ;
    }
}
