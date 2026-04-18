package DSA;
import java.util.*;
public class NQueenbacktrack{
    static List<int[]> solutions=new ArrayList<>();
    public static void NQueenSolve(int n){
        int[] board=new int[n];
        Arrays.fill(board,-1);
        backtrack(0,n,board);
    }
    public static void backtrack(int col,int n,int[] board){
        if(col==n){
            solutions.add(board.clone());
            return;
        }
        for(int row=0;row<n;row++){
            if(isSafe(col,row,board)){
                board[col]=row;
                backtrack(col+1,n,board);
                board[col]=-1;
            }
        }
    }
    public static boolean isSafe(int col,int row,int[] board){
        for(int prevcol=0;prevcol<col;prevcol++){
            int prevrow=board[prevcol];
            if(prevrow==row) return false;
            if(Math.abs(prevcol-col)==Math.abs(prevrow-row)) return false;
        }
        return true;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        NQueenSolve(n);
        if(solutions.isEmpty()){
            System.out.println(-1);
        }
        else{
            for(int[] sol:solutions){
                for(int i=0;i<sol.length;i++){
                    System.out.print(sol[i]);
                    if(i!=sol.length-1){
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }
        }
    }
}