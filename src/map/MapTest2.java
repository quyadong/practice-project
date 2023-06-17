package map;

import java.security.KeyStore.Entry;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;



public class MapTest2 {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		Scanner scanner=new Scanner(System.in);
		Map<String, Goods> goods=new HashMap<String, Goods>();
		System.out.println("������������Ʒ��Ϣ��");
		int i=0;
		while (i<3) {
			System.out.println("�������"+(i+1)+"����Ʒ��Ϣ��");
			System.out.println("��������Ʒ��ţ�");
			String goodsId=scanner.next();
			if(goods.containsKey(goodsId)) {
				System.out.println("��Ʒ����Ѿ����ڣ����������룺");
				continue;//��ִ�к������䣬ת����һ��ѭ����
			}
			
			System.out.println("��������Ʒ���ƣ�");
			String goodsName=scanner.next();
			System.out.println("��������Ʒ�۸�");
			Double goodsPrice=0.0;
			try{
				goodsPrice=scanner.nextDouble();
			}
			catch (java.util.InputMismatchException e) {
				System.out.println("��Ʒ�۸�ĸ�ʽ����ȷ����������ֵ�����ݣ�");
				scanner.next();//
				continue;
			}
			
			
			
			Goods goods2=new Goods(goodsId, goodsName, goodsPrice);//���������Ϣ��ɶ���
			goods.put(goodsId, goods2);//������װ��map����
			i++;
		}
		
	/*	
		
		//�������map
		System.out.println("********************");
		System.out.println("ͨ��entrySet�����õ�ȫ����Ʒ��Ϣ��");
		Set<Map.Entry<String,Goods>> set=goods.entrySet();
		for(Map.Entry<String,Goods> entry2:set) {
			System.out.print(entry2.getKey()+"-");
			System.out.println(entry2.getValue());
			
		}
		*/
		
		//�õ��������б���
		System.out.println("********************");
		System.out.println("ͨ���������õ�ȫ����Ʒ��Ϣ��");
		Iterator<Goods> iterator=goods.values().iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
	}

}




class Goods{
	private String id;//��Ʒ���
	private String name;//��Ʒ���
	private double price;//��Ʒ�۸�
	public Goods(String id, String name, double price) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
	
	@Override
	public String toString() {
		return name+":[id=" + id + ", name=" + name + ", price=" + price + "]";
	}
	
	
	
	
	
}