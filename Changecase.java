/*
	*
	*Nitish Kumar Ojha
	*IGNOU (BCA)
	*
 */
class Changecase {
    public static char changecase(char ch) {
        char ch2;
        ch2 = Character.toUpperCase(ch);
        return ch2;
    }
    public static void main(String arg[]) {

        char res = changecase('a');
        System.out.println(res);
    }
}