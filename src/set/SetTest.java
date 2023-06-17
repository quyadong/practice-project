package set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;


public class SetTest {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Set set=new HashSet();
		set.add("blue");
		set.add("black");
		set.add("yellow");
		set.add("white");
		System.out.println("集合中的元素为：");
		Iterator it=set.iterator();//调用方法将元素放在迭代器中
		while (it.hasNext()) {
			String str = (String) it.next();
			System.out.print(str+" ");
			
		}
		
		
		//插入重复元素时，不报错，但是也不会插入进去。
		
	}

}
