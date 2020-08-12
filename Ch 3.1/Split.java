// 예제 변형
public class Split {
    public static void main(String[] args) {
        String name = args[0];
        In in = new In(name + ".csv");
        String delimiter = ",";

        String firstLine = in.readLine();
        String[] field_name = firstLine.split(delimiter);
        Out[] out = new Out[field_name.length];
        for (int i = 0; i < out.length; i++)
            out[i] = new Out(field_name[i] + ".txt");

        for (int i = 0; i < field_name.length; i++) {
            out[i].println(field_name[i]);
        }

        while (in.hasNextLine()) {
            String line = in.readLine();
            String[] fields = line.split(delimiter);
            for (int i = 0; i < fields.length; i++)
                out[i].println(fields[i]);
        }
    }
}
