public class AppPractice5 {

    public static void main(String[] args){

        int[] numbers = new int[10];

        for(int i = 0; i<10; i++){
            numbers[i] = i+1;
            System.out.print(numbers[i] + " ");
        }
        System.out.println();

        int [] numbers2 = new int[20];

        for(int i = 0; i<numbers.length; i++){
            numbers2[i] = numbers[i];
        }
        for(int i = 10; i<numbers2.length; i++){
            numbers2[i] = numbers[i-10] + numbers[i-10];
        }
        for(int i = 0; i<numbers2.length; i++) {
            System.out.print(numbers2[i] + " ");
        }
        System.out.println();

        int [] numbers3 = new int[10];

        for(int i = 0; i < numbers3.length; i++) {
            numbers3[i] = numbers2[i] * numbers2[19 - i];
        }
        for(int i = 0; i<numbers3.length; i++) {
            System.out.print(numbers3[i] + " ");
        }
        System.out.println();

        int[] numbers4 = {10,20,30,40,3};

        for(int i = 0; i < numbers4.length; i++) {
            if (numbers4[i] % 2 == 0 && numbers[i] % 3 == 0) {
                System.out.println("23");
            }
            else if (numbers4[i] % 2 == 0) {
                System.out.println("2");
            } else if (numbers4[i] % 3 == 0) {
                System.out.println("3");
            }

        }

    }
}
