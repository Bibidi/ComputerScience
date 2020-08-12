public class P33 {
    public static void main(String[] args) {
        // There is an error in the code. But I have no idea what to do
        double x1 = Math.toRadians(Double.parseDouble(args[0]));
        double y1 = Math.toRadians(Double.parseDouble(args[1]));
        double x2 = Math.toRadians(Double.parseDouble(args[2]));
        double y2 = Math.toRadians(Double.parseDouble(args[3]));

        double d = 60 * Math.acos(Math.sin(x1) * Math.sin(x2) +
                                          Math.cos(x1) * Math.cos(x2) * Math.cos(y1 - y2));
        System.out.println(d);
    }
}
