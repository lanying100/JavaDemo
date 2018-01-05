package test;
/**
 * 李白喝酒
 * 思路：如果考虑实际意义，剩余酒量为0时，遇店加一倍的结果依旧是0，这种情况没意义。
 * 所以最后一个一定是【花】
 * 在前面遇到的5个景中，还有两个位置是【花】
 * 即5选2
 * i,j表示遇到【花】的位置，取值范围[0,4]
 * 
 * @author lanying
 *
 */
public class LiBaiDrink {

	public static void main(String[] args) {

		for (int i = 0; i < 5; i++) {
			for (int j = i + 1; j < 5; j++) {
				// 最后一个是花，剩余1斗
				double d = 1;

				// i,j表示遇花的位置，开始倒推，一共倒推5步
				for (int k = 4; k >= 0; k--) {
					if (k == i || k == j) {
						d ++;// 见花喝一斗 取逆
					} else {
						d /= 2;// 遇店加一倍 取逆
					}
				}

				// 输出
				System.out.print("原有酒：" + d + " -- ");
				for (int m = 0; m < 5; m++) {
					if (m == i || m == j) {
						System.out.print("花");
					} else {
						System.out.print("店");
					}
				}
				System.out.println("花");
			}
		}
	}

}
