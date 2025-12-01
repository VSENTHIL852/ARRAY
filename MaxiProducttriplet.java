import java.util.*;
public class MaxiProducttriplet{


    public static void mptrip(int[] arr){
int n=arr.length;
        int max1=Integer.MIN_VALUE;
        int max2=Integer.MIN_VALUE;
        int max3=Integer.MIN_VALUE;

        int min1=Integer.MAX_VALUE;
        int min2=Integer.MAX_VALUE;

        for(int i=0;i<n;i++){
            int x=arr[i];
            if(x>max1){
                max3=max2;
                max2=max1;
                max1=x;
            }
            else if(x>max2){
                max3=max2;
                max2=x;
            }
            else if(x>max3){
                max3=x;
            }


            if(x<min1){
                min2=min1;
                min1=x;

            }
            else if(x < min2){
                min2=x;
            }

        }
             int product1 = max1 * max2 * max3;   // 3 largest
        int product2 = max1 * min1 * min2;   // 2 smallest + largest
System.out.println(Math.max(product1, product2));

        


    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        mptrip(arr);


         



    }
}