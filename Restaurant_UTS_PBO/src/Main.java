import java.util.Scanner;
public class Main {
    static Scanner input = new Scanner(System.in);  // Create a Scanner object
    static int jumlahPengunjung=0;
    public static void Menu(){
        System.out.println("\n--- Halo Selamat Datang di Program Restoran ---\n");
        System.out.print("Silakan Pilh Menu:\n1. Pesan Makanan\n2. Perhitungan Hari ini\n3. Keuntungan\n4. Produk Terjual\n5. Keluar\nPilih: ");
        int pilihan = input.nextInt();

        switch (pilihan){
            case 1:
                jumlahPengunjung++;
                new Order();
                break;
            case 2: new Checkout();

                break;
            case 3: new Show();
                break;
            case 4: new Sold();
                break;
            default:
                break;
        }
    }
    public static void main(String[] args) {
        Menu();
    }
}