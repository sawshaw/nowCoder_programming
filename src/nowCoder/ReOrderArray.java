package nowCoder;

/*����һ���������飬ʵ��һ�����������������������ֵ�˳��
ʹ�����е�����λ�������ǰ�벿�֣����е�ż��λ������ĺ�벿�֣�
����֤������������ż����ż��֮������λ�ò��䡣*/
//����������ð�����򼴿ɻ��߷ֱ�������ż��������list�������������
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
