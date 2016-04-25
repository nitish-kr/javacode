/*
    *
    *Nitish Kumar Ojha
    *IGNOU (BCA)
    *
 */
class Largest {
    public static int larger(int num, int num1, int num2) {
        if (num > num1 && num > num2)
            return num;
        else if (num1 > num && num1 > num2)
            return num1;
        else
            return num2;

    }
    public static void main(String arg[]) {

        int res = larger(5, 2, 8);
        System.out.println(res);
    }
}