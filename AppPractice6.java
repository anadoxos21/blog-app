public class AppPractice6 {

    public static void main(String[] args){

        String s = "a string";
        String a = "This is a string";

        System.out.println(s + "(" + s.hashCode() + ")");
        s = "another string";
        System.out.println(s + "(" + s.hashCode() + ")");
        s = s + " some more";
        System.out.println(s + "(" + s.hashCode() + ")");

        System.out.println(a.charAt(2));
        char[] ext = new char[10];
        a.getChars(5,7,ext,0);
        System.out.println("result " + ext);
        System.out.println(ext);
        ext = a.toCharArray();
        System.out.println(ext);

        String t = String.valueOf(5);
        String t2 = String.valueOf(true);
        System.out.println(t + " " + t2);

        String w  = "test";
        System.out.println(w.equals("test"));
        System.out.println(w.compareTo("abc"));
        System.out.println(w.compareTo("test"));
        System.out.println(w.compareTo("zxy"));
        System.out.println("ABC".compareTo("abc"));
        System.out.println("ABC".compareToIgnoreCase("abc"));



    }
}
