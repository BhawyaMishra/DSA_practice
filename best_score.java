public class best_score {

    public static int[] findTopTwoScores(int[] array) {
        int firstHighest = Integer.MIN_VALUE;
        int secondHighest = Integer.MIN_VALUE;

        for (int score : array) {
            if (score > firstHighest) {
                secondHighest = firstHighest;
                firstHighest = score;
            } else if (score > secondHighest && score < firstHighest) {
                secondHighest = score;
            }
        }

        return new int[]{firstHighest, secondHighest};
    }

    public static void main(String[] args) {
        int[] arr = {10, 20, 5, 15};

        int[] result = findTopTwoScores(arr);

        System.out.println("Highest: " + result[0]);
        System.out.println("Second Highest: " + result[1]);
    }
}