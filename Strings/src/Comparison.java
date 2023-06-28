public class Comparison {
    public static void main(String[] args) {
        String a = "Srinivas";
        String b = "Srinivas";
        String c = a;

        // ==
//        System.out.println(a == b); // true
//        System.out.println(c == a); // true


        String name1 = new String("Srinivas");
        String name2 = new String("Srinivas");

//        System.out.println(name1 == name2); // false

//        To check the values we need to use equals
//        System.out.println(name1.equals(name2)); // true
//        System.out.println(c.equals(a)); // true
    }
}
