public class Problem {

    public static void main(String[] args) {
        System.out.println("Hello World");
    }

    public static String numMovesStones(int a, int b, int c) {
        if (a == b || b == c || c == a) {
            return "Invalid";
        }
        if (a > 100 || a < 1 || b > 100 || b < 1 || c > 100 || c < 1) {
            return "Invalid";
        }
        int max = Math.max(Math.max(a, b), c);
        int min = Math.min(Math.min(a, b), c);
        int mid = a + b + c - max - min;
        int[] answer = new int[2];
        answer[1] = max - min - 2;
        if (max - mid == 1 && mid - min == 1) {
        } else if (max - mid <= 2 || mid - min <= 2) {
            answer[0] = 1;
        } else {
            answer[0] = 2;
        }

        return answer[0] + " " + answer[1];
    }
}
