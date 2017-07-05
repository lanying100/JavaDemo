package demo;
/**
 * ��ŵ�� �ݹ�
 * @author lanying
 *
 */
public class HanoiDemo {

	public static void main(String[] args) {
		hanoi("A","C","B",4);
	}

	/**
	 * ��ŵ��<br/>
	 * ��from��to,����support
	 * @param from �������
	 * @param to Ŀ������
	 * @param support Э������
	 * @param level �м���Ȧ
	 */
	private static void hanoi(String from,String to,String support,int level){
		if(level<=0){
			return ;
		}
		
		// �� from --> support
		hanoi(from,support,to,level-1);
		
		// �� from --> to
		System.out.println(from+" --> "+to);
		
		// �� support --> to
		hanoi(support,to,from,level-1);
	}
}
