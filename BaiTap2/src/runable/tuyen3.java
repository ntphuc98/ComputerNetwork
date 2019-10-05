/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package runable;

import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class tuyen3 extends tuyen1 implements Runnable {
	tuyen1 t1 = new tuyen1();

	public int getChuvi() {
		return chuvi;
	}

	public void setChuvi(int chuvi) {
		this.chuvi = chuvi;
	}

	public int chuvi = 0;

	@Override
	public void run() {
		System.out.println("Khởi tạo tuyến 3!");
		for (;;) {
			if (t1.getA() != 0 && t1.getB() != 0) {
				chuvi = (t1.getA() + t1.getB()) * 2;
				break;
			} else {
				System.out.println("Chờ tuyến 1 nhập dữ liệu-3!");
				try {
					Thread.sleep(1000);
				} catch (InterruptedException ex) {
					Logger.getLogger(tuyen2.class.getName()).log(Level.SEVERE, null, ex);
				}
			}
		}
	}

}
