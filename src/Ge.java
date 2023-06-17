import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

 class Ge {
	public static void main(String[] args) {
		
		//先声明，后加入元素，缺点，数组长度不可变
		String []username2;
		username2=new String[3];
		username2[0]="管理员";
		System.out.println(username2[0]);
		
		
		
		//声明初始化一起 ，缺点所有数据在一起
		String []username= {"张三","李四","王五"};
		System.out.println(username[0]);
		//String类型链表，相当于数组
		ArrayList<String> list=new ArrayList<String>();
		for(int i=0;i<username.length;i++) {
			list.add(username[i]);
			System.out.println(list.get(i));
		}
		System.out.println("----------------------");
		list.add(username2[0]);
		for(String a:list) {
			System.out.println(a);
		}
		System.out.println("----------------------");
		
		
	//对象数组,太麻烦
		User use[]=new User[10];//对象数组
		use[0]=new User();
		use[0].name="欧阳";
		use[0].sex="男";
		use[0].height=185;
		use[0].phone="131548";
		System.out.println(use[0].name);
	
		
		
		  // ###########
		//键值对集合（用户）的列表
		ArrayList<Map<String, Object>> userList=new ArrayList<Map<String, Object>>() ;
		Map<String, Object> user1 = new HashMap<String, Object>();
         user1.put("name","仙女");
         user1.put("sex","女");
         user1.put("height",170);
         user1.put("phone","120");
		 userList.add(user1);
		 System.out.println(userList.get(0).get("name"));
		
		 
	
         String[]names={"火锅店","烧烤店","奶茶店","大庆饭店","小酒馆饭店","西式快餐",   "汉堡店","麻辣香锅","辣子鸡","春生饭店","招牌牛排","刀削面"};
         String[]detail={"好吃再来","不好吃不要钱","保证好喝到哭","不是所有的饭店都叫大庆！","小酒馆，你爱吃的都有","快餐，好吃又快速"
                 ,"好吃的汉堡店","不信你不来","不辣不收钱","不是所有的饭店都叫春生饭店","三成熟牛排，你值得拥有","正宗刀削面"};
        
         
         
        // ###########
         ArrayList<Map<String, Object>> userList2=new ArrayList<Map<String, Object>>() ;
	        for(int i=0;i<names.length;i++){
	            Map<String,Object> user=new HashMap<>();
	            user.put("shopname",names[i]);
	            user.put("details",detail[i]);
	            userList2.add(user);
	        }
	        
	        System.out.println(userList2.get(0));
	
	      
	    
	 
		HashMap<String, Integer>dog1=new HashMap<>();
		dog1.put("weight", 1);
		HashMap<String, Integer>dog2=new HashMap<>();
		dog2.put("weight", 10);
		ArrayList<HashMap<String, Integer>>list1=new ArrayList<>();
		list1.add(dog1);
		list1.add(dog2);
		System.out.println(list1.get(0));
		
		 
	}
	

}

		
class User{
		public User() {
			// TODO 自动生成的构造函数存根
		}
		String name;
		String sex;
		int height;
		String phone;
		
	}
	