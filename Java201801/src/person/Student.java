package person;
/**
 * ����ѧ������
 * @author ��־��
 * @version 0.9.0.0
 */
public class Student extends Person{
	public Student(){
		name = "��־��";
		age = 18;
		country = "�й�";
	}
	public Student(String S_name){
		name = S_name;
		age = 18;
		country = "�й�";
	}
	public Student(String S_name, int S_age){
		name = S_name;
		age = S_age;
		country = "�й�";
	}
	public Student(String S_name, int S_age, String S_country){
		name = S_name;
		age = S_age;
		country = S_country;
	}
	/**
	 * ��ȡѧ���ɼ�
	 * @return �ɼ�
	 */
	public int getGrade() {
		return grade;
	}
	/**
	 * �趨ѧ���ɼ�
	 * @param S_grade �ɼ�
	 */
	public void setGrade(int S_grade) {
		//�Գ�����Χ�������������
		if((S_grade < 0) || (S_grade > 100)) {
			grade = 0;
			System.out.println("�ɼ��趨����!");
		} else {
			grade = S_grade;
		}
	}
	
	private int grade = 60;//
}