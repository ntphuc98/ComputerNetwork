/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package runable;

public class tuyenchinh extends Thread {

	public void run() {
		
	}

	public static void main(String[] args) throws InterruptedException {
		tuyen1 t1 = new tuyen1();
		tuyen2 t2 = new tuyen2(t1);
		tuyen3 t3 = new tuyen3(t1);
		
		Thread tt2 = new Thread(t2);
		Thread tt3 = new Thread(t3);
//		tuyenchinh tc = new tuyenchinh();

		tt2.start();
		tt3.start();
//		tc.start();



	}

}
