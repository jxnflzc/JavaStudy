package main;

public class ChainTestDemo {

	public static void main(String[] args) {
		Datas animal = new Datas("animal");
		/*Datas fruit = new Datas("fruit");
		Datas people = new Datas("people");
		Datas person = new Datas("person");
		Datas school = new Datas("school");
		Datas river = new Datas("river");
		Datas vegetable = new Datas("vegetable");*/
		animal.addDatas(new Datas("fruit"));
		animal.addDatas(new Datas("people"));
		animal.addDatas(new Datas("person"));
		animal.addDatas(new Datas("school"));
		animal.addDatas(new Datas("river"));
		animal.addDatas(new Datas("vegetable"));
		animal.next.addData("Hahhhh");
		System.out.println(animal.getId());
		System.out.println(animal.next.getId());
		System.out.println(animal.getLength());
		System.out.println(animal.next.getData());
	}

}

class Datas{
	private int id;
	private String data;
	public Datas next;
	/**
	 * 
	 * @param da ������
	 */ 
	Datas(String da){
		id = 0;
		data = da;
		next = null;
	}
	/**
	 * 
	 * @param i ��id
	 * @param da ������
	 */
	Datas(int i, String da){
		id = i;
		data = da;
		next = null;
	}
	/**
	 * ��ȡidֵ
	 * @return idֵ
	 */
	public int getId() {
		return id;
	}
	/**
	 * ȡ������
	 * @return ����
	 */
	public String getData() {
		return data;
	}
	/**
	 * �������
	 * @param new_info ������
	 */
	public void addData(String new_info) {
		this.data += new_info;
	}
	/**
	 * �ı�����
	 * @param new_data ������
	 */
	public void setData(String new_data) {
		this.data = new_data;
	}
	/**
	 * ���Datas��
	 * @param new_data ��Datas��
	 */
	public void addDatas(Datas new_data) {
		int new_id = this.getId();
		Datas temp = this;//first_Data;
		while(temp.next != null) {
			new_id++;
			temp = temp.next;
			temp.id = new_id;
		}
		temp.next = new_data;
		temp.next.id = ++new_id;
	}
	/**
	 * ��ȡ�ܳ���
	 * @return �ܳ���
	 */
	public int getLength() {
		Datas temp = this;
		int i;
		while(temp.next != null) {
			temp = temp.next;
			//i++;
		}
		i = ++temp.id;
		return i;
	}
}