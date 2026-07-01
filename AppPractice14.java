public class AppPractice14 {
    public static void main(String[] args){

        int[] numbs = {1,2,3,4,5};
        int[] numbs2 = {1,2,6,7};
        int[] numbs3 = new int[9];

        myUnion(numbs2,numbs,numbs3);
        mySort(numbs3);
        myPrint(numbs3);



    }
    public static void myPrint(int[] numb){
        for(int i = 0; i< numb.length; i++) {
            System.out.print(numb[i] + " ");

        }
        System.out.println();

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
    public static void myUnion(int[] numbs,int[] numbs2,int[]numbs3){
        for(int i = 0; i<numbs.length; i++){
            numbs3[i] = numbs[i];
        }
        for(int i = numbs.length; i<numbs3.length; i++){
            numbs3[i] = numbs2[i-numbs.length];

        }
    }
}
