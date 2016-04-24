class Addforthird {
    public static boolean addforthird(int num, int num1, int num2) {
        if (num1 + num2 == num)
            return true;
        else if (num + num1 == num2)
            return true;
        else if (num + num2 == num1)
            return true;
        else
            return false;
    }
    public static void main(String arg[]) {

        boolean res = addforthird(5, 3, 8);
        System.out.println(res);
    }
}