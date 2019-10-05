/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package runable;

import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class tuyen1 implements Runnable {
	Scanner sc = new Scanner(System.in);

	public int getA() {
		return a;
	}

	public int getB() {
		return b;
	}

	public void setA(int a) {
		this.a = a;
	}

	public void setB(int b) {
		this.b = b;
	}

	public static int a = 0, b = 0;

	public void inputAB() {

	}

	@Override
	public synchronized void run() {

		System.out.println("Khởi tạo tuyến 1!");
		for (;;) {
			if (a == 0 || b == 0) {
				System.out.println("Nhap vao chieu dai:");
				a = sc.nextInt();
				System.out.println("Nhap vao chieu rong:");
				b = sc.nextInt();

				try {
					Thread.sleep(1000);
				} catch (InterruptedException ex) {
					Logger.getLogger(tuyen1.class.getName()).log(Level.SEVERE, null, ex);
				}
			} else {
				break;
			}

		}
	}

}
