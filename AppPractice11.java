public class AppPractice11 {

     public static void main(String[] args){

         int[][] grades = {{85, 90, 78, 92},{76, 88, 80, 85},{95, 92, 89, 98}};
         int max = grades[0][0];

          for(int[]row :grades){
            for(int elem :row){
                System.out.print(elem + " ");

            }
            System.out.println();
          }
          for(int[]row :grades) {
              for (int elem : row) {
                  if (elem > max) {
                      max = elem;

                  }


              }

          }  System.out.print(max);
    }
}
