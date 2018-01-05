package test;

import java.util.Scanner;

/**
 * 四个数字，加减乘除，从前往后依次运算（不考虑运算符优先级），拼成24点
 * 
 * @author lanying
 *
 */
public class TwentyFourDemo {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("请输入四个整数");
		int a = input.nextInt();
		int b = input.nextInt();
		int c = input.nextInt();
		int d = input.nextInt();
		int[] arr = { a, b, c, d };// 四个数字保存在数组中
		char[] op = { '+', '-', '*', '/' };

		// i,j,k,l 是数字数组的下标
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				if (i == j) {
					continue;
				}
				for (int k = 0; k < arr.length; k++) {
					if (k == i || k == j) {
						continue;
					}
					for (int l = 0; l < arr.length; l++) {
						if (l == i || l == j || l == k) {
							continue;
						}
						// 四个数字的所有排列情况
						// System.out.println(arr[i]+" "+arr[j]+" "+arr[k]+" "+arr[l]);

						// 3个运算符的坑，每个坑有四种情况（x,y,z 是运算符数组的下标）
						for (int x = 0; x < op.length; x++) {
							double res1 = op(arr[i], arr[j], op[x]);
							for (int y = 0; y < op.length; y++) {
								double res2 = op(res1, arr[k], op[y]);
								for (int z = 0; z < op.length; z++) {
									double res3 = op(res2, arr[l], op[z]);
									if ((int) res3 == 24) {
										System.out.println("((" + arr[i] + op[x] + arr[j] + ")" + op[y] + arr[k] + ")"
												+ op[z] + arr[l] + " = 24");
									}
								}
							}
						}
					}
				}
			}
		}
	}

	private static double op(double a, double b, char c) {
		switch (c) {
		case '+':
			return a + b;
		case '-':
			return a - b;
		case '*':
			return a * b;
		case '/':
			return a / b;
		default:
			System.err.println("ERROR");
			return 0;
		}

	}

}
