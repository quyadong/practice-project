package map;


import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;



public class MapTest {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		Map<String, String> map=new HashMap<String, String>();
		System.out.println("���������鵥�ʶ�Ӧ��ע�ͣ��������HashMap��");
		Scanner scanner=new Scanner(System.in);
		int i=0;
		while (i<3) {
			System.out.println("������keyֵ�����ʣ�:");
			String key=scanner.next();
			System.out.println("������ע�ͣ����֣�:");
			String value=scanner.next();
			map.put(key, value);
			i++;
		}
		
		
		
		//��ӡ����value��ֵ
		System.out.println("********************");
		System.out.println("ʹ�õ��������б�����");
		Iterator<String> iterator=map.values().iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next()+" ");
			
		}

		
		//��ӡ����key��value��ֵ
		System.out.println("********************");
		System.out.println("ͨ��entrySet�����õ�key-value��");
		Set<Map.Entry<String,String>> entry=map.entrySet();//����һ������
		for(Map.Entry<String,String> entry2:entry) {
			System.out.print(entry2.getKey()+"-");
			System.out.println(entry2.getValue());
			
		}
		
		
		//ͨ�����ҵ�ֵ
		System.out.println("������Ҫ���ҵĵ��ʣ�");
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
			System.out.println("�ҵ���"+search+"��ֵ��Ϊ��"+ka+"-"+map.get(ka));
		}
		else {
			System.out.println("û�ҵ�"+search);
		}
		
	
			
			
	
	
			
			
		
		
		
		
		
		
	}

}
