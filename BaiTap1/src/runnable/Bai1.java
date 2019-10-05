package runnable;

import java.util.Scanner;

class inSoLe implements Runnable {

	public inSoLe(int n) {
		this.n = n;
	}

	public int n;

	public void run() {

		for (int i = 1; i < n; i++) {
			if (i % 2 != 0) {
				System.out.println("sole:" + i);
				try {
					Thread.sleep(1000);
				} catch (Exception e) {
					// TODO: handle exception
				}
			}
		}
	}

}

class inSoChan implements Runnable {

	public inSoChan(int n) {
		this.n = n;
	}

	public int n;

	public void run() {
		for (int i = 1; i < n; i++) {
			if (i % 2 == 0) {
				System.out.println("so chan: " + i);
				try {
					Thread.sleep(1000);
				} catch (Exception e) {
					// TODO: handle exception
				}
			}
		}

	}

}

class inSo implements Runnable {

	public inSo(int n) {
		this.n = n;
	}

	public int n;

	public void run() {
		for (int i = 1; i <= n; i++) {
			System.out.println("so 1->n:" + i + " ");

			try {
				Thread.sleep(1000);
			} catch (Exception e) {
				// TODO: handle exception
			}
		}

	}

}

class inAcci implements Runnable {

	public void run() {

		System.out.println("\n");
		for (char i = 65; i <= 90; i++) {
			System.out.println("AscII: " + i + " ");

			try {
				Thread.sleep(1000);
			} catch (Exception e) {
				// TODO: handle exception
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

		Thread t1 = new Thread(new inSoLe(n));
		Thread t2 = new Thread(new inSoChan(n));
		Thread t3 = new Thread(new inSo(n));
		Thread t4 = new Thread(new inAcci());

		t1.start();
		t2.start();
		t3.start();
		t4.start();

	}

}