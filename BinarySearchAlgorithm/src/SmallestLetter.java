// leetcode: find-smallest-letter-greater-than-target
public class SmallestLetter {
    public static void main(String[] args) {
        char[] letters = {'c', 'f', 'j'};
        char target = 'd';
        char ans = nextGreatestLetter(letters, target);
        System.out.println(ans);
    }

    private static char nextGreatestLetter(char[] letters, char target) {
        int start = 0;
        int end = letters.length - 1;

        while (start <= end) {
            int middle = start + (end - start) / 2;
            if (target < letters[middle]) {
                end = middle - 1;
            } else {
                start = middle + 1;
            }
        }
        return letters[start % letters.length];
    }
}

