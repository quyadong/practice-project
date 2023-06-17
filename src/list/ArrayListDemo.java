package list;

import java.util.*;
import java.util.ArrayList;

public class ArrayListDemo {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
	 List list=new ArrayList();
	 list.add("java");
	 list.add("C");
	 list.add("C++");
	 list.add("Go");
	 list.add("Swift");
	 System.out.println("列表中元素的个数为："+list.size());
	 
	 //遍历输出所有编程语言
	 System.out.println("_______________");
	 for(int i=0;i<list.size();i++) {
		 System.out.print(list.get(i)+",");
		 
	 }
	 
	 //删除指定元素
	 System.out.println();
	 System.out.println("_______________");
	 System.out.println("移除后：");
	 list.remove(2);
	 list.remove("C");
	 for(int i=0;i<list.size();i++) {
		 System.out.print(list.get(i)+",");
		 
	 }
	 
	 
	 
	}

}
