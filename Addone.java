import java.util.*;
public class Addone{
    public static void main(String[] args){
    int[] arr={9,9,9};
    int a=0;
    for(int i=0;i<arr.length;i++){
        int b=arr[i];
        a=a*10+b;
    }
    a+=1;
    System.out.print(a);
    }
}
