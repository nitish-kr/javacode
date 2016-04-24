class Numberat100 {
    public static int numberat100(int num) {
        int temp, count = 0;
        while (num > 0) {
            temp = num % 10;
            count++;
            if (count == 3)
                return temp;
            num = num / 10;
        }
        return count;
    }
    public static void main(String arg[]) {

        int res = numberat100(521);
        System.out.println(res);
    }
}