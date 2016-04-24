class Divisible6 {
    public static boolean isdivby6(int num) {
        if (num % 6 == 0)
            return true;
        else
            return false;
    }
    public static void main(String arg[]) {

        boolean res = isdivby6(5);
        System.out.println(res);
    }
}