package nowCoder;

/**
 * @author mercy
 *����һ���Ѿ��ź�����ַ�������,���ַ���ɢ���ڸ�������,��дһ������Ѱ��һ�� �����ַ�����λ�á�
 */
public class FindStringPlace {
	public static int findPlace(String[] arr,String str){
		for(int i=0;i<arr.length;i++){
			if(arr[i].equals(str)){
				return i;
			}
		}
		return 0;
	}
	public static void main(String[] args) {
		String[] arr={"ww","jttt","i","","ee","ds","t2",""};
		String str="ds";
		int n=FindStringPlace.findPlace(arr, str);
		System.out.println(n);
	}
}
