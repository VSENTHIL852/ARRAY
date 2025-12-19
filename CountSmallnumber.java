import java.util.*;
public class CountSmallnumber{
    static int[] ret(int[] arr){
        int n=arr.length;
        int[] m=new int[n]; 
        for(int i=0;i<n;i++){
            int count=0;
            for(int j=0;j<n;j++){
                if(arr[j]<arr[i]){
                    count++;
                }
            }
            m[i]=count;
        }
        return m;
    }
    public static void main(String[] args){
        int[] arr={6,5,4,8};
        int[] m=ret(arr);
        for(int x:m){
            System.out.print(x+" ");
        }

    }
}
