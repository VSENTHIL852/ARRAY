import java.util.*;
public class BuyandSell1{
    public static int ret(int[] arr){
        int store=0;
        for(int i=0;i<arr.length-1;i++){
            for(int j=i+1;j<arr.length;j++){
                store=Math.max(store,arr[j]-arr[i]);
            }
        }
        return store;
    }
      public static void main(String[] args){
        int[] arr={7, 10, 1, 3, 6, 9, 2};
        System.out.print(ret(arr));        
    }
}