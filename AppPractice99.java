public class AppPractice99 {

    public static void main(String[] args){

        int[] numbs1 = {50,90,20,40,70,10,80,};
        int min = numbs1[0];
        int minPos = 0;

        for(int i = 1; i< numbs1.length; i++){
            if(numbs1[i] < min){
                min = numbs1[i];
                minPos = i;

            }

        }
        for(int i = 0; i< numbs1.length; i++){
                System.out.print(numbs1[i]);


    }
}
