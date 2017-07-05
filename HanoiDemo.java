package demo;
/**
 * 汉诺塔 递归
 * @author lanying
 *
 */
public class HanoiDemo {

	public static void main(String[] args) {
		hanoi("A","C","B",4);
	}

	/**
	 * 汉诺塔<br/>
	 * 从from到to,借助support
	 * @param from 起点竖杆
	 * @param to 目标竖杆
	 * @param support 协助竖杆
	 * @param level 有几个圈
	 */
	private static void hanoi(String from,String to,String support,int level){
		if(level<=0){
			return ;
		}
		
		// ① from --> support
		hanoi(from,support,to,level-1);
		
		// ② from --> to
		System.out.println(from+" --> "+to);
		
		// ③ support --> to
		hanoi(support,to,from,level-1);
	}
}
