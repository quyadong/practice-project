package list;

import java.util.ArrayList;
import java.util.Date;

public class ArrayListDemo2 {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		//��������
		Notes notes1=new Notes(1,"��ӭ����Ľ����", "����Ա",new Date());
		Notes notes2=new Notes(2,"��ͬѧ�ǰ�ʱ�ύ��ҵ", "��ʦ",new Date());
		Notes notes3=new Notes(3,"����֪ͨ", "��ʦ",new Date());
		//�Ѷ�����ΪԪ���������
		ArrayList notices=new ArrayList();
		notices.add(notes1);
		notices.add(notes2);
		notices.add(notes3);
		
		System.out.println("���������Ϊ");
		for(int i=0;i<notices.size();i++) {
			Notes notes=(Notes) notices.get(i);
			System.out.println((i+1)+":"+notes.getTitle());
		}
		
		//����
		System.out.println("**************************");
		Notes notes4=new Notes(4, "���߱༭��", "����Ա", new Date());
		notices.add(1, notes4);
		for(int i=0;i<notices.size();i++) {
			Notes notes=(Notes) notices.get(i);
			System.out.println((i+1)+":"+notes.getTitle());
		}
		
		
		//ɾ��
		System.out.println("*****************************");
		System.out.println("ɾ������������Ϊ��");
		notices.remove(2);
		for(int i=0;i<notices.size();i++) {
			Notes notes=(Notes) notices.get(i);
			System.out.println((i+1)+":"+notes.getTitle());
		}
		
		
		
		//�޸�
		System.out.println("*****************************");
		System.out.println("�޸Ĺ���������Ϊ��");
		notes4.setTitle("java���߱༭������ʹ����");
		for(int i=0;i<notices.size();i++) {
			Notes notes=(Notes) notices.get(i);
			System.out.println((i+1)+":"+notes.getTitle());
		}
		
	}

}




class Notes{
	private int id;//ID
	private String title;//����
	private String creater;//������
	private Date createTime;//����ʱ��
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



