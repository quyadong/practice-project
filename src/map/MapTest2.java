package map;

import java.security.KeyStore.Entry;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;



public class MapTest2 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Scanner scanner=new Scanner(System.in);
		Map<String, Goods> goods=new HashMap<String, Goods>();
		System.out.println("请输入三条商品信息：");
		int i=0;
		while (i<3) {
			System.out.println("请输入第"+(i+1)+"条商品信息：");
			System.out.println("请输入商品编号：");
			String goodsId=scanner.next();
			if(goods.containsKey(goodsId)) {
				System.out.println("商品编号已经存在，请重新输入：");
				continue;//不执行后面的语句，转入下一次循环。
			}
			
			System.out.println("请输入商品名称：");
			String goodsName=scanner.next();
			System.out.println("请输入商品价格：");
			Double goodsPrice=0.0;
			try{
				goodsPrice=scanner.nextDouble();
			}
			catch (java.util.InputMismatchException e) {
				System.out.println("商品价格的格式不正确，请输入数值型数据：");
				scanner.next();//
				continue;
			}
			
			
			
			Goods goods2=new Goods(goodsId, goodsName, goodsPrice);//将输入的信息组成对象
			goods.put(goodsId, goods2);//将对象装进map集合
			i++;
		}
		
	/*	
		
		//遍历输出map
		System.out.println("********************");
		System.out.println("通过entrySet方法得到全部商品信息：");
		Set<Map.Entry<String,Goods>> set=goods.entrySet();
		for(Map.Entry<String,Goods> entry2:set) {
			System.out.print(entry2.getKey()+"-");
			System.out.println(entry2.getValue());
			
		}
		*/
		
		//用迭代器进行遍历
		System.out.println("********************");
		System.out.println("通过迭代器得到全部商品信息：");
		Iterator<Goods> iterator=goods.values().iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
	}

}




class Goods{
	private String id;//商品编号
	private String name;//商品编号
	private double price;//商品价格
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