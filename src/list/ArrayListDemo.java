package list;

import java.util.*;
import java.util.ArrayList;

public class ArrayListDemo {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
	 List list=new ArrayList();
	 list.add("java");
	 list.add("C");
	 list.add("C++");
	 list.add("Go");
	 list.add("Swift");
	 System.out.println("�б���Ԫ�صĸ���Ϊ��"+list.size());
	 
	 //����������б������
	 System.out.println("_______________");
	 for(int i=0;i<list.size();i++) {
		 System.out.print(list.get(i)+",");
		 
	 }
	 
	 //ɾ��ָ��Ԫ��
	 System.out.println();
	 System.out.println("_______________");
	 System.out.println("�Ƴ���");
	 list.remove(2);
	 list.remove("C");
	 for(int i=0;i<list.size();i++) {
		 System.out.print(list.get(i)+",");
		 
	 }
	 
	 
	 
	}

}
