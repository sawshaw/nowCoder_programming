package nowCoder;

/*输入一个整数数组，实现一个函数来调整该数组中数字的顺序，
使得所有的奇数位于数组的前半部分，所有的偶数位于数组的后半部分，
并保证奇数和奇数，偶数和偶数之间的相对位置不变。*/
//解析：采用冒泡排序即可或者分别将奇数和偶数放两个list里面重新组合下
public class ReOrderArray {
	public static void reOrderArray(int[] array) {
		for(int i=1;i<array.length;i++){
			for(int j=0;j<array.length-i;j++){
				if((array[j]%2==0)&&(array[j + 1]%2!=0)){
				 int temp;
                 temp = array[j + 1];
                 array[j + 1] = array[j];
                 array[j] = temp;
				}
			}
		}
		for(int i=0;i<array.length;i++){
			System.out.println(array[i]);
		}
    }
	public static void main(String[] args) {
		int[] array={2,3,5,0,6,9,7,8,1};
		ReOrderArray.reOrderArray(array);
		
	}

}
