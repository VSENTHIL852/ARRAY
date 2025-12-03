import java.util.*;
public class MoveallZero{
    public static void ends(int[] arr){
        int count=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=0){
                arr[count]=arr[i];
                if(i!=count){
                    arr[i]=0;
                }
                count++;
            }
        }
    }
    public static void main(String[] args){
        int[] arr={1,2,0,0,4,0,8};
        ends(arr);
        for(int nu:arr){
            System.out.print(nu+" ");
        }

    }
}