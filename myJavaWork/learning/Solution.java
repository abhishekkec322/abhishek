package learning;

import java.util.Arrays;
import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int numberOfSheets = scan.nextInt();
		for (int i = 0; i < numberOfSheets; i++) {
			int height = scan.nextInt();
			int width = scan.nextInt();
			int numberOfDots = scan.nextInt();
			PaintedDot[] PaintedDotarray= new PaintedDot[numberOfDots];

			for (int j = 0; j < numberOfDots; j++) {

				int x = scan.nextInt();
				int y = scan.nextInt();
				int darkness = scan.nextInt();
				
				PaintedDot paintedDot= new PaintedDot(x,y,darkness);
				PaintedDotarray[j]=paintedDot;
				
			}
			System.out.println(solve(height,width,PaintedDotarray));
						
		}

	}

    public static int solve(int height, int width, PaintedDot[] paintedDots) {
        int[][] paper = new int[height][width];
        for (int i = 0; i < paintedDots.length; i++) {
            for (int pRowCounter = 0; pRowCounter < height; pRowCounter++) {
                for (int pColCounter = 0; pColCounter < width; pColCounter++) {
                    int newDarkness = paintedDots[i].darkness - Math.abs(paintedDots[i].row - pRowCounter) - Math.abs(paintedDots[i].col - pColCounter);
                    if (newDarkness > paper[pRowCounter][pColCounter])
                        paper[pRowCounter][pColCounter] = newDarkness;
                }
            }
        }
        
        int sumOfDarkness = 0;
        for (int[] rowPaper : paper) {
            System.out.println(Arrays.toString(rowPaper));
            for (int colPaper : rowPaper) {
                sumOfDarkness += colPaper;
            }
        }
        return sumOfDarkness;
    }

}

class PaintedDot {
	int row;
	int col;
	int darkness;

	public PaintedDot(int r, int c, int d) {
		row = r;
		col = c;
		darkness = d;
	}
}
