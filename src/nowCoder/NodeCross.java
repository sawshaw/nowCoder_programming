package nowCoder;

/**
 * @author mercy
 *Java���� �ж����������Ƿ��ཻ
 *@TODO
 */
public class NodeCross {
	class DataNode {
		int data;
		DataNode next;
		DataNode(int x){
			data=x;
			next=null;
		}
		public int getData() {
			return data;
		}
		public DataNode getNext() {
			return next;
		}
		public void setData(int data) {
			this.data = data;
		}
		public void setNext(DataNode next) {
			this.next = next;
		}
	}
	
	/**
     * �޻�����£��ж����������Ƿ��ཻ��ֻ��Ҫ���������ж�β�ڵ��Ƿ���ȼ��ɡ�
     * @param h1
     * @param h2
     * @return
     */
    public static boolean isJoinNoLoop(DataNode h1,DataNode h2) {
        DataNode p1 = h1;
        DataNode p2 = h2;
        while(null != p1.getNext())
            p1 = p1.getNext();
        while(null != p2.getNext())
            p2 = p2.getNext();
        return p1 == p2;
    }
    
    /**
     * �޻�������ҵ���һ���ཻ��
     * ������ �����������ĳ��Ȳ�Ϊx,���������ƶ�x����֮��������ͬʱ�ƶ���ֱ�������ĵ�һ�����㡣
     * @param h1
     * @param h2
     * @return
     */
    public static DataNode getFirstJoinNode(DataNode h1,DataNode h2) {
        int length1 = 0;
        int length2 = 0;
        while(null != h1.getNext()) {
            length1 ++;
            h1 = h1.getNext();
        }
        while(null != h2.getNext()) {
            length2 ++;
            h2 = h2.getNext();
        }
        return length1>=length2?getNode(h1,length1,h2,length2):getNode(h2,length2,h1,length1);
    }
    public static DataNode  getNode(DataNode dataA,int lengthA,DataNode DataB,int lengthB){
		return DataB;
		
    }

}
