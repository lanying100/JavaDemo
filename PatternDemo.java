package demo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Pattern;
/**
 * ��List<String> �����У���ѯ�����з��ϰ����ؼ��ֵ�String
 * 
 * (?=.*?����)(?=.*?���)(?=.*?�Ϻ�)(?=.*?����)^.*$
 * http://bbs.csdn.net/topics/340033445
 * 
 * @author lanying
 *
 */
public class PatternDemo {

	public static void main(String[] args) {
		// ģ�����ݿ��е��鼮�б�
		List<String> list = new ArrayList<String>();
		list.add("��������");
		list.add("ˮ䰴�");
		list.add("���μ�");
		list.add("��¥��");
		list.add("���Java����");
		
		// ģ�������ؼ��֣�ͬʱ������
		System.out.println("�����������ؼ���");
		String keyword = new Scanner(System.in).next();
		
		// �и�ؼ��֣���װ������ʽ
		StringBuilder sb = new StringBuilder();
		String[] ss = keyword.split("");
		for (String s : ss) {
			sb.append("(?=.*?"+s+")");
		}
		sb.append("^.*$");
		String pattern = sb.toString();
		
		// �鿴������ʽ�Ƿ���ȷ
		System.out.println(pattern);
		
		// ����ƥ��
		System.out.println("====== ����������� ======");
		for (String s : list) {
			boolean res = Pattern.matches(pattern, s);// ��ģ��ƥ������ַ��������Ƿ����ģ��Ҫ��
			if(res){
				System.out.println(s);
			}
		}
	}

}
