public class AppPractice18 {
    public static void main(String[] args) {

        int[] coins = {1,2,5};
        int k = coinChange(coins,11);

        System.out.println(k);

    }
    public static int coinChange(int[] coins, int amount) {
        int sum = 0;
        int m = coins[coins.length -1];
        int posLast = coins.length -1;
        int counter = 0;

        while(sum<amount){
            sum += m;
            counter++;

            if(sum>amount){
                counter--;
                sum -=m;
                posLast--;
                m = coins[posLast];

            }


        }

        return counter;
    }






}
