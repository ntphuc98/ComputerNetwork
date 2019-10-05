package runable;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class thu {
	public static int m = 1, k = 0;
	public static int[] arr = new int[10];
	public static int n, a, b;
	public static File f = new File("d:/innguyento.txt");

	public void sortASC(int[] arr) {
		int temp = arr[0];
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
					temp = arr[j];
					arr[j] = arr[i];
					arr[i] = temp;
				}
			}
		}
	}

	public static boolean isPrimeNumber(int n) {
		if (n < 2) {
			return false;
		}
		int squareRoot = (int) Math.sqrt(n);
		for (int i = 2; i <= squareRoot; i++) {
			if (n % i == 0) {
				return false;
			}
		}
		return true;
	}

	public void luong1() throws IOException {
		FileWriter fw = new FileWriter(f);
		for (int i = a; i < a + n; i++) {
			try {
				m++;
				if (isPrimeNumber(i)) {
					fw.write(i + " ");
					System.out.println("luong 1: " + i);
					Thread.sleep(2000);
				}

			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

	}

	public void luong2() throws IOException {
		FileWriter fw = new FileWriter(f);
		for (int i = a + n; i < b - n; i++) {
			try {
				m++;
				if (isPrimeNumber(i)) {
					fw.write(i + " ");
					System.out.println("luong 2: " + i);
					Thread.sleep(2000);
				}

			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

	}

	public void luong3() throws IOException {

		FileWriter fw = new FileWriter(f);
		for (int i = b - n; i <= b; i++) {
			try {
				m++;
				if (isPrimeNumber(i)) {
					fw.write(i);
					System.out.println("luong 3: " + i);
					Thread.sleep(2000);
				}

			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int dem = 0;
		int[] mang = new int[20];
		a = sc.nextInt();
		b = sc.nextInt();
		n = (b - a) / 3;
		thu in = new thu();
		Thread t1 = new Thread(new Runnable() {

			public void run() {
				try {
					in.luong1();
				} catch (IOException ex) {
					Logger.getLogger(thu.class.getName()).log(Level.SEVERE, null, ex);
				}

			}
		});
		Thread t2 = new Thread(new Runnable() {

			public void run() {
				try {
					in.luong2();
				} catch (IOException ex) {
					Logger.getLogger(thu.class.getName()).log(Level.SEVERE, null, ex);
				}

			}
		});
		Thread t3 = new Thread(new Runnable() {

			public void run() {
				try {
					in.luong3();
				} catch (IOException ex) {
					Logger.getLogger(thu.class.getName()).log(Level.SEVERE, null, ex);
				}

			}
		});
		t1.start();
		t2.start();
		t3.start();
		if (m == (b - a) + 1) {
			try {

				FileInputStream fis = new FileInputStream("d:/innguyento.txt");
				Scanner input = new Scanner(fis, "UTF-8");
				while (input.hasNextLine()) {
					String line = input.nextLine();
					dem++;
					mang[dem] = Integer.parseInt(line);
				}
				fis.close();
				input.close();
				in.sortASC(mang);
				File f = new File("d:/innguyento.txt");
				FileWriter fw = new FileWriter(f);
				for (int i = 0; i < mang.length; i++) {
					fw.write(mang[i]);
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}
