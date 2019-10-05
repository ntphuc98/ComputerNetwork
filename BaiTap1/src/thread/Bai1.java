package thread;

import java.util.Scanner;

class SoLe extends Thread{
	int n;
	public SoLe(int n) {
		this.n = n;
	}
	public void run(){
		for(int i = 0; i < n ; i++) {
			if (i % 2 != 0 ) {
				System.out.println("Số lẻ:" + i);
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}				
			}
		}
	}
}
class SoChan extends Thread{
	int n;
	public SoChan(int n) {
		this.n = n;
	}
	public void run() {
		for(int i = 0; i < n ; i++) {
			if (i % 2 == 0 ) {
				System.out.println("Số chẵn:" + i);
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}	
			}
		}
	}
}
class OneToN extends Thread{
	int n;
	public OneToN(int n) {
		this.n = n;
	}
	public void run() {
		for(int i = 1; i <= n ; i++) {
			System.out.println("Số từ 1 đến n:" + i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}	
		}
	}
}
class UpperCase extends Thread{
	public void run() {
		for(int i = 65; i <= 90 ; i++) {
			System.out.println("AscII: " + (char) i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}	
		}
	}
}
public class Bai1 {
	public static void main(String[] args) {
		int n;
		Scanner sc = new Scanner(System.in);
        System.out.println("Nhap vao n:");
        n = sc.nextInt();
		
		SoLe soLe = new SoLe(n);
		SoChan soChan = new SoChan(n);
		OneToN onToN = new OneToN(n);
		UpperCase upperCase = new UpperCase();
		
		soLe.start();
		soChan.start();
		onToN.start();
		upperCase.start();
	}
}
