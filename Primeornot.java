/*
    *
    *Nitish Kumar Ojha
    *IGNOU (BCA)
    *
 */
class Primeornot {
    public static boolean isPrime(int num) {
        int i, count = 0;
        for (i = 1; i <= num / 2; i++)
            if (num % 2 == 0)
                count++;
        if (count > 2)
            return false;
        else
            return true;
    }
    public static void main(String arg[]) {

        boolean res = isPrime(5);
        System.out.println(res);
    }
}