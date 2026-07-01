public class AppPractice7 {

    public static void main(String[] args){

        int [] numbers = new int[10];

        for(int i = 9; i>=0; i--){
            numbers[i] = i+1;
            System.out.print(numbers[i] + " ");

        }
        System.out.println();
        for(int i = 0; i<10; i++){
            System.out.print(numbers[i] + " ");

        }

        for(int i = 0; i<10; i++){
            int n = numbers[i];
            numbers[i] = numbers[9-i];
            numbers[9-i] = n;

        }
        System.out.println();
        for(int i = 0; i<10; i++){
            System.out.print(numbers[i] + " ");

        }


    }
}
