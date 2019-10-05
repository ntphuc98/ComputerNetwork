/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package runable;

/**
 *
 * @author DELL
 */
public class Luongchinh {

	/**
	 * @param args the command line arguments
	 */

	public static void main(String[] args) {
		LuongNguyenTo lnt = new LuongNguyenTo();
		LuongTongNguyenTo ltnt = new LuongTongNguyenTo();
		Thread t1 = new Thread(lnt);
		Thread t2 = new Thread(ltnt);
		t1.setPriority(Thread.MAX_PRIORITY);
		t2.setPriority(Thread.MIN_PRIORITY);
		t1.start();
		LuongDuLieu dl = new LuongDuLieu();
		t2.start();

	}

}
