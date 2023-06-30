public class JavaTPoint {
    public static void main(String[] args) {
//        javaString();
//        immutableString();
//        compareString();
//        concatenateString();
//        subString();
//        stringBufferExample();
        stringBuilderExample();

    }

    private static void stringBuilderExample() {
//        String Builder is mutable
//        String builder is same as String Buffer except that it is
//        non-synchronized
        StringBuilder builder = new StringBuilder("Hello");
        builder.append(" Java");
        System.out.println(builder);

    }

    private static void stringBufferExample() {
//        String Buffer is mutable and thread safe
        StringBuffer stringBuffer = new StringBuffer("Hello ");
        stringBuffer.append("Java");
        System.out.println(stringBuffer);
    }

    private static void subString(){
        String s = "hello";
//        substring method can accept start Index and also both
//        start index and end Index
//        strat index: inclusive
//        end index: exclusive
        System.out.println(s.substring(3));
        System.out.println(s.substring(0,2));
    }

    private static void concatenateString() {
//        Combination of multiple Strings
//        1. By + operator
//        2. By concat() method

        String s = "Srinivasa " + "Reddy";
        System.out.println(s);// Srinivasa Reddy
//        The Java compiler transforms above code to this:
//        String s1 = (new StringBuilder().append("Srinivasa ").append("Reddy")).toString();

        System.out.println("Using concat() method: ");
        String s1 = "Srinivas ";
        String s2 = "Reddy";
        String s3 = s1.concat(s2);
        System.out.println(s3);
    }

    private static void compareString() {
//        == -> used for reference matching
//        equals() method -> used for content matching
//        compareTo() method -> used for sorting

        String s1 = "Sachin";
        String s2 = "Sachin";
        System.out.println(s1 == s2); // true

//        reference of s1 does not match with s3
        String s3 = new String("Sachin");
        System.out.println(s1 == s3); // false

        String s4 = new String("Sachin");
        System.out.println(s3 == s4); // false

        System.out.println("Using equals() method");
        System.out.println(s1.equals(s2)); // true
        System.out.println(s1.equals(s3)); // true
        System.out.println(s3.equals(s4)); // true

        System.out.println("compareTo() method");
        String name1 = "Srinivas";
        String name2 = "Ramesh";
        String name3 = "Srinivas";
        System.out.println(name1.compareTo(name2)); // 1 because name1> name2
        System.out.println(name2.compareTo(name1)); // -1 because name2 < name1
        System.out.println(name1.compareTo(name3)); // 0

    }

    private static void immutableString() {
        String s = "Sachin";
        s.concat("Tendulkar");
//        It will print Sachin only because Strings are immutable in Java
        System.out.println(s);

//         if we explicitly assign it to the reference variable, it will refer to "Sachin Tendulkar" object.
        s = s.concat(" Tendulkar");
        System.out.println(s);
    }

    private static void javaString() {
//        String is a sequence of char values
        char[] ch = {'j', 'a', 'v', 'a', 't', 'p', 'o', 'i', 'n', 't'};
        String s = new String(ch);
        System.out.println(s);

//        is same as:
        String s2 = "javatpoint";
    }
}
