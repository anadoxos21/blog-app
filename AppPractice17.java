public class AppPractice17 {
    public static void main(String[] args) {

        int[] original = {1, 5, 10};
        int[] m = doubleValues(original);
        System.out.print(m);

    }

    private static int[] doubleValues(int[] original) {
        int[] doubled = new int[original.length];


        for (int i = 0; i < original.length; i++) {
            doubled[i] = original[i] * 2;

        }
        return doubled;
    }
}