public class AppPractice8 {

    public static void main(String[] args){

        int [] numbers = {10,20,30,40,50};
        int target = 10;
        int count = 0;

        for(int i = 0; i< numbers.length; i++){
            if (numbers[i] == target) {
                count+=i;
                System.out.println("I found");
                break;

            }
        }

        if (count == 0){
            System.out.println("Not found");
        }

        for(int i = 1; i<=6; i++){
            for(int j = 1; j<=6; j++){
                if(i + j == 8)
                    System.out.println(i + " + " + j);
            }
        }
        for(int i = 1; i<=5; i++){
            for(int j = 5; j>=i; j--){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i = 2; i<=30; i++){
            for(int j = 2; j<i; j++){
                if(i % j == 0) {
                    System.out.print(j + " ");
                }
            }
        }

    }
}
