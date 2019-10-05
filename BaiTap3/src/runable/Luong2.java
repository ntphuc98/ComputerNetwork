/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package runable;

import java.util.Random;

public class Luong2 extends data implements Runnable {
	Luong2() {
	}

	data dt = new data();

	@Override

	public void run() {
		try {
			for (;;) {
				if (dt.getRandom() == 0) {
					System.out.println("Đợi luồng random!");
				} else {
					System.out.println("luong2:" + Math.pow(dt.getRandom(), 2));
					Thread.sleep(1000);
				}

			}

		} catch (InterruptedException e) {
			return;
		}
	}
}
