public class AppPractice12 {
    public static void main(String[] args){

       int[] numbs = {90,30,20,40,50,60,70,10,100,80};

        //SELECTION SORT// Vazeis to elaxisto panta sthn arxh
       for(int i = 0; i<numbs.length; i++){
           int min = numbs[i];
           int minPos = i;
           for(int j = i; j<numbs.length; j++){
               if(numbs[j]< min) {
                   min = numbs[j];
                   minPos = j;
               }
           }
           int temp = numbs[i];
           numbs[i] = min;
           numbs[minPos] = temp;
       }
       for(int i = 0; i< numbs.length; i++){
            System.out.print(numbs[i] + " ");
            }
    }
}
