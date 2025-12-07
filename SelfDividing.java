import java.util.*;
public class SelfDividing{
    static List<Integer> get(int l,int r){
        List<Integer> list=new ArrayList<>();
        for(int i=l;i<=r;i++){
            int x=i;
            while(x>0){
                int d=x%10;
                if(d==0 || i%d !=0){
                    break;
                }
                x=x/10;
            }
            if(x==0){
                list.add(i);
            }
        }
        return list;
        
    }
    public static void main(String[] args){
        int l=1,r=22;
        List<Integer> list=get(l,r);
        System.out.print(list);

        
    }
}