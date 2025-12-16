import java.util.*;
public class BuyandSell1{ 
    public static int ret(int[] arr){
        int max=arr[0];
        int store=0;
        for(int i=0;i<arr.length;i++){
            max=Math.min(max,arr[i]); 
            store=Math.max(store,arr[i]-max); 
        }  
        return store;
    }
      public static void main(String[] args){
        int[] arr={7, 10, 1, 3, 6, 9, 2};
        System.out.print(ret(arr));        
    }
}
