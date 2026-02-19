package DSA;
import java.util.*;
public class bipartiteGraph {
    static boolean isBipartite(int [][] adj,int source,int n){
        int[] color=new int[n];
        Arrays.fill(color,0); //Initially marked all vertex as uncoloured
        Queue<Integer> queue=new LinkedList<>();
        queue.add(source);
        color[source]=1;
        //bfs loop
        while(!queue.isEmpty()){
            int node=queue.poll(); //remove front node
            for(int i=0;i<n;i++){
                if(adj[node][i]==1){
                    if(color[i]==0){
                        color[i]=-color[node];
                        queue.add(i);
                    }
                    else if(color[i]==color[node]){
                        return false;
                    }
                }
            }
        }
        return true;
    }
    public static void main(String[] args){
     Scanner sc=new Scanner(System.in);
     int n=sc.nextInt();
     int[][] adj=new int[n][n];
     for(int i=0;i<n;i++){
         for(int j=0;j<n;j++){
             adj[i][j]=sc.nextInt();
         }
     }
     int source=sc.nextInt();
     boolean result=isBipartite(adj,source,n);
     System.out.println(result? "Yes":"No");
     sc.close();
    }
}
