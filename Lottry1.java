class Lottry1 {
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

        int res = reward(3);
        System.out.println(res);
    }
}