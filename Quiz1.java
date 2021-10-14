//Fakhita Nur Aziza

import java.util.Scanner;
public class Quiz1 {
	public static void main (String[] args){
		Scanner input = new Scanner (System.in);
		String nama;
		int tipe, meteran, bayar, total, kembali;
		
		System.out.println("Tipe 31 : Rp 100,000");
		System.out.println("Tipe 32 : Rp 125,000");
		System.out.println("Tipe 33 : Rp 450,000");
		System.out.println("Tipe 34 : Rp 480,000");
		System.out.println("Tipe 35 : Rp 500,000");
		System.out.println("Tipe 40 : Rp 550,000");
		
		System.out.print("Nama : "); nama = input.nextLine();
		System.out.print("Tipe Rumah : "); tipe = input.nextInt();
		System.out.print("Jumlah Meteran Pemakaian : "); meteran = input.nextInt();
		System.out.print("Total Bayar : Rp "); bayar = input.nextInt();
		total = 0;
		
		switch (tipe) {
			case 31 : total = meteran * 100000; break;
			case 32 : total = meteran * 125000; break;
			case 33 : total = meteran * 450000; break;
			case 34 : total = meteran * 480000; break;
			case 35 : total = meteran * 500000; break;
			case 40 : total = meteran * 550000; break;
			default : System.out.println("Tipe Rumah Tidak Ditemukan");
		}
		
		kembali=total - bayar;
		System.out.println("Kembalian : Rp " +kembali);
		
	}
}