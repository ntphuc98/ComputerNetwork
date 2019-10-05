package runable;

import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class tuyen1 {
	Scanner sc = new Scanner(System.in);
	public static int a = 0, b = 0;

	public synchronized void nhap() {
		System.out.println("Khởi tạo tuyến 1!");
		try {
			Thread.sleep(9000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		for (;;) {
			if (a == 0 || b == 0) {
				System.out.println("Nhap vao chieu dai:");
				a = sc.nextInt();
				System.out.println("Nhap vao chieu rong:");
				b = sc.nextInt();
				notifyAll();
			} else {
				break;
			}

		}
	}

}
