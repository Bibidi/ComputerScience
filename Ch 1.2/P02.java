public class P02 {
    public static void main(String[] args) {
        double theta = Double.parseDouble(args[0]);
        double result = Math.sin(theta) * Math.sin(theta) + Math.cos(theta) * Math.cos(theta);
        System.out.println(result);
    }
}
