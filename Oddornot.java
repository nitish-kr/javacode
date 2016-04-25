/*
    *
    *Nitish Kumar Ojha
    *IGNOU (BCA)
    *
 */
class Oddornot {
    public static boolean isOdd(int num) {
        if (num % 2 == 0)
            return false;
        else
            return true;
    }
    public static void main(String arg[]) {

        boolean res = isOdd(5);
        System.out.println(res);
    }
}