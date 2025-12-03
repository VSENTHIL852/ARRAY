import java.util.*;
public class Sortarrayinwave {
    public static void wavesort(int[] arr){
        for(int i=0;i<arr.length;i+=2){
            int tmp=arr[i];
            arr[i]=arr[i+1];
            arr[i+1]=tmp;

        }

    }
    public static void main(String[] args){
        int[] arr={2,1,4,3,6,5};
        wavesort(arr);
        for(int n:arr){
            System.out.print(n+" ");
        }

    }
}