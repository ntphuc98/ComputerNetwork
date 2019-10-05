/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package runable;

import static java.lang.Thread.MAX_PRIORITY;
import java.util.Random;

public class LuongChinh {
//    public static int i;
	/**
	 * @param args the command line arguments
	 */
	public static void main(String[] args) throws InterruptedException {
		// TODO code application logic here
		System.out.println("---START--");
		Luong1 l1 = new Luong1();
		Luong2 l2 = new Luong2();
		Thread t1 = new Thread(l1);
//        t1.setPriority(MAX_PRIORITY);
		t1.start();
		Thread t2 = new Thread(l2);
		t2.start();
//		System.out.println("--END--");
	}
}
