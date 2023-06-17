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
	map.put("CN","�л����񹲺͹�");
	map.put("RU","����˹����");
	map.put("FR","���������͹�");
	map.put("US","��������ڹ�");
	map.put("UK","���е߼���������������");
	System.out.println(map);//��ʾ��ֵ�Լ�
	System.out.println("-----------------------");
	
	
	String re=map.get("CN");//��ȡָ��key��ֵ
	System.out.println(re);
	System.out.println("Map�й���"+map.size()+"������");//��ȡ��ֵ�Ե���Ŀ
	System.out.println("-----------------------");
	
	
	map.remove("CN");//�Ƴ�ָ��key��ֵ
	System.out.println("Map�й���"+map.size()+"������");//��ȡ��ֵ��
	System.out.println("Map����CN��key��"+map.containsKey("CN"));//�ж��Ƿ��з��ϵ�key
	System.out.println("-----------------------");
	
	
	
	System.out.println(map.keySet());//��ʾ����
	System.out.println(map.values());//��ʾֵ��
	System.out.println(map);//��ʾ��ֵ�Լ�
	System.out.println("-----------------------");
	
	
	System.out.println("����");
	Set<String> keys1=map.keySet();
	Iterator<String> iter =keys1.iterator();
	while (iter.hasNext()) {
		String key=iter.next();
		System.out.println(key+"\t"+map.get(key));
		
	}
	System.out.println("-----------------------");
	
	
	//for����
	Set<String> keys=map.keySet();
	for(String str:keys) {
			System.out.println(str+"\t"+map.get(str));
	}
	

	
	
}
}
