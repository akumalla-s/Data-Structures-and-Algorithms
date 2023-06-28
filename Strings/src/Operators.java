import java.sql.Array;
import java.util.ArrayList;

public class Operators {
    public static void main(String[] args) {
        System.out.println('a' + 'b'); // 195
        System.out.println("a" + "b"); // ab
        System.out.println('a' + 3); // 100
        System.out.println((char)('a' + 3)); // d  -> a=97 -> 97+3 = 100

//Note: When an integer is added with string it is converted into a wrapper
//        class
//        int will be converted to Integer that will call toString()
        System.out.println("a"+1); // a1

        System.out.println("srinivas"+new ArrayList<>()); // srinivas[]
        System.out.println("srinivas"+new Integer(56)); // srinivas56

//NOTE: The below expression will give error
        //String ans  = new Integer(56) + new ArrayList<>();
//      But when you add a string in the expression it will convert
//      the ans to String like concatenation will happen
        String ans  = new Integer(56) +""+ new ArrayList<>();
        System.out.println(ans);
    }
}
