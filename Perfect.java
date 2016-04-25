/*
    *
    *Nitish Kumar Ojha
    *IGNOU (BCA)
    *
 */
class Perfect {
    public static boolean perfect(int num) {
        int temp = 0;
        for (int i = 1; i <= num / 2; i++) {
            if (num % i == 0) {
                temp += i;
            }
        }
        if (temp == num)

            return true;
        else
            return false;
    }
    public static void main(String arg[]) {

        boolean res = perfect(6);
        System.out.println(res);
    }
}