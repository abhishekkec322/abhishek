package prep_2019;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class ArrayManipulationWithScanner {

    // Complete the arrayManipulation function below.
    static long arrayManipulation(int n, int[][] queries) {

long arr[] = new long[n];

    // each successive element contains the difference between itself and previous element

    for (int i = 0; i < queries.length; i++) {
    // when checking query, subtract 1 from both a and b since 0 indexed array
    int a = queries[i][0] - 1;
    int b = queries[i][1] - 1;
    int k = queries[i][2];

    arr[a] += k;
    if (b+1 < n) {
    arr[b+1] -= k;  
    }
    }

    // highest value seen so far as we go
    long maxValue = Long.MIN_VALUE;
    for (int i = 1; i < arr.length; i++) {
    arr[i] += arr[i-1];
    maxValue = Math.max(arr[i], maxValue);
    }

    return maxValue;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("../abhishek/Output/Output.txt"));

        String[] nm = scanner.nextLine().split(" ");

        int n = Integer.parseInt(nm[0]);

        int m = Integer.parseInt(nm[1]);

        int[][] queries = new int[m][3];

        for (int i = 0; i < m; i++) {
            String[] queriesRowItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int j = 0; j < 3; j++) {
                int queriesItem = Integer.parseInt(queriesRowItems[j]);
                queries[i][j] = queriesItem;
            }
        }

        long result = arrayManipulation(n, queries);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}

