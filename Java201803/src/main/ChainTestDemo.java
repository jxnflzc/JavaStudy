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
	 * @param da 新数据
	 */ 
	Datas(String da){
		id = 0;
		data = da;
		next = null;
	}
	/**
	 * 
	 * @param i 新id
	 * @param da 新数据
	 */
	Datas(int i, String da){
		id = i;
		data = da;
		next = null;
	}
	/**
	 * 获取id值
	 * @return id值
	 */
	public int getId() {
		return id;
	}
	/**
	 * 取出数据
	 * @return 数据
	 */
	public String getData() {
		return data;
	}
	/**
	 * 添加数据
	 * @param new_info 新数据
	 */
	public void addData(String new_info) {
		this.data += new_info;
	}
	/**
	 * 改变数据
	 * @param new_data 新数据
	 */
	public void setData(String new_data) {
		this.data = new_data;
	}
	/**
	 * 添加Datas类
	 * @param new_data 新Datas类
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
	 * 获取总长度
	 * @return 总长度
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