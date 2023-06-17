package map;


import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;



public class MapTest {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Map<String, String> map=new HashMap<String, String>();
		System.out.println("请输入三组单词对应的注释，并存放在HashMap中");
		Scanner scanner=new Scanner(System.in);
		int i=0;
		while (i<3) {
			System.out.println("请输入key值（单词）:");
			String key=scanner.next();
			System.out.println("请输入注释（汉字）:");
			String value=scanner.next();
			map.put(key, value);
			i++;
		}
		
		
		
		//打印数出value的值
		System.out.println("********************");
		System.out.println("使用迭代器进行遍历：");
		Iterator<String> iterator=map.values().iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next()+" ");
			
		}

		
		//打印数出key和value的值
		System.out.println("********************");
		System.out.println("通过entrySet方法得到key-value：");
		Set<Map.Entry<String,String>> entry=map.entrySet();//返回一个集合
		for(Map.Entry<String,String> entry2:entry) {
			System.out.print(entry2.getKey()+"-");
			System.out.println(entry2.getValue());
			
		}
		
		
		//通过键找到值
		System.out.println("请输入要查找的单词：");
		String search=scanner.next();
		boolean flag=false;
		String ka=null;
		Set <String> keySet=map.keySet();
		for(String key:keySet) {
			if(search.equals(key)) {
				ka=key;
				flag=true;
				break;
			}
		}
		if(flag) {
			System.out.println("找到了"+search+"键值对为："+ka+"-"+map.get(ka));
		}
		else {
			System.out.println("没找到"+search);
		}
		
	
			
			
	
	
			
			
		
		
		
		
		
		
	}

}
