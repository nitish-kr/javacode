class Evenornot {
    public static boolean isEven(int num) {
        if (num % 2 == 0)
            return true;
        else
            return false;
    }
    public static void main(String arg[]) {

        boolean res = isEven(5);
        System.out.println(res);
    }
}