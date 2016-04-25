/*
	*
	*Nitish Kumar Ojha
	*IGNOU (BCA)
	*
 */
class Match {
    public static void main(String arg[]) {
        double result = runrateRequired(326, 49, 210, 33);
        System.out.println(result);
    }
    public static double runrateRequired(int target, int maxOver, int currentScore, int oversBowled) {
        double remainingOvers = maxOver - oversBowled;
        double remainingRuns = target - currentScore;
        return (remainingRuns / remainingOvers);
    }
}