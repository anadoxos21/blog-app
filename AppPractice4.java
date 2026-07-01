public class AppPractice4 {

    public static void main(String[] args) {

        int[] temps = {22, 25, 19, 24, 21};
        int sum = 0;

        for (int i = 0; i < temps.length; i++) {
            sum += temps[i];
        }
        System.out.print(sum + " ");

        int average = sum / temps.length;
        System.out.println(average);

        int[] scores = {45, 78, 92, 34, 88, 12};
        int max = scores[0];

        for (int j = 0; j < scores.length; j++) {
            if (scores[j] > max) {
                max = scores[j];
            }

        }
        System.out.println(max);

        int[] ids = {105, 204, 399, 412, 590};

        for (int m = 0; m < ids.length; m++) {
            if (ids[m] == 399) {
                System.out.println("Found! The position is " + m);
                break;
            }
        }

        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5; j++) {
                System.out.print(i * j + " ");
            }
            System.out.println();
        }
        int[] numbers = {4, 2, 7, 2, 8, 4, 9};

        for (int i = 0; i < numbers.length; i++) {
            for (int j = i+1; j < numbers.length; j++) {
                if(numbers[i] == numbers[j]) {
                    System.out.print("to " + numbers[i] + " einai diplo");
                }
            }
            System.out.println();
        }


    }





}
