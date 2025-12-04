import java.util.*;
public class LeftRotate{
    public static void ret(int[] arr,int d){
        int n=arr.length;
        d=d%n;
        rotate(arr,0,d-1);
        rotate(arr,d,n-1);
        rotate(arr,0,n-1);

    }
    static void rotate(int[] arr,int s,int e){
        while(s<e){
            int tmp=arr[s];
            arr[s]=arr[e];
            arr[e]=tmp;
            s++;
            e--;
        }

    }
    public static void main(String[] args){
        int[] arr={1, 2, 3, 4, 5, 6};
        int d=2;
        ret(arr,d);
        for(int x:arr){
            System.out.print(x+" ");
        }

    }
}