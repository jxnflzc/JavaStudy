package main;

public class ThreadDemo {
	public static void main(String[] main) {
		//5个窗口共同售票
		Ticket t = new Ticket();
		Thread t1 = new Thread(t);
		Thread t2 = new Thread(t);
		Thread t3 = new Thread(t);
		Thread t4 = new Thread(t);
		Thread t5 = new Thread(t);
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		t5.start();
	}
}

class Ticket implements Runnable/*extends Thread*/{
	private int tickets = 1000;
	public void run() {
		while(true) {
			show();
			if(tickets == 0) {
				break;
			}
		}
	}
	public synchronized void show() {
		if(tickets > 0) {
			try {
				Thread.sleep(1);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(Thread.currentThread().getName() + "Sale:" + (tickets--));
		}
	}
}
