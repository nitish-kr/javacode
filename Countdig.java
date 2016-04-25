/*
    *
    *Nitish Kumar Ojha
    *IGNOU (BCA)
    *
 */
class Countdig {
    public static int countdig(int num) {
        int temp, count = 0;
        while (num > 0) {
            temp = num % 10;
            count++;
            num = num / 10;
        }
        return count;
    }
    public static void main(String arg[]) {

        int res = countdig(521);
        System.out.println(res);
    }
}