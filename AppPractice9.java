public class AppPractice9 {

    public static void main(String[] args){

        int [] numbers = {30,20,40,10,50,80,60,70,90,100};
        int target = 20;
        int count = 0;

        for(int i = 0; i<numbers.length; i++){
            if(numbers[i] == target) {
                System.out.println("Found " + numbers[i]);
                count += 1;
                break;
            }
        }
        if(count == 0){
            System.out.println("not found");
        }
        for(int i = 0; i<numbers.length; i++) {
            System.out.print(numbers[i] + " ");

        }
        System.out.println();
        //sort
        int min = numbers[0];
        int minPos = 0;
        for(int j = 0; j <numbers.length; j++){

            //find min
            min = numbers[j];
            minPos = j;
            for(int i = j; i<numbers.length; i++){
                if(min > numbers[i]) {
                    min = numbers[i];
                    minPos = i;
                }
            }
            System.out.print(min + " min ");
            // min = 10

            //Antallagh
            int temp = numbers[j]; //temp ginetai to 30
            numbers[j] = min;// sti prwth thesi vazw to 10
            numbers[minPos] = temp;
            /*System.out.print(temp + " ");
            System.out.print(numbers[j]+ " ");
            System.out.print(numbers[minPos] + " ");
            System.out.println();*/
            for(int i = 0; i<numbers.length; i++) {
                System.out.print(numbers[i] + " ");
            }
            System.out.println();
        }




    }
}
