/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package runable;

public class tuyen2 implements Runnable {
	tuyen1 t1 = new tuyen1();
	public float dientich;

	public tuyen2(tuyen1 t1) {
		this.t1 = t1;
	}

	@Override
	public void run() {
		System.out.println("Khởi tạo tuyến 2!");
		
			System.out.println("Chờ tuyến 1 nhập dữ liệu - 2!");

			dientich = t1.a * t1.b;

			System.out.println("Done - 2!");
		
	}

}
