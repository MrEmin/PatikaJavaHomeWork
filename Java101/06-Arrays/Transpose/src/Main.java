import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        int[][] matrix = {{2, 3, 4}, {5, 6, 4}};
        int[][] transpose = new int[matrix[0].length][matrix.length];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                transpose[j][i] = matrix[i][j];
            }
        }
        for (int[] value: transpose) {
            for (int number : value){
                System.out.print(number + " ");
            }
            System.out.println();
        }
    }
}