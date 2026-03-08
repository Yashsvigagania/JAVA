package DSA;
import java.util.*;
public class mergeSort {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        mergeSortt(arr,0,n-1);
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void merge(int[] arr,int low,int mid,int high){
        int n1=mid-low+1;
        int n2=high-mid;
        int[] l=new int[n1];
        int[] r=new int[n2];
       for(int i=0;i<n1;i++){
           l[i]=arr[low+i];
       }
       for(int j=0;j<n2;j++){
           r[j]=arr[mid+1+j];
       }
       int i=0,j=0,k=low;
       while(i<n1 && j<n2){
           if(l[i]<=r[j]){
               arr[k]=l[i];
               i++;
           }
           else{
               arr[k]=r[j];
               j++;
           }
           k++;
       }
       while(i<n1){
           arr[k]=l[i];
           i++;
           k++;
       }
       while(j<n2){
           arr[k]=r[j];
           j++;
           k++;
       }
    }
    public static void mergeSortt(int[] arr,int low,int high){
        if(low<high){
            int mid=low+(high-low)/2;
            mergeSortt(arr,low,mid);
            mergeSortt(arr,mid+1,high);
            merge(arr,low,mid,high);
        }
    }
}
