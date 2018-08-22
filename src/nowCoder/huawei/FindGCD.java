package nowCoder.huawei;

/**
 * @author mercy
 *给定任意两个数，获取最大公约数和最小公倍数
 */
public class FindGCD {
	//辗转相除法
	public static int getGCD0(int x,int y){
		int max=x>y?x:y;
        int min=x<y?x:y;
        int c =max%min;
        if(c==0){
            return min;
        }
        return getGCD0(c,min);
	}
	//更相减损术，a和b数相差太大，可能导致递归的时间越来越长
	public static int getGCD1(int x,int y){
		int max=x>y?x:y;
        int min=x<y?x:y;
        int c =max-min;
        if(c==0){
            return min;
        }
        return getGCD1(c,min);
	}
	public static int getLCM(int x,int y){
		if(x<0||y<0){
			return 0;
		}
		return x*y/(FindGCD.getGCD0(x,y));
	}
	public static void main(String[] args) {
		int x=12;
		int y=16;
		int result1=0;
		int result2=0;
		result1=FindGCD.getGCD0(x, y);
		result2=FindGCD.getLCM(x, y);
		System.out.println("最大公约数:"+result1+",最小公倍数:"+result2);
	}
}
