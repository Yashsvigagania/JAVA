package DSA;
import java.util.*;
public class Nqueen {
    static List<int[]> solutions = new ArrayList<>();

    public static void solveNQueens(int n) {
        int[] board = new int[n];
        Arrays.fill(board, -1);
        backtrack(0, n, board);
    }

    private static void backtrack(int col, int n, int[] board) {
        if (col == n) {
            solutions.add(board.clone());
            return;
        }

        for (int row = 0; row < n; row++) {
            if (isSafe(col, row, board)) {
                board[col] = row;
                backtrack(col + 1, n, board);
                board[col] = -1;
            }
        }
    }

    private static boolean isSafe(int col, int row, int[] board) {
        for (int prevCol = 0; prevCol < col; prevCol++) {
            int prevRow = board[prevCol];

            if (prevRow == row) return false;

            if (Math.abs(prevRow - row) == Math.abs(prevCol - col)) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        solveNQueens(n);

        if (solutions.size() == 0) {
            System.out.println("-1");
        } else {
            for (int[] sol : solutions) {
                for (int i = 0; i < sol.length; i++) {
                    System.out.print(sol[i]);
                    if (i != sol.length - 1) {
                        System.out.print(" "); // space only between numbers
                    }
                }
                System.out.println();
            }
        }
    }
}