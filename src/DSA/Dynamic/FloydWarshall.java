package DSA.Dynamic;
import java.util.*;
public class FloydWarshall{
    static int INF= (int)1e9;
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int m= sc.nextInt();
        int[][] dist=new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(i==j){
                    dist[i][j]=0;
                }
                else{
                    dist[i][j]=INF;
                }
            }
        }
        for(int i=0;i<m;i++){
            int u=sc.nextInt();
            int v=sc.nextInt();
            int w=sc.nextInt();
            dist[u-1][v-1]=w;
        }
        for(int k=0;k<n;k++){
            for(int i=0;i<n;i++){
                for(int j=0;j<n;j++){

                    if(dist[i][k]<INF && dist[k][j]<INF){
                        dist[i][j]=Math.min(dist[i][j],dist[i][k]+dist[k][j]);
                    }
                }
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(dist[i][j]==INF){
                    System.out.print("INF"+ " ");
                }
                else{
                    System.out.print(dist[i][j]+" ");
                }
            }
            System.out.println();
        }
        sc.close();
    }
}
