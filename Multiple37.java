/*
    *
    *Nitish Kumar Ojha
    *IGNOU (BCA)
    *
 */
class Multiple37 {
    public static boolean isdivby3or7(int num) {
        if (num % 7 == 0 || num % 3 == 0)
            return true;
        else
            return false;
    }
    public static void main(String arg[]) {

        boolean res = isdivby3or7(5);
        System.out.println(res);
    }
}