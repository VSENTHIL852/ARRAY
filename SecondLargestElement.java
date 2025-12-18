import java.util.*;
public class SecondLargestElement{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int[] arr=new int[a];
        for(int i=0;i<a;i++){
            arr[i]=sc.nextInt(); 
        }
        int largest=Integer.MIN_VALUE;
        int second=Integer.MIN_VALUE;
        int n=arr.length;
        for(int i=0;i<n;i++){
            if(arr[i]>largest){
                second=largest;
                largest=arr[i];
            }
            else if(arr[i]<largest && arr[i]>second){
                second=arr[i];
            }
        }
        System.out.println(second); 
    }

}
