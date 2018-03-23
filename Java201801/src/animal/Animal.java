package animal;

public abstract class Animal {
	Animal(){
		name = "Tom";
		age = 1;
	}
	public abstract void eat();
	public abstract void work();
	/**
	 * 获得动物的名字
	 * @return 名字
	 */
	public String getName() {
		return name;
	}
	/**
	 * 设定动物的名字
	 * @param A_name 新名字
	 */
	public void setName(String A_name) {
		name = A_name;
	}
	/**
	 * 获得动物的年龄
	 * @return 年龄
	 */
	public int getAge() {
		return age;
	}
	/**
	 * 设定动物的年龄
	 * @param A_age 新年龄
	 */
	public void setAge(int A_age) {
		if((A_age < 0) || (A_age > 50)) {
			age = 0;
			System.out.println("年龄设定错误！");
		} else {
			age = A_age;
		}
	}
	
	protected String name;
	protected int age;
}
