public class Huntingtons {
    // Returns the maximum number of consecutive repeats of CAG in the DNA string.
    public static int maxRepeats(String dna) {
        int max = 0;
        int cnt = 0;
        int i = 0;
        while (i < dna.length() - 2) {
            if (dna.substring(i, i + 3).equals("CAG")) {
                cnt++;
                max = Math.max(cnt, max);
                i += 3;
            }
            else {
                cnt = 0;
                i++;
            }
        }
        return max;
    }

    // Returns a copy of s, with all whitespace (spaces, tabs, and newlines) removed.
    public static String removeWhitespace(String s) {
        s = s.replace(" ", "");
        s = s.replace("\n", "");
        s = s.replace("\t", "");
        return s;
    }

    // Returns one of these diagnoses corresponding to the maximum number of repeats:
    // "not human", "normal", "high risk", or "Huntington's".
    public static String diagnose(int maxRepeats) {
        String ret;
        if (maxRepeats <= 9) ret = "not human";
        else if (maxRepeats <= 35) ret = "normal";
        else if (maxRepeats <= 39) ret = "high risk";
        else if (maxRepeats <= 180) ret = "Huntington's";
        else ret = "not human";
        return ret;
    }

    // Sample client (see below).
    public static void main(String[] args) {
        String filename = args[0];
        In in = new In(filename);
        String dna = in.readAll();
        dna = removeWhitespace(dna);
        
        int cnt = maxRepeats(dna);
        StdOut.println("max repeats = " + cnt);
        StdOut.println(diagnose(cnt));
    }
}
