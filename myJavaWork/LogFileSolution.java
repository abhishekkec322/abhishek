import java.util.Arrays;
import java.util.Comparator;


public class LogFileSolution {

    public static void main(String[] args) {

        final String[][] data = new String[][] {
                new String[] {"a1","9", "2", "3", "1"},
                new String[] {"g1","Act","car"},
                new String[] {"z04","4", "7"},
                new String[] {"ab1","off","KEY","dog"},
                new String[] {"a8","act", "zoo"}
                };

        Arrays.sort(data, new Comparator<String[]>() {
            @Override
            public int compare(final String[] entry1, final String[] entry2) {
                final String time1 = entry1[0];
                final String time2 = entry2[0];
                return time1.compareTo(time2);
            }
        });

        for (final String[] s : data) {
            System.out.println(s[0] + " " + s[1]);
        }

    }

}