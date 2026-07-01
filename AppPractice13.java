public class AppPractice13 {
    public static void main(String[] args){


        int[] numbs2 = {1,2,3,4,5,6};
        int[] numbs1 = {-2,-1,1,2,3,4,5};//4,1,1,4,9,16,25
                                        // 1,1,4,4,9,16,25

        myPower(numbs1);
        myPower(numbs2);

        mySort(numbs1);
        mySort(numbs2);


        myPrint(numbs1);

        myPrint(numbs2);

    }

    public static void myPrint(int[] numb){
        for(int i = 0; i< numb.length; i++) {
            System.out.print(numb[i] + " ");

        }
        System.out.println();

    }

    public static void myPower(int[] numb){
        for(int i = 0; i<numb.length; i++) {
            numb[i] = numb[i] * numb[i];
        }
    }
    public static void mySort(int[] numb){
        for(int i = 0; i<numb.length; i++) {
            int min = numb[i];
            int minPos = i;
            for(int j = i; j<numb.length; j++) {
                if (numb[j] <= min) {
                    min = numb[j];
                    minPos = j;
                }
            }
            int temp = numb[i];
            numb[i] = min;
            numb[minPos] = temp;
        }

    }
}
