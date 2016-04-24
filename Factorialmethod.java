class Factorialmethod {
    public static int Factorialmethod(int num) {
        int fact = 1, i;
        for (i = num; i >= 1; i--)
            fact = fact * i;
        return fact;
    }
    public static void main(String arg[]) {
        int res = Factorialmethod(5);
        System.out.println(res);

    }
}