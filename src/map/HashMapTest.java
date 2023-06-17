package map;

import java.nio.charset.MalformedInputException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
class Country{
	String ar;
	String chinese;
	
	public Country(String ar,String chinese) {
	this.ar=ar;
	this.chinese=chinese;
	}
	
	public String getChinese() {
		return chinese;
	}
	
	
}



public class HashMapTest {
public static void main(String[] args) {
	HashMap<String, String> map=new HashMap<String,String>();
	map.put("CN","中华人民共和国");
	map.put("RU","俄罗斯联邦");
	map.put("FR","法兰西共和国");
	map.put("US","美利坚合众国");
	map.put("UK","大不列颠及爱尔兰联合王国");
	System.out.println(map);//显示键值对集
	System.out.println("-----------------------");
	
	
	String re=map.get("CN");//获取指定key的值
	System.out.println(re);
	System.out.println("Map中共有"+map.size()+"组数据");//获取键值对的数目
	System.out.println("-----------------------");
	
	
	map.remove("CN");//移除指定key的值
	System.out.println("Map中共有"+map.size()+"组数据");//获取键值对
	System.out.println("Map中有CN的key吗？"+map.containsKey("CN"));//判断是否有符合的key
	System.out.println("-----------------------");
	
	
	
	System.out.println(map.keySet());//显示键集
	System.out.println(map.values());//显示值集
	System.out.println(map);//显示键值对集
	System.out.println("-----------------------");
	
	
	System.out.println("遍历");
	Set<String> keys1=map.keySet();
	Iterator<String> iter =keys1.iterator();
	while (iter.hasNext()) {
		String key=iter.next();
		System.out.println(key+"\t"+map.get(key));
		
	}
	System.out.println("-----------------------");
	
	
	//for遍历
	Set<String> keys=map.keySet();
	for(String str:keys) {
			System.out.println(str+"\t"+map.get(str));
	}
	

	
	
}
}
