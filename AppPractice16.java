public class AppPractice16 {
    public static void main(String[] args) {
        
        int[] numbs = {1,1,1,2,2,3,4,5,5};

        myPrint(numbs);

        myPrint2(numbs);

        myPrint3(numbs, 2);

        int counter = count(numbs);
        if(counter > 2){
            System.out.print("Found more");
        }
        else{
            System.out.print("Not found");
        }
        System.out.println();

        int a = 10;
        int b = 20;
        int m = min(a, b);



    }

    private static int min(int a, int b) {
        int min = a;
        if(a < b){
            min = a;
        }
        else{
            min = b;
        }
        System.out.print(min);
        return min;
    }

    private static int count(int[] numbs) {
        boolean isSame = false;
        int counter = 0;
        for(int i = 0; i< numbs.length -1; i++){
            if(numbs[i]== numbs[i+1] && isSame == false){
                counter++;
                isSame = true;

            }
            else if(numbs[i]!= numbs[i+1]){
                isSame = false;
            }

        }
        System.out.print(counter);
        System.out.println();
        return counter;

    }

    private static void myPrint3(int[] numbs, int target) {
        int counter = 0;
        for(int i = 0; i< numbs.length-1; i++){
            if(numbs[i]== target && counter == 0){
                counter++;
                System.out.print(target + " ");
            }
            else if(numbs[i]!= target){
                System.out.print(numbs[i]+ " ");
            }

        }
        System.out.print(numbs[numbs.length -1]);
        System.out.println();
    }


    private static void myPrint2(int[] numbs) {
        for(int i = 0; i< numbs.length-1; i++){
            if(numbs[i]!= numbs[i+1]) {
                System.out.print(numbs[i] + " ");

            }

        }
        System.out.print(numbs[numbs.length -1]);

        System.out.println();
    }

    private static void myPrint(int[] nums) {
        for(int i = 0; i< nums.length; i++){
            System.out.print(nums[i] + " ");
        }
        System.out.println();
    }
}
