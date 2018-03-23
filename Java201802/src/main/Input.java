package main;
import java.util.*;    
public class Input {
    public static void main(String []args) {
       Scanner input = new Scanner(System.in);
       System.out.print("输入你的姓名：");  
       String name = input.next();  
       System.out.print("输入你的年龄：");  
       int age = input.nextInt();  
       System.out.println("姓名：" + name + "\n年龄：" + age );  
       input.close();//若没有关闭Scanner对象将会出现警告  
    }
}