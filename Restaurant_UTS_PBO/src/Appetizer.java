import java.util.Scanner;
public class Appetizer{
    public static float harga;
    public void Show(){
        System.out.println("This is Appetizer Menu");
    }
    
    public void Kuantitas(int indeks){
       Scanner input = new Scanner(System.in);
       System.out.println("Mau Beli Berapa Banyak ? : ");
       int kuantitas = input.nextInt();
       harga+=1.25*biayaProduksi[indeks]*kuantitas;
       switch(indeks){
           case 0:
               Sold.KuantitasSalad = Sold.KuantitasSalad+kuantitas;
               break;
           case 1:
               Sold.KuantitasCanape = Sold.KuantitasCanape+kuantitas;
               break;
           case 2:
               Sold.KuantitasPudding = Sold.KuantitasPudding+kuantitas;
               break;
           case 3:
               Sold.KuantitasGorengan = Sold.KuantitasGorengan+kuantitas;
               break;
           case 4:
               Sold.KuantitasDimsum = Sold.KuantitasDimsum+kuantitas;
               break;
       }
    }
    
    //Harga Modal
    int salad = 30000;
    int canape = 35000;
    int pudding = 30000;
    int gorengan = 28000;
    int dimsum = 40000;
            
    int[] biayaProduksi = new int[] {salad,canape,pudding,gorengan,dimsum};
    public void Menu(){
        Scanner input = new Scanner(System.in);  // Create a Scanner object

        System.out.println(
                "Pilih Menu Makanan:" +
                "\n1.Salad      Rp " + 1.25*biayaProduksi[0] +
                "\n2.Canape     Rp " + 1.25*biayaProduksi[1] +
                "\n3.Pudding    Rp " + 1.25*biayaProduksi[2] +
                "\n4.Gorengan   Rp " + 1.25*biayaProduksi[3] +
                "\n5.Dimsum     Rp " + 1.25*biayaProduksi[4] +
                "\n6.Kembali");
        System.out.print("\nPilih:");
        int pilihan = input.nextInt();
        switch(pilihan){
            case 1:
                Kuantitas(0);
                Menu();
                break;
            case 2:
                Kuantitas(1);
                Menu();
                break;
            case 3:
                Kuantitas(2);
                Menu();
                break;
            case 4:
                Kuantitas(3);
                Menu();
                break;
            case 5:
                Kuantitas(4);
                Menu();
                break;
            case 6:
                new Order();
                break;
            default:
                System.out.print("Pilihan Salah!");
                Menu();
                break;
        }
    }
}
