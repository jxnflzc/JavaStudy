package person;
/**
 * �����������
 * @author ��־��
 * @version 1.0.0.0
 */
public class Person{
	public Person(){
		name = "��־��";
		age = 18;
		country = "�й�";
	}
	public Person(String P_name){
		name = P_name;
		age = 18;
		country = "�й�";
	}
	public Person(String P_name, int P_age){
		name = P_name;
		age = P_age;
		country = "�й�";
	}
	public Person(String P_name, int P_age, String P_country){
		name = P_name;
		age = P_age;
		country = P_country;
	}
	/**
	 * ��ȡ��������
	 * @return ����
	 */
	public String getName() {
		return name;
	}
	/**
	 * �趨��������
	 * @param P_name ������
	 */
	public void setName(String P_name) {
		name = P_name;
	}
	/**
	 * ��ȡ��������
	 * @return ����
	 */
	public int getAge() {
		return age;
	}
	/**
	 * �趨��������
	 * @param P_age ������
	 */
	public void setAge(int P_age) {
		//�Գ�����Χ�������������
		if((P_age < 0) || (P_age > 130)) {
			age = 0;
			System.out.println("�����趨����!");
		} else {
			age = P_age;
		}
	}
	/**
	 * ��ȡ�������
	 * @return ����
	 */
	public String getCountry() {
		return country;
	}
	/**
	 * �趨�������
	 * @param P_country �¹���
	 */
	public void setCountry(String P_country) {
		country = P_country;
	}
	
	protected String name;//��������
	protected int age;//��������
	protected String country;//
}