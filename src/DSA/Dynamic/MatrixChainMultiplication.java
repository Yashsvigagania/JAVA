package DSA.Dynamic;
import java.util.*;
public class MatrixChainMultiplication {
    static int matrixChainMultiplication(int[] arr,int n){
        int[][] dp=new int[n][n];
        for(int l=2;l<n;l++){
            for(int i=1;i<n-l+1;i++){
                int j=i+l-1;
                dp[i][j]=Integer.MAX_VALUE;
                for(int k=i;k<j;k++){
                    int cost=dp[i][k]+dp[k+1][j]+arr[i-1]*arr[k]*arr[j];
                    if(cost<dp[i][j]){
                        dp[i][j]=cost;
                    }
                }
            }
        }
        return dp[1][n-1];
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int result=matrixChainMultiplication(arr,n);
        System.out.println(result);
        sc.close();
    }
}
