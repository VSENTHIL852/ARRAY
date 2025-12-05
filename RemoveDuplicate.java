import java.util.*;
public class RemoveDuplicate{
    public static HashSet<Integer> ret(int[] arr){
        int n=arr.length;
        HashSet<Integer> s=new HashSet<>();
        for(int i=0;i<n;i++){
            s.add(arr[i]);
        }
        return s;
    }
public static void main(String[] args){
     int[] arr = {1, 2, 2, 3, 4, 4, 4, 5, 5};
        HashSet<Integer> s = ret(arr);    
     for(int x:s){
        System.out.print(x+" ");
     }
}
}