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
		f_index = new Frame("��ҳ");//����������
		f_index.setSize(400, 400);//�������С
		f_index.setLocation(400, 200);//������������Ͻǵľ���
		f_index.setLayout(new FlowLayout());//�����沼��
		
		but_enter = new Button("������Ϸ");//����"������Ϸ"��ť
		but_exit = new Button("�˳�");//����"�˳�"��ť
		tf_name = new TextField(20);//����"�û���"�ı���
		f_index.add(tf_name);//������������ı���
		f_index.add(but_enter);//����������Ӱ�ť
		f_index.add(but_exit);//����������Ӱ�ť
		
		index_Event();
		
		f_index.setVisible(true);//��������ʾ		
	}
	
	private static void enter() {
		f_second = new Frame("��Ϸ");//�����ڶ�����
		f_second.setSize(600, 600);//�ڶ������С
		f_second.setLocation(300, 100);//�ڶ�����������Ͻǵľ���
		f_second.setLayout(new FlowLayout());//�ڶ����沼��
		
		but_click = new Button("���ɱ��");//����"���ɱ��"��ť
		f_second.add(but_click);//��ڶ�������Ӱ�ť
		
		second_Event();
		
		f_second.setVisible(true);//�ڶ�������ʾ
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
				System.out.println("ɱ����:" + kill_count + "\t�����:" + gold_count);
				if(e.getClickCount() == 2) {
					achi_count++;
					gold_count++;
					System.out.println("˫ɱ!!�ɾ͵�:" + achi_count  + "\t�����:" + gold_count);
				}
				if(e.getClickCount() == 3) {
					achi_count += 2;
					gold_count += 2;
					System.out.println("��ɱ!!�ɾ͵�:" + achi_count  + "\t�����:" + gold_count);
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
					System.out.println("ɱ����:" + kill_count + "\t�����:" + gold_count);
				}
				/*System.out.println(e.getKeyChar() + "..." + KeyEvent.getKeyText(e.getKeyCode()) + "..." + e.getKeyCode());*/
			}
			public void keyReleased(KeyEvent e) {}
		});
	}
}