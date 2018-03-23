package animal;

public abstract class Animal {
	Animal(){
		name = "Tom";
		age = 1;
	}
	public abstract void eat();
	public abstract void work();
	/**
	 * ��ö��������
	 * @return ����
	 */
	public String getName() {
		return name;
	}
	/**
	 * �趨���������
	 * @param A_name ������
	 */
	public void setName(String A_name) {
		name = A_name;
	}
	/**
	 * ��ö��������
	 * @return ����
	 */
	public int getAge() {
		return age;
	}
	/**
	 * �趨���������
	 * @param A_age ������
	 */
	public void setAge(int A_age) {
		if((A_age < 0) || (A_age > 50)) {
			age = 0;
			System.out.println("�����趨����");
		} else {
			age = A_age;
		}
	}
	
	protected String name;
	protected int age;
}
