public class AppPractice15 {
    public static void main(String[] args) {

        int[] numbs = {1, 2, 3, 4, 5};
        int[] numbs2 = {1, 2, 6, 7};
        int[] numbs3 = new int[9];
        int pos = 0;
        int pos2 = 0;
        int i = 0;

        while(pos<numbs.length || pos2<numbs2.length){
            if(pos == numbs.length){
                numbs3[i] = numbs2[pos2];
                pos2++;
                i++;
            }
            else if(pos2 == numbs2.length){
                numbs3[i] = numbs[pos];
                pos++;
                i++;
            }

            else if(numbs[pos] <= numbs2[pos2]){
                numbs3[i] = numbs[pos];
                pos++;
                i++;
            }
            else if(numbs[pos] > numbs2[pos2]){
                numbs3[i] = numbs2[pos2];
                pos2++;
                i++;
            }

        }
        myPrint(numbs3);







    }
    public static void myPrint(int[] numb){
        for(int i = 0; i< numb.length; i++) {
            System.out.print(numb[i] + " ");

        }
        System.out.println();

    }
}

