import java.util.Arrays;

public class AppPractice19 {
    public static void main(String[] args) {

        int [] numbers = {30,20,40,10,50,80,60,70,90,100};

        int min = numbers[0];
        int minPos = 0;


        for(int j = 0; j <numbers.length; j++) {

            //find min
            min = numbers[j];
            minPos = j;
            for (int i = j; i < numbers.length; i++) {
                if (min > numbers[i]) {
                    min = numbers[i];
                    minPos = i;
                }
            }
            //System.out.print(min + " min ");
        }
        System.out.print(min + " min ");

    }
}
