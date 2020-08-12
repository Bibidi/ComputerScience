public class P12 {
    public static void main(String[] args) {
        System.out.println("log n \tn \t\tn log n \tn^2 \t\t\tn^3");
        for (long i = 16; i <= 2048; i *= 2) {
            System.out.print((int) (Math.log10(i)));
            System.out.print("\t\t");
            System.out.print(i);
            System.out.print("\t\t");
            System.out.print((int) (i * Math.log(i)));
            System.out.print("\t\t\t");
            System.out.print(i * i);
            System.out.print("\t\t\t\t");
            System.out.println(i * i * i);
        }
    }
}
