package nowCoder;

/**
 * ���1~13��������1���ֵĴ���,�����100~1300��������1���ֵĴ�����
 * Ϊ�����ر�����һ��1~13�а���1��������1��10��11��12��13��˹�����6��,���Ƕ��ں�����������û���ˡ�
 * ACMerϣ�����ǰ����,������������ձ黯,���Ժܿ���������Ǹ�����������1���ֵĴ�������1 �� n ��1���ֵĴ�������
 */
public class NumberBetweenAndSolution {
	public  static int NumberOf1Between1AndN_Solution(int n) {
	        int count=0;
	        for(int i=1;i<=n;i++)
	            count+=numberOf1(i);
	        System.out.println(count);
	        return count;
	    }
	     
	   public static int numberOf1(int n){
	        int count=0;
	        while(n>0){
	            if(n%10==1){
	                count++;
	            }
	            n=n/10;
	        }
	        return count;
	    }
	    
	public static void main(String[] args) {
		int n=180;
		NumberBetweenAndSolution.NumberOf1Between1AndN_Solution(n);
	}

}
