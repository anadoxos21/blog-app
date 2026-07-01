public class AppPractice10 {
    public static void main(String[] args){

        int[] numbers =  new int[10];

        for(int i = 0 ; i<10; i++){
            numbers[i] = i+1;
        }
        for(int i = 0 ; i<10; i++){
            System.out.print(numbers[i] + " ");
        }
        System.out.println();
        /*
        for(int i = 0 ; i<5; i++){
            int temp = numbers[i];
            numbers[i] = numbers[9-i];
            numbers[9-i] = temp;
        }
        for(int i = 0 ; i<10; i++){
            System.out.print(numbers[i] + " ");
        }*/
        //binary search
        int target = 22;
        int low = 0;
        int high = numbers.length -1;
        int counter = 0;


        while(low<=high) {

            int mid = (high + low) / 2;
            //System.out.println("mid " + mid);


            if (numbers[mid] == target) {
                System.out.println("found");
                counter++;
                break;

            } else if (numbers[mid] > target) {
                high = mid - 1;
               // System.out.println("high " + high);

            } else if (numbers[mid] < target) {
                low = mid + 1;
               // System.out.println("low " + low);

            }
        }
        if(counter == 0){
            System.out.println("not found");
        }




    }
}
