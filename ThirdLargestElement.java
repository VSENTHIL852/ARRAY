import java.util.*;
public class ThirdLargestElement{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();

        }
        int l=Integer.MIN_VALUE,s=Integer.MIN_VALUE,t=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            if(arr[i]>l){
                
                t=s;
                s=l;
                l=arr[i];


            }


            else if(arr[i]>s && arr[i] < l){
            t=s;
            s=arr[i];
            }

            else if(arr[i]>t && arr[i] < s){
                t=arr[i];
            }
        }
        System.out.println(t);


    }
    
}