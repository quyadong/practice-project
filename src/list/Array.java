package list;

import java.util.ArrayList;
import java.util.*;
class Dog implements Comparable{
    String name;
	String type;
	int id;
	Dog(){}
	Dog(int id,String name,String type){
		this.name=name;
		this.type=type;
		this.id=id;
	}
	
	//重写接口方法
	public int compareTo(Object b) {
		Dog nb=(Dog)b;
		return (this.id-nb.id);
		
	}
	
	public String getName() {
		return name;
	}
	
}


public class Array {
	public static void main(String[] args) {
ArrayList<Dog> list=new ArrayList<Dog>();//创建一个结点都是Dog对象的空链表(顺序结构)##########
		list.add(new Dog(1,"欧欧","雪纳瑞"));//链表中增加结点
		list.add(new Dog(2,"亚亚","拉布拉多"));
		list.add(new Dog(3,"菲菲","拉布拉多"));
		list.add(new Dog(4,"美美","雪纳瑞"));
		Dog doggy=new Dog(5,"旺财","土狗");
		list.add(doggy);
		//遍历
		/*for(int index=0;index<list.size();index++) {
				Dog dog=list.get(index);  //get()方法获取对象
				System.out.println(dog.name+"  |   "+dog.type);
		
		}
		*/
		/*
		Iterator<Dog> iter=list.iterator();//获取一个迭代器,Linkedlist（链式结构）用这个效率高。
		while(iter.hasNext()) {
			Dog dog=iter.next();
			System.out.println(dog.name+"  "+dog.type);
			
		}
		*/
		
		list.remove(0);//删除指定索引的结点
		for(int index=0;index<list.size();index++) {
			Dog dog=list.get(index);  //get()方法获取对象
			System.out.println(dog.name+"  |   "+dog.type);
	
	}
		System.out.println("------------------------------");
		
		
		if(list.contains(doggy))//删除指定对象的结点
			list.remove(doggy);
		for(int index=0;index<list.size();index++) {
			Dog dog=list.get(index);  //get()方法获取对象
			System.out.println(dog.name+"  |   "+dog.type);
	
	}
		
		//???????????
		/*
		Dog doggy2=new Dog(5,"旺财2","土狗");
		int index=Collections.binarySearch(list, doggy2, null);
		if(index>=0)
			System.out.println(doggy2.name+"和链表中"+list.get(index).name+"身高相同");
		
		*/
		
		
		
		
		
		
		
		
	}
	
	
	
}
