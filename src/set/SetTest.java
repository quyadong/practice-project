package set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;


public class SetTest {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		Set set=new HashSet();
		set.add("blue");
		set.add("black");
		set.add("yellow");
		set.add("white");
		System.out.println("�����е�Ԫ��Ϊ��");
		Iterator it=set.iterator();//���÷�����Ԫ�ط��ڵ�������
		while (it.hasNext()) {
			String str = (String) it.next();
			System.out.print(str+" ");
			
		}
		
		
		//�����ظ�Ԫ��ʱ������������Ҳ��������ȥ��
		
	}

}
