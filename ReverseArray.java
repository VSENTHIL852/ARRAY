import java.util.*;
public class ReverseArray{
    public static void getrev(int[] arr){
        int l=0,r=arr.length-1;
        while(l<r){
            int tmp=arr[l];
            arr[l]=arr[r];
            arr[r]=tmp;
            l++;
            r--;
        }
       
    }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        getrev(arr);
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }


    }
}