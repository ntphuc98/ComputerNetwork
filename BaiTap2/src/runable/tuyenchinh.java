/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package runable;

public class tuyenchinh extends tuyen1 {

	public static void main(String[] args) throws InterruptedException {
		tuyen1 t1 = new tuyen1();
		tuyen2 t2 = new tuyen2();
		tuyen3 t3 = new tuyen3();
		Thread tt1 = new Thread(t1);
		Thread tt2 = new Thread(t2);
		Thread tt3 = new Thread(t3);

		tt1.start();
		tt1.join();
		tt2.start();
		tt3.start();

		for (;;) {
			if (t2.getDientich() != 0) {
				System.out.println("Diện tích hình chữ nhật:" + t2.getDientich());
				break;
			} else {
				System.out.println("Chờ tính toán dt!");
				Thread.sleep(1000);
			}
		}
		for (;;) {

			if (t3.getChuvi() != 0) {
				System.out.println("Chu vi hình chữ nhật:" + t3.getChuvi());
				break;
			} else {
				System.out.println("Chờ tính toán cv!");
				Thread.sleep(1000);
			}
		}

	}

}
