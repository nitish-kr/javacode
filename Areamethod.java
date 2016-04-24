class Areamethod {
    public static double calculate_area(double radius) {
        double area = 3.141 * radius * radius;
        return area;
    }
    public static void main(String arg[]) {
        double res = calculate_area(7);
        System.out.println(res);

    }
}