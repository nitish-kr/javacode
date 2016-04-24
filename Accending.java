class Accending {
    public static boolean larger(int num, int num1, int num2) {
        return (num < num1 && num1 < num2)  ? true : false;

    }
    public static void main(String arg[]) {

        boolean res = larger(5, 2, 8);
        System.out.println(res);
    }
}