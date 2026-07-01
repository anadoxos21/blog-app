public class AppPractise
{
    public static void main(String[] args) {
        int[] grades = {7, 10, 6, 8, 5};
        for (int i = 0; i < grades.length; i++) {
            System.out.print(grades[i] + " ");
        }

        int[] numbers = new int[20];
        for(int i = 0; i < 20; i++){
            numbers[i] = i+1;
            //i = 0 k = 1
            //i = 1 k = 2
        }
        System.out.println();
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
        int[] r = new int[20];
        for(int j = 19; j >= 0; j--){
            r[19-j] = numbers[j];
            //r[0] = 20
            //r[1] = 19
        }
        System.out.println();
        for (int i = 0; i < r.length; i++) {
            System.out.print(r[i] + " ");
        }
    }

}
