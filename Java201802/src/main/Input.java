package main;
import java.util.*;    
public class Input {
    public static void main(String []args) {
       Scanner input = new Scanner(System.in);
       System.out.print("�������������");  
       String name = input.next();  
       System.out.print("����������䣺");  
       int age = input.nextInt();  
       System.out.println("������" + name + "\n���䣺" + age );  
       input.close();//��û�йر�Scanner���󽫻���־���  
    }
}