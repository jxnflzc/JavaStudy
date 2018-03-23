package person;
/**
 * 创建学生对象
 * @author 廖志成
 * @version 0.9.0.0
 */
public class Student extends Person{
	public Student(){
		name = "廖志成";
		age = 18;
		country = "中国";
	}
	public Student(String S_name){
		name = S_name;
		age = 18;
		country = "中国";
	}
	public Student(String S_name, int S_age){
		name = S_name;
		age = S_age;
		country = "中国";
	}
	public Student(String S_name, int S_age, String S_country){
		name = S_name;
		age = S_age;
		country = S_country;
	}
	/**
	 * 获取学生成绩
	 * @return 成绩
	 */
	public int getGrade() {
		return grade;
	}
	/**
	 * 设定学生成绩
	 * @param S_grade 成绩
	 */
	public void setGrade(int S_grade) {
		//对超出范围的年龄进行修正
		if((S_grade < 0) || (S_grade > 100)) {
			grade = 0;
			System.out.println("成绩设定错误!");
		} else {
			grade = S_grade;
		}
	}
	
	private int grade = 60;//
}