import java.util.*;
public class RevGrop{
    public static void revg(int[] arr,int k){
        int n=arr.length;
        
        for(int i=0;i<n;i+=k){
            int l=i;
            int r=Math.min(i+k-1,n-1);
            
            while(l<r){
                int tmp=arr[l];
                arr[l]=arr[r];
                arr[r]=tmp;
                l++;
                r--;
            }
        }
    }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        revg(arr,k);
       for(int x:arr){
        System.out.print(x+" ");
       }
sc.close();
    }
}