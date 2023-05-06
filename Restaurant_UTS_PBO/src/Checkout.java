import java.util.Scanner;
public class Checkout {
    static float totalOmset = 0;
    static float totalBiayaProduksi = 0;
    static float gajiKaryawan = 0;
    static float pajak = 0;
    static float totalKeuntungan = 0;
public Checkout(){
    totalOmset = Appetizer.harga + MainCourse.harga + Dessert.harga;
    totalBiayaProduksi = 0.25f * totalOmset;
    gajiKaryawan = 0.5f * totalBiayaProduksi;
    pajak = 0.1f * totalOmset;
    totalKeuntungan = totalOmset - totalBiayaProduksi - pajak - gajiKaryawan;
    System.out.println("Total Omset Penjualan: " + totalOmset);
    System.out.println("Gaji Karyawan dan Biaya Fasilitas Pendukung: " + gajiKaryawan);
    System.out.println("Biaya Produksi: " + totalBiayaProduksi);
    System.out.println("Biaya Pajak: " + pajak);
    System.out.println("Hasil Laba/Keuntungan Bersih : totalOmset - BiayaProduksi -  Pajak - Gaji karyawan dan Fasilitas pendukung = " + totalKeuntungan);
    Main.Menu();
}
}
