/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package runable;

public class tuyen3 implements Runnable {
	tuyen1 t1 = new tuyen1();
	public float chuvi;
	public tuyen3(tuyen1 t1) {
		this.t1 = t1;
	}

	@Override
	public void run() {
		System.out.println("Khởi tạo tuyến 3!");
			System.out.println("Chờ tuyến 1 nhập dữ liệu - 3!");
	
				chuvi = (t1.a + t1.b) * 2;
		
		
	}
}
