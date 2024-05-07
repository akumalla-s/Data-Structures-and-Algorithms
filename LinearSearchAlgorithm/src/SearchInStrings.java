public class SearchInStrings {
    public static void main(String[] args) {
        String name = "Srinivas";
        char target = 'n';
        System.out.println(search(name, target));
    }

    private static boolean search(String str, char target) {
        if (str.isEmpty()) {
            return false;
        }
        for (int i = 0; i < str.length(); i++) {
            if (target == str.charAt(i)) {
                return true;
            }
        }
        return false;
    }

    private static boolean search2(String str, char target) {
        if (str.isEmpty()) {
            return false;
        }
        for (char ch : str.toCharArray()) {
            if (ch == target) {
                return true;
            }
        }
        return false;
    }
}
