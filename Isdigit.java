class Isdigit {
    public static boolean isdigit(int num) {
        if (num >= 0 && num <= 9)
            return true;
        else
            return false;
    }
    public static void main(String arg[]) {
        boolean res = isdigit(9);
        System.out.println(res);
    }
}