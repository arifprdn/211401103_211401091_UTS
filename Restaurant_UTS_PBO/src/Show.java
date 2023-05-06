public class Show {
    public Show(){
        float JumlahPengunjungDiharapkan = Checkout.totalOmset / Checkout.totalKeuntungan;
        System.out.println("Jumlah Pengunjung Diharapkan: " + Math.round(JumlahPengunjungDiharapkan));
        System.out.println("Jumlah Pengunjung: " + Main.jumlahPengunjung);
        System.out.println("Total Keuntungan: " + Checkout.totalKeuntungan);
        Main.Menu();
    }
}
