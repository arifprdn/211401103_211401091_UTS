public class Show {
    public Show(){
        System.out.println("Jumlah Pengunjung Diharapkan: " + (Checkout.totalKeuntungan * 0.25f));
        System.out.println("Jumlah Pengunjung: " + Main.jumlahPengunjung);
        System.out.println("Total Keuntungan: " + Checkout.totalKeuntungan);
        Main.Menu();
    }
}
