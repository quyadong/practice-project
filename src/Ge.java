import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

 class Ge {
	public static void main(String[] args) {
		
		//�������������Ԫ�أ�ȱ�㣬���鳤�Ȳ��ɱ�
		String []username2;
		username2=new String[3];
		username2[0]="����Ա";
		System.out.println(username2[0]);
		
		
		
		//������ʼ��һ�� ��ȱ������������һ��
		String []username= {"����","����","����"};
		System.out.println(username[0]);
		//String���������൱������
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
		
		
	//��������,̫�鷳
		User use[]=new User[10];//��������
		use[0]=new User();
		use[0].name="ŷ��";
		use[0].sex="��";
		use[0].height=185;
		use[0].phone="131548";
		System.out.println(use[0].name);
	
		
		
		  // ###########
		//��ֵ�Լ��ϣ��û������б�
		ArrayList<Map<String, Object>> userList=new ArrayList<Map<String, Object>>() ;
		Map<String, Object> user1 = new HashMap<String, Object>();
         user1.put("name","��Ů");
         user1.put("sex","Ů");
         user1.put("height",170);
         user1.put("phone","120");
		 userList.add(user1);
		 System.out.println(userList.get(0).get("name"));
		
		 
	
         String[]names={"�����","�տ���","�̲��","���췹��","С�ƹݷ���","��ʽ���",   "������","�������","���Ӽ�","��������","����ţ��","������"};
         String[]detail={"�ó�����","���óԲ�ҪǮ","��֤�úȵ���","�������еķ��궼�д��죡","С�ƹݣ��㰮�ԵĶ���","��ͣ��ó��ֿ���"
                 ,"�óԵĺ�����","�����㲻��","��������Ǯ","�������еķ��궼�д�������","������ţ�ţ���ֵ��ӵ��","���ڵ�����"};
        
         
         
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
			// TODO �Զ����ɵĹ��캯�����
		}
		String name;
		String sex;
		int height;
		String phone;
		
	}
	