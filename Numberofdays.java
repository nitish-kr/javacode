class Numberofdays {
    public static int numberofdays(int num) {
        if (num == 1)
            return 31;
        else if (num == 2)
            return 29;
        else if (num == 3)
            return 31;
        else if (num == 4)
            return 30;
        else if (num == 5)
            return 31;
        else if (num == 6)
            return 30;
        else if (num == 7)
            return 31;
        else if (num == 8)
            return 31;
        else if (num == 9)
            return 30;
        else if (num == 10)
            return 31;
        else if (num == 11)
            return 30;
        else
            return 31;

    }
    public static void main(String arg[]) {

        int res = numberofdays(3);
        System.out.println(res);
    }
}