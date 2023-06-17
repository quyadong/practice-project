package list;

import java.util.ArrayList;
import java.util.Date;

public class ArrayListDemo2 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		//创建对象
		Notes notes1=new Notes(1,"欢迎来到慕课网", "管理员",new Date());
		Notes notes2=new Notes(2,"请同学们按时提交作业", "老师",new Date());
		Notes notes3=new Notes(3,"考勤通知", "老师",new Date());
		//把对象作为元素添加链表
		ArrayList notices=new ArrayList();
		notices.add(notes1);
		notices.add(notes2);
		notices.add(notes3);
		
		System.out.println("公告的内容为");
		for(int i=0;i<notices.size();i++) {
			Notes notes=(Notes) notices.get(i);
			System.out.println((i+1)+":"+notes.getTitle());
		}
		
		//插入
		System.out.println("**************************");
		Notes notes4=new Notes(4, "在线编辑器", "管理员", new Date());
		notices.add(1, notes4);
		for(int i=0;i<notices.size();i++) {
			Notes notes=(Notes) notices.get(i);
			System.out.println((i+1)+":"+notes.getTitle());
		}
		
		
		//删除
		System.out.println("*****************************");
		System.out.println("删除公告后的内容为：");
		notices.remove(2);
		for(int i=0;i<notices.size();i++) {
			Notes notes=(Notes) notices.get(i);
			System.out.println((i+1)+":"+notes.getTitle());
		}
		
		
		
		//修改
		System.out.println("*****************************");
		System.out.println("修改公告后的内容为：");
		notes4.setTitle("java在线编辑器可以使用啦");
		for(int i=0;i<notices.size();i++) {
			Notes notes=(Notes) notices.get(i);
			System.out.println((i+1)+":"+notes.getTitle());
		}
		
	}

}




class Notes{
	private int id;//ID
	private String title;//标题
	private String creater;//创建人
	private Date createTime;//创建时间
	public Notes(int id, String title, String creater, Date createTime) {
		super();
		this.id = id;
		this.title = title;
		this.creater = creater;
		this.createTime = createTime;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getCreater() {
		return creater;
	}
	public void setCreater(String creater) {
		this.creater = creater;
	}
	public Date getCreateTime() {
		return createTime;
	}
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	
	

}



