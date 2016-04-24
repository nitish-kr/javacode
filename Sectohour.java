class Sectohour {
    public static void main(String arg[]) {
        double result = toHours(5400);
        System.out.println(result);
    }

    public static double toHours(double sec) {
        return (sec / 3600);
    }
}