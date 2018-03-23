package person;
/**
 * 创建人物对象
 * @author 廖志成
 * @version 1.0.0.0
 */
public class Person{
	public Person(){
		name = "廖志成";
		age = 18;
		country = "中国";
	}
	public Person(String P_name){
		name = P_name;
		age = 18;
		country = "中国";
	}
	public Person(String P_name, int P_age){
		name = P_name;
		age = P_age;
		country = "中国";
	}
	public Person(String P_name, int P_age, String P_country){
		name = P_name;
		age = P_age;
		country = P_country;
	}
	/**
	 * 获取人物姓名
	 * @return 姓名
	 */
	public String getName() {
		return name;
	}
	/**
	 * 设定人物姓名
	 * @param P_name 新姓名
	 */
	public void setName(String P_name) {
		name = P_name;
	}
	/**
	 * 获取人物年龄
	 * @return 年龄
	 */
	public int getAge() {
		return age;
	}
	/**
	 * 设定人物年龄
	 * @param P_age 新年龄
	 */
	public void setAge(int P_age) {
		//对超出范围的年龄进行修正
		if((P_age < 0) || (P_age > 130)) {
			age = 0;
			System.out.println("年龄设定错误!");
		} else {
			age = P_age;
		}
	}
	/**
	 * 获取人物国家
	 * @return 国家
	 */
	public String getCountry() {
		return country;
	}
	/**
	 * 设定人物国家
	 * @param P_country 新国家
	 */
	public void setCountry(String P_country) {
		country = P_country;
	}
	
	protected String name;//人物姓名
	protected int age;//人物年龄
	protected String country;//
}