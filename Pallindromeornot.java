class Pallindromeornot {
    public static boolean isPallindrome(int num) {
        int temp, rev = 0;
        int n = num;
        while (num > 0) {
            temp = num % 10;
            rev = (rev * 10) + temp;
            num = num / 10;
        }
        if (n == rev)
            return true;
        else
            return false;
    }
    public static void main(String arg[]) {

        boolean res = isPallindrome(521);
        System.out.println(res);
    }
}