class Sumof4digit {
    public static void main(String arg[]) {
        int result = calculateSum(12345);
        System.out.println(result);
    }

    public static int calculateSum(int num) {

        return (num % 10) + (num % 100) / 10 + (num % 1000) / 100 + (num % 10000) / 1000;


    }
}