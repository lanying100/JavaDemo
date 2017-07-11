package demo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Pattern;
/**
 * 从List<String> 集合中，查询出所有符合包含关键字的String
 * 
 * (?=.*?北京)(?=.*?天津)(?=.*?上海)(?=.*?重庆)^.*$
 * http://bbs.csdn.net/topics/340033445
 * 
 * @author lanying
 *
 */
public class PatternDemo {

	public static void main(String[] args) {
		// 模拟数据库中的书籍列表
		List<String> list = new ArrayList<String>();
		list.add("三国演义");
		list.add("水浒传");
		list.add("西游记");
		list.add("红楼梦");
		list.add("疯狂Java讲义");
		
		// 模糊搜索关键字（同时包含）
		System.out.println("请输入搜索关键字");
		String keyword = new Scanner(System.in).next();
		
		// 切割关键字，组装正则表达式
		StringBuilder sb = new StringBuilder();
		String[] ss = keyword.split("");
		for (String s : ss) {
			sb.append("(?=.*?"+s+")");
		}
		sb.append("^.*$");
		String pattern = sb.toString();
		
		// 查看正则表达式是否正确
		System.out.println(pattern);
		
		// 正则匹配
		System.out.println("====== 搜索结果如下 ======");
		for (String s : list) {
			boolean res = Pattern.matches(pattern, s);// 用模板匹配给定字符串，看是否符合模板要求
			if(res){
				System.out.println(s);
			}
		}
	}

}
