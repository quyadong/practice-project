package set;

import java.util.HashSet;


public class HashSetTest  {
	public static void main(String[] args) {
		
		HashSet<String> set=new HashSet<String>();
		String s1=new String("java");
		String s2=s1;
		String s3=new String("JAVA");
		set.add(s1);
		set.add(s2);//����s2��s1������һ���ģ���Ϊ��һ������������3�����
		set.add(s3);
		System.out.println(set.size());
		
		
		
		
		
	}
	

}
