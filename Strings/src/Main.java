public class Main {
    public static void main(String[] args) {
        String a = "Srinivas";
        String b = "Srinivas";
        System.out.println("a -> "+ a +"  "+ a.hashCode());
        System.out.println("b -> "+ b +"  "+ b.hashCode());
        a = "reddy";
        System.out.println("a -> "+ a +"  "+ a.hashCode());
        System.out.println("b -> "+ b +"  "+ b.hashCode());

    }
}