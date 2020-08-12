public class P17 {
    public static void main(String[] args) {
        int a = 1;
        a = a + a;
        a = a + a;
        a = a + a;

        boolean b = true;
        b = !b;
        b = !b;
        b = !b;

        int c = 2;
        c = c * c;
        c = c * c;
        c = c * c;

        System.out.println(a + " " + b + " " + c);
    }
}
