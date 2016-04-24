class Speed {
    public static double calculate_speed(int time, int distance) {
        double speed = distance / time;
        return speed;
    }
    public static void main(String arg[]) {
        double res = calculate_speed(2, 60);
        System.out.println(res);

    }
}