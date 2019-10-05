package runable;

import java.util.logging.Level;
import java.util.logging.Logger;

public class LuongNguyenTo extends LuongDuLieu implements Runnable {
	LuongDuLieu ldl = new LuongDuLieu();

	@Override
	public void run() {
		try {

			for (int i = 1; i <= 1000; i++) {
				boolean kt = true;
				if (i < 2) {
					kt = false;
				}
				{
					for (int j = 2; j <= Math.sqrt(i); j++) {
						if (i % j == 0) {
							kt = false;
							break;
						}
					}
				}
				if (kt == true) {

					ldl.setSnt(i);
					System.out.println("So-Nguyen-To: " + ldl.getSnt());
					ldl.setTong(ldl.getTong() + i);
					Thread.sleep(1001);
				}

				ldl.setI(i);
			}

		} catch (InterruptedException ex) {
			Logger.getLogger(LuongNguyenTo.class.getName()).log(Level.SEVERE, null, ex);
		}
	}

}
