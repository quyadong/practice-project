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
	
	//��д�ӿڷ���
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
ArrayList<Dog> list=new ArrayList<Dog>();//����һ����㶼��Dog����Ŀ�����(˳��ṹ)##########
		list.add(new Dog(1,"ŷŷ","ѩ����"));//���������ӽ��
		list.add(new Dog(2,"����","��������"));
		list.add(new Dog(3,"�Ʒ�","��������"));
		list.add(new Dog(4,"����","ѩ����"));
		Dog doggy=new Dog(5,"����","����");
		list.add(doggy);
		//����
		/*for(int index=0;index<list.size();index++) {
				Dog dog=list.get(index);  //get()������ȡ����
				System.out.println(dog.name+"  |   "+dog.type);
		
		}
		*/
		/*
		Iterator<Dog> iter=list.iterator();//��ȡһ��������,Linkedlist����ʽ�ṹ�������Ч�ʸߡ�
		while(iter.hasNext()) {
			Dog dog=iter.next();
			System.out.println(dog.name+"  "+dog.type);
			
		}
		*/
		
		list.remove(0);//ɾ��ָ�������Ľ��
		for(int index=0;index<list.size();index++) {
			Dog dog=list.get(index);  //get()������ȡ����
			System.out.println(dog.name+"  |   "+dog.type);
	
	}
		System.out.println("------------------------------");
		
		
		if(list.contains(doggy))//ɾ��ָ������Ľ��
			list.remove(doggy);
		for(int index=0;index<list.size();index++) {
			Dog dog=list.get(index);  //get()������ȡ����
			System.out.println(dog.name+"  |   "+dog.type);
	
	}
		
		//???????????
		/*
		Dog doggy2=new Dog(5,"����2","����");
		int index=Collections.binarySearch(list, doggy2, null);
		if(index>=0)
			System.out.println(doggy2.name+"��������"+list.get(index).name+"�����ͬ");
		
		*/
		
		
		
		
		
		
		
		
	}
	
	
	
}
