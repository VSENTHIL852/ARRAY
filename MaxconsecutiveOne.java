import java.util.*;
public class MaxconsecutiveOne{
    public static int mco(int[] arr){
        int max=0,count=0;
        for(int n:arr){
            if(n==1){
                count++;
                max=Math.max(max,count);
            }
            else{
                count=0;
            }
        }
        return max;
    }
    public static void main(String[] args){
        int[] arr={1,1,1,0,0,1,0,1,1,1,0};
        
       System.out.println(mco(arr));

    }
}