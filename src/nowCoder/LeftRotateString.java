package nowCoder;

/**
 * @author mercy
 * �����������һ����λָ�����ѭ�����ƣ�ROL���������и��򵥵�����
 * �������ַ���ģ�����ָ���������������һ���������ַ�����S��
 * �������ѭ������Kλ���������������磬�ַ�����S=��abcXYZdef��,
 * Ҫ�����ѭ������3λ��Ľ��������XYZdefabc����
 */
public class LeftRotateString {
	public static String leftRotateStrings(String str,int n) {
		int len = str.length();
        String result="";
        if(len < 1){
            return result;
        }
        n %= len;//��ֹn > len
        result = str.substring(n, len);
        result += str.substring(0,n);
        System.out.println(result);
		return result;
	
    }
	
	public static void main(String[] args) {
		String str="abcXYZdef";
		int n=3;
		LeftRotateString.leftRotateStrings(str, n);
	}

}
