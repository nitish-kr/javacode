class Sum2digit {
    public static int sumdigits(int num) {
        int temp, sum = 0;
        while (num > 0) {
            temp = num % 10;
            sum = sum + temp;;
            num = num / 10;
        }
        return sum;
    }
    public static void main(String arg[]) {

        int res = sumdigits(52);
        System.out.println(res);
    }
}