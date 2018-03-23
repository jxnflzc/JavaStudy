package main;

import java.awt.*;
import java.awt.event.*;

public class AwtDemo {
	private static Frame f_index;
	private static Button but_enter;
	private static Button but_exit;
	private static TextField tf_name;
	
	private static Frame f_second;
	private static Button but_click;
	
	private static int achi_count = 0;
	private static int kill_count = 0;
	private static int gold_count = 0;
	
	public static void main(String[] args) {
		index();
	}
	
	private static void index() {
		f_index = new Frame("首页");//创建主界面
		f_index.setSize(400, 400);//主界面大小
		f_index.setLocation(400, 200);//主界面距离左上角的距离
		f_index.setLayout(new FlowLayout());//主界面布局
		
		but_enter = new Button("进入游戏");//创建"进入游戏"按钮
		but_exit = new Button("退出");//创建"退出"按钮
		tf_name = new TextField(20);//创建"用户名"文本框
		f_index.add(tf_name);//向主界面添加文本框
		f_index.add(but_enter);//向主界面添加按钮
		f_index.add(but_exit);//向主界面添加按钮
		
		index_Event();
		
		f_index.setVisible(true);//主界面显示		
	}
	
	private static void enter() {
		f_second = new Frame("游戏");//创建第二界面
		f_second.setSize(600, 600);//第二界面大小
		f_second.setLocation(300, 100);//第二界面距离左上角的距离
		f_second.setLayout(new FlowLayout());//第二界面布局
		
		but_click = new Button("点击杀敌");//创建"点击杀敌"按钮
		f_second.add(but_click);//向第二界面添加按钮
		
		second_Event();
		
		f_second.setVisible(true);//第二界面显示
	}
	
	private static void index_Event() {
		f_index.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				f_index.dispose();
			}
		});
		but_enter.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e){
				f_index.dispose();
				enter();
			}
		});
		but_exit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e){
				f_index.dispose();
			}
		});
	}
	
	private static void second_Event() {
		f_second.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				f_second.dispose();
			}
		});
		but_click.addMouseListener(new MouseListener() {
			public void mouseClicked(MouseEvent e) {
				kill_count++;
				gold_count++;
				System.out.println("杀敌数:" + kill_count + "\t金币数:" + gold_count);
				if(e.getClickCount() == 2) {
					achi_count++;
					gold_count++;
					System.out.println("双杀!!成就点:" + achi_count  + "\t金币数:" + gold_count);
				}
				if(e.getClickCount() == 3) {
					achi_count += 2;
					gold_count += 2;
					System.out.println("三杀!!成就点:" + achi_count  + "\t金币数:" + gold_count);
				}
			}
			public void mouseEntered(MouseEvent e) {}			
			public void mousePressed(MouseEvent e) {}
			public void mouseReleased(MouseEvent e) {}
			public void mouseExited(MouseEvent e) {}
		});;
		but_click.addKeyListener(new KeyListener() {
			public void keyTyped(KeyEvent e) {}
			public void keyPressed(KeyEvent e) {
				if(e.getKeyChar() == 'j') {
					kill_count++;
					gold_count++;
					System.out.println("杀敌数:" + kill_count + "\t金币数:" + gold_count);
				}
				/*System.out.println(e.getKeyChar() + "..." + KeyEvent.getKeyText(e.getKeyCode()) + "..." + e.getKeyCode());*/
			}
			public void keyReleased(KeyEvent e) {}
		});
	}
}