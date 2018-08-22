package nowCoder.huawei;
import java.util.Scanner;
/**
 * @author mercy
 *����һ��ֵ���õ���������
 *���ַ���⼴��
 */
public class FindCubeRoot{
	    public static double getCubeRoot(double input){
	        //���ַ����
	        double min=0;
	        double max=input;
	        double mid=0;
	        while ((max - min) > 0.001){
	            mid=(max+min)/2;
	            if(mid*mid*mid>input){
	                max=mid;
	            }else if(mid*mid*mid<input){
	                min=mid;
	            }else{
	                return mid;
	            }
	        }
	        return max;
	    }
	    public static void main(String[] args){
	        Scanner in=new Scanner(System.in);
	        if(in.hasNext()){
	            double a=in.nextDouble();
	            System.out.println(String.format("%.1f",getCubeRoot(a)));
	        }
	    }
}
