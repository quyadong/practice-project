package set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetTest2 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		
		Cat huahua=new Cat("花花", 12, "英国短毛猫");
		Cat fanfan=new Cat("凡凡", 3, "中国田园猫");
		Set<Cat> set=new HashSet<Cat>();
		set.add(huahua);
		set.add(fanfan);
		Iterator<Cat> it=set.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());//默认调用Cat类的toString 方法！！！！！！！！！！！！！！！！！！！！！！
		}
		
		
		
		//添加重复元素
		System.out.println("******************");
		System.out.println("添加重复数据后的宠物猫信息：");
		Cat huahua01=new Cat("花花", 12, "英国短毛猫");
		set.add(huahua01);
		it=set.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
			
		}
		
		
		
		System.out.println("******************");
		System.out.println("添加花花二代后的宠物信息");
		Cat huahua02=new Cat("花花二代", 2, "英国短毛猫");
		set.add(huahua02);
		it=set.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
			
		}
		
		
		
		//在集合中通过名字查找花花的信息并输出
		System.out.println("******************");
		System.out.println("通过名字查找");
		Cat cat=null;//局部变量初始化！！！！！！！！！！！
		boolean flag=false;
		//在集合中使用名字查找花花的信息
		it=set.iterator();
		while(it.hasNext()) {
			 cat=it.next();//加了泛型就不需要强制类型转换了
			if(cat.getName().equals("花花")) {
				flag=true;
				break;
			}
		}
		
		if(flag) {
			System.out.println("花花找到了");
			System.out.println(cat);
		}
		else {
			System.out.println("花花没找到");
		}
		
		
		
		
		//在集合中查找花花的信息并输出
		
		System.out.println("******************");
		System.out.println("通过对象查找");
		if(set.contains(huahua)) {
			System.out.println("花花找到了");
		}
		else {
			System.out.println("花花没找到");
		}
		
		
		
		
	/*	
		//删除花花的信息并重新输出
		System.out.println("******************");
		System.out.println("删除对象后：");
		it=set.iterator();
		while (it.hasNext()) {
			Cat cat2=it.next();
			if("花花二代".equals(cat2.getName())){
				it.remove();//!!!!!!!!
			}
		}
		it=set.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
			
			
		}
			
	*/
		
		
     //for加强语句，删除指定元素并遍历
		for(Cat cat2:set) {
			if("花花二代".equals(cat2.getName())){
				set.remove(cat2);
				System.out.println("删除成功");
				break;//由于删除之后就无法遍历了，所以用break语句停止循环
			}	
		}
		for(Cat cat2:set) {
			System.out.println(cat2);	
		}
		
		
		
		//删除集合中符合条件的多个宠物猫信息
		System.out.println("******************");
		System.out.println("删除多个对象后：");
		Set<Cat> set2=new HashSet<Cat>();
		for(Cat cat2:set) {
			if(cat2.getAge()<5)
				set2.add(cat2);
		}
		set.removeAll(set2);
		for(Cat cat2:set) {
			System.out.println(cat2);	
		}
		
		
		
		
		//删除集合中所有宠物猫信息
		System.out.println("*****************");
		boolean flags1=set.removeAll(set);
		if(flags1) {
			it=set.iterator();
			while (it.hasNext()) {
				System.out.println(it.next());
			}
				System.out.println("猫都不见了");
			}
			else {
				System.out.println("猫还在");
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
		return "[姓名：" + name + ", 年龄：" + age + ",种类" + species + "]";
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
		if (this == obj)//判断对象是否相等
			return true;
		if (obj == null)
			return false;
		
		if(getClass() == obj.getClass()) {//相同的对象
			Cat other = (Cat) obj;
			return other.getName().equals(name)&&other.getAge()==age&&other.getSpecies().equals(species);
		}
		else
			return false;
	}
	

	
	
	
}