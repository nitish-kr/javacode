/*
    *
    *Nitish Kumar Ojha
    *IGNOU (BCA)
    *
 */
class Reverse {
    public static int reverse(int num) {
        int temp, rev = 0;
        while (num > 0) {
            temp = num % 10;
            rev = (rev * 10) + temp;
            num = num / 10;
        }
        return rev;
    }
    public static void main(String arg[]) {

        int res = reverse(521);
        System.out.println(res);
    }
}