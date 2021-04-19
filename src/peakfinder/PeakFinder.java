package peakfinder;

import java.util.Arrays;

/**
 *
 * @author Aysu
 */
public class PeakFinder {
    //Finding global maximum in middle column
    public static int jMax(int[][] arr, int row, int m, int max) {
        for (int i = 0; i < row; i++) {
            if (arr[i][m] > max) {
                max = arr[i][m];
            }
        }
        return max;
    }
    //Index of maximum number
    public static int indexjMax(int[][] arr, int row, int max, int m) {
        int index = 0;
        for (int i = 0; i < row; i++) {
            if (arr[i][m] > max) {
                max = arr[i][m];
                index = i;

            }
        }
        return index;
    }
    //Eliminate half of the array comparing neighbors
    public static int peakFinding(int[][] arr, int row, int col, int m) {
        int max = 0;
        int index = indexjMax(arr, row, max, m);
        max = jMax(arr, row, m, max);

        if (m == col - 1 || m == 0) {
            return max;
        } else if (arr[index][m + 1] > max) {
            return peakFinding(arr, row, col, (int) (m + ((double) (m+1) / 2)));//i try to prevent bound exception

        } else if (arr[index][m - 1] > max) {
            return peakFinding(arr, row, col, (int) (m - ((double) (m+1) / 2)));
        } else {
            return max;
        }

    }

    public static void main(String[] args) {
        int row = 5, col = 5;
        int[][] arr = {{12, 18, 13,14,48}, {21, 22, 35,26,79}, {22, 21, 13,79,15},{14,56,49,78,46},{46,48,49,77,13}};
        int m = (int) (col / 2);

        System.out.println("Peak is " + peakFinding(arr, row, col, m));

    }
}
