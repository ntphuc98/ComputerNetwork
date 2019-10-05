package runable;

import java.util.logging.Level;
import java.util.logging.Logger;

public class LuongTongNguyenTo extends LuongDuLieu implements Runnable {
	LuongDuLieu ldl = new LuongDuLieu();

	@Override
	public void run() {

		try {
			boolean kt = true;
			while (kt == true) {
				if (ldl.getTong() == 0) {
					System.out.println("Đợi luồng nguyen to tính!");
				} else {
					System.out.println("SUM: " + ldl.getTong());
					if (ldl.getI() == 1000)
						kt = false;
					Thread.sleep(1000);
				}
			}

		} catch (InterruptedException ex) {
			Logger.getLogger(LuongTongNguyenTo.class.getName()).log(Level.SEVERE, null, ex);
		}
	}

}
