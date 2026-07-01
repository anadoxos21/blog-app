public class AppPractice2 {

    public static void main(String[] args) {

        int[] numbers = {1,2,-5,-6};
        int negatives = 0;

        for(int i = 0; i < numbers.length; i++) {
            if (numbers[i] < 0) {
                System.out.println("Found " + numbers[i]);
                negatives += 1;
                break;
            }
        }

        if(negatives == 0){
            System.out.println("Not found");
        }

    }


}


