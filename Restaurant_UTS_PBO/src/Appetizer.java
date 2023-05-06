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
           case 5:
               Sold.KuantitasMojito = Sold.KuantitasMojito+kuantitas;
               break;
           case 6:
               Sold.KuantitasBlueOcean= Sold.KuantitasBlueOcean+kuantitas;
               break;
           case 7:
               Sold.KuantitasLycheeBreeze= Sold.KuantitasLycheeBreeze+kuantitas;
               break;
           case 8:
               Sold.KuantitasColaFloat = Sold.KuantitasColaFloat+kuantitas;
               break;
           case 9:
               Sold.KuantitasMilkTea = Sold.KuantitasMilkTea+kuantitas;
               break;
           case 10:
           Sold.KuantitasOrangeJuice = Sold.KuantitasOrangeJuice+kuantitas;
           break;
       }
    }
    
    //Harga Modal
    int salad = 30000;
    int canape = 35000;
    int pudding = 30000;
    int gorengan = 28000;
    int dimsum = 40000;
    int mojito = 30000;
    int blueocean = 30000;
    int lycheebreeze = 20000;
    int colafloat = 10000;
    int milktea = 15000;
    int orangejuice = 20000;
            
    int[] biayaProduksi = new int[] {salad,canape,pudding,gorengan,dimsum,mojito, blueocean,lycheebreeze,colafloat,milktea, orangejuice};
    public void Menu(){
        Scanner input = new Scanner(System.in);  // Create a Scanner object

        System.out.println(
                "Pilih Menu Makanan:" +
                "\n1.Salad          Rp " + 1.25*biayaProduksi[0] +
                "\n2.Canape         Rp " + 1.25*biayaProduksi[1] +
                "\n3.Pudding        Rp " + 1.25*biayaProduksi[2] +
                "\n4.Gorengan       Rp " + 1.25*biayaProduksi[3] +
                "\n5.Dimsum         Rp " + 1.25*biayaProduksi[4] +
                "\n6.Mojito         Rp " + 1.25*biayaProduksi[5] +
                "\n7.Blue ocean     Rp " + 1.25*biayaProduksi[6] +
                "\n8.Lychee breeze  Rp " + 1.25*biayaProduksi[7] +
                "\n9.Cola Float     Rp " + 1.25*biayaProduksi[8] +
                "\n10.Milk Tea      Rp " + 1.25*biayaProduksi[9] +
                "\n11.Orang Juice   Rp " + 1.25*biayaProduksi[10] +
                "\n12.Kembali");
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
                Kuantitas(5);
                Menu();
                break;
            case 7:
                Kuantitas(6);
                Menu();
                break;
            case 8:
                Kuantitas(7);
                Menu();
                break;
            case 9:
                Kuantitas(8);
                Menu();
                break;
            case 10:
                Kuantitas(9);
                Menu();
                break;
            case 11:
                Kuantitas(10);
                Menu();
                break;
            case 12:
                new Order();
                break;
            default:
                System.out.print("Pilihan Salah!");
                Menu();
                break;
        }
    }
}
