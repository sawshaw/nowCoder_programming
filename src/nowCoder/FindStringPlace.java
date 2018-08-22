package nowCoder;

/**
 * @author mercy
 *给定一个已经排好序的字符串数组,空字符串散布在该数组中,编写一个函数寻找一个 给定字符串的位置。
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
