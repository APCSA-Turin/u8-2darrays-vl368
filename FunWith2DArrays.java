public class FunWith2DArrays {
    public static int totalElements(int[][] arr) {
        return arr.length * arr[0].length;
    }

    public static void fourCorners(String[][] arr) {
        int len = arr.length;
        int len2 = arr[0].length;
        System.out.println(arr[0][0]);
        System.out.println(arr[0][len2-1]);
        System.out.println(arr[len-1][0]);
        System.out.println(arr[len-1][len2-1]);
    }

    public static void swapFrontAndBackRows (String[][] arr) {
        String[] temp = arr[0];
        arr[0] = arr[arr.length-1];
        arr[arr.length-1] = temp;
    }

    public static double average(int[][] arr) {
        int sum = 0;
        for (int[] row : arr) {
            for (int element : row) {
                sum += element;
            }
        }
        return (double) sum / (arr.length * arr[0].length);
    }

    public static int edgeSum(int[][] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (i == 0 || i == arr.length - 1) {
                for (int k = 0; k < arr[0].length; k++) {
                    sum += arr[i][k];
                }
            }
            else {
                sum += arr[i][0] + arr[i][arr[i].length-1];
            }
        }
        return sum;
    }

    public static int[] indexFound(String[][] arr, String target) {
        int row = 0;
        int col = 0;
        int[] returnArr = {-1, -1};
        for (int k = 0; k < arr[0].length; k++) {
            for (int i = 0; i < arr.length; i++) {
                if (arr[i][k].equals(target)) {
                    returnArr[0] = i;
                    returnArr[1] = k;
                    return returnArr;
                }
            }
        }
        return returnArr;
    }

    public static int[][] split(int[][] arr, int row, int col) {
        if (row == arr.length) {
            row = -1;
        }
        if (col == arr[0].length) {
            col = -1;
        }
        int[][] returnArr = new int[row+1][col+1];
        for (int i = 0; i <= row; i++) {
            for (int k = 0; k <= col; k++) {
                returnArr[i][k] = arr[i][k];
            }
        }
        return returnArr;
    }

    public static int[][] invert(int[][] arr) {
        int[][] returnArr = new int[arr[0].length][arr.length];
        for (int k = 0; k < arr[0].length; k++) {
            for (int i = 0; i < arr.length; i++) {
                returnArr[k][i] = arr[i][k];
            }
        }
        return returnArr;
    }
}
