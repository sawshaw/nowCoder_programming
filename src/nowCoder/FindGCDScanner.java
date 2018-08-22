package nowCoder;

import java.util.Scanner;
 
/**
 * @author mercy
 *考试的时候不要把上面的package加上去，把类名改成Main
 */
public class FindGCDScanner {
     
    public static int process(int a, int b){
        return a*b/getMaxFactor(a,b);
    }
    public static int getMaxFactor(int a,int b){
        int min=Math.min(a, b);
        int max=Math.max(a, b);
        while(max%min!=0){
            int re=max%min;
            max=min;
            min=re;
        }
        return min;
    }
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        while(in.hasNextInt()){
            int a=in.nextInt();
            int b=in.nextInt();
            System.out.println(process(a,b));
        }
        in.close();
    }
}