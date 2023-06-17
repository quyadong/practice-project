package set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetTest2 {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		
		Cat huahua=new Cat("����", 12, "Ӣ����ëè");
		Cat fanfan=new Cat("����", 3, "�й���԰è");
		Set<Cat> set=new HashSet<Cat>();
		set.add(huahua);
		set.add(fanfan);
		Iterator<Cat> it=set.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());//Ĭ�ϵ���Cat���toString ������������������������������������������������
		}
		
		
		
		//����ظ�Ԫ��
		System.out.println("******************");
		System.out.println("����ظ����ݺ�ĳ���è��Ϣ��");
		Cat huahua01=new Cat("����", 12, "Ӣ����ëè");
		set.add(huahua01);
		it=set.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
			
		}
		
		
		
		System.out.println("******************");
		System.out.println("��ӻ���������ĳ�����Ϣ");
		Cat huahua02=new Cat("��������", 2, "Ӣ����ëè");
		set.add(huahua02);
		it=set.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
			
		}
		
		
		
		//�ڼ�����ͨ�����ֲ��һ�������Ϣ�����
		System.out.println("******************");
		System.out.println("ͨ�����ֲ���");
		Cat cat=null;//�ֲ�������ʼ������������������������
		boolean flag=false;
		//�ڼ�����ʹ�����ֲ��һ�������Ϣ
		it=set.iterator();
		while(it.hasNext()) {
			 cat=it.next();//���˷��;Ͳ���Ҫǿ������ת����
			if(cat.getName().equals("����")) {
				flag=true;
				break;
			}
		}
		
		if(flag) {
			System.out.println("�����ҵ���");
			System.out.println(cat);
		}
		else {
			System.out.println("����û�ҵ�");
		}
		
		
		
		
		//�ڼ����в��һ�������Ϣ�����
		
		System.out.println("******************");
		System.out.println("ͨ���������");
		if(set.contains(huahua)) {
			System.out.println("�����ҵ���");
		}
		else {
			System.out.println("����û�ҵ�");
		}
		
		
		
		
	/*	
		//ɾ����������Ϣ���������
		System.out.println("******************");
		System.out.println("ɾ�������");
		it=set.iterator();
		while (it.hasNext()) {
			Cat cat2=it.next();
			if("��������".equals(cat2.getName())){
				it.remove();//!!!!!!!!
			}
		}
		it=set.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
			
			
		}
			
	*/
		
		
     //for��ǿ��䣬ɾ��ָ��Ԫ�ز�����
		for(Cat cat2:set) {
			if("��������".equals(cat2.getName())){
				set.remove(cat2);
				System.out.println("ɾ���ɹ�");
				break;//����ɾ��֮����޷������ˣ�������break���ֹͣѭ��
			}	
		}
		for(Cat cat2:set) {
			System.out.println(cat2);	
		}
		
		
		
		//ɾ�������з��������Ķ������è��Ϣ
		System.out.println("******************");
		System.out.println("ɾ����������");
		Set<Cat> set2=new HashSet<Cat>();
		for(Cat cat2:set) {
			if(cat2.getAge()<5)
				set2.add(cat2);
		}
		set.removeAll(set2);
		for(Cat cat2:set) {
			System.out.println(cat2);	
		}
		
		
		
		
		//ɾ�����������г���è��Ϣ
		System.out.println("*****************");
		boolean flags1=set.removeAll(set);
		if(flags1) {
			it=set.iterator();
			while (it.hasNext()) {
				System.out.println(it.next());
			}
				System.out.println("è��������");
			}
			else {
				System.out.println("è����");
			}
			
		
		
	}

}



class Cat{
	private String name;
	private int age;
	private String species;
	
	
	
	
	public Cat(String name, int age, String species) {
		super();
		this.name = name;
		this.age = age;
		this.species = species;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getSpecies() {
		return species;
	}
	public void setSpecies(String species) {
		this.species = species;
	}
	@Override
	public String toString() {
		return "[������" + name + ", ���䣺" + age + ",����" + species + "]";
	}
	
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((species == null) ? 0 : species.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)//�ж϶����Ƿ����
			return true;
		if (obj == null)
			return false;
		
		if(getClass() == obj.getClass()) {//��ͬ�Ķ���
			Cat other = (Cat) obj;
			return other.getName().equals(name)&&other.getAge()==age&&other.getSpecies().equals(species);
		}
		else
			return false;
	}
	

	
	
	
}