/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package runable;

import java.util.logging.Level;
import java.util.logging.Logger;

public class tuyen2 extends tuyen1 implements Runnable {
	tuyen1 t1 = new tuyen1();
	Thread tt1 = new Thread(t1);

	public void setDientich(int dientich) {
		this.dientich = dientich;
	}

	public int dientich = 0;

	public int getDientich() {
		return dientich;
	}

	@Override
	public void run() {
		System.out.println("Khởi tạo tuyến 2!");
		synchronized (tt1) {
			for (;;) {
				if (t1.getA() != 0 && t1.getB() != 0) {
					dientich = t1.getA() * t1.getB();
					break;
				} else {
					System.out.println("Chờ tuyến 1 nhập dữ liệu-2!");
					try {
						Thread.sleep(1000);
					} catch (InterruptedException ex) {
						Logger.getLogger(tuyen2.class.getName()).log(Level.SEVERE, null, ex);
					}
				}
			}
		}
	}

}
