public class AppPractice3 {

    public static void main(String[] args) {

        int[] numbers = new int[10];

        for(int i = 0; i <10;  i++){
            numbers[i] = i+1;
            System.out.print(numbers[i] + " ");
        }
        System.out.println();

        int[] numbers2 = new int[10];

        for(int i = 0; i< numbers2.length; i++){
            numbers2[i] = (i +1)*10;//
            System.out.print(numbers2[i]+ " ");
        }

        System.out.println();

        int[] numbers3 = new int[10];

        for(int i = 10; i<=100; i+=10){
            int pos = i/10 -1 ;

            numbers3[pos] = i;//
            System.out.print(numbers3[pos]+ " ");
        }

        System.out.println();

        int[] numbers4 = new int[10];
        int i = 0;

        while(i<numbers4.length){
            numbers4[i] = i+1;
            System.out.print(numbers4[i] + " ");
            i++;
        }
        System.out.println();

        int[] numbers5 = new int[20];
        int j = 0;

        while(j<=19){
            numbers5[j] = j+1;
            System.out.print(numbers5[j] + " ");
            j++;
        }


    }


}
