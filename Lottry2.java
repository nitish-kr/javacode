/*
    *
    *Nitish Kumar Ojha
    *IGNOU (BCA)
    *
 */
class Lottry2 {
    public static int reward(int num) {
        if (num % 4 == 0 && num % 7 == 0)
            return 10;
        else if (num % 4 == 0)
            return 6;
        else if (num % 7 == 0)
            return 20;
        else
            return 0;


    }
    public static void main(String arg[]) {

        int res1 = reward(3);
        int res2 = reward(7);
        int res3 = reward(28);
        System.out.println(res1 + res2 + res3);
    }
}
