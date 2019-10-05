/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package runable;

import java.util.Random;

public class Luong1 extends data implements Runnable {

	data dt = new data();

	@Override
	public synchronized void run() {
		try {
			for (;;) {
				Random r = new Random();
//                              synchronized (this){                   
				dt.setRandom(1 + r.nextInt(20));
				System.out.println("get:" + dt.getRandom());

//                              }
				Thread.sleep(2000);

			}
		} catch (InterruptedException e) {
			return;
		}
	}

}
