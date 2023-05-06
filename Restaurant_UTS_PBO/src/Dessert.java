import java.util.Scanner;
public class Dessert{
    public static float harga;
    public void Show(){
        System.out.println("This is Dessert Menu");
    }
    
    public void Kuantitas(int indeks){
       Scanner input = new Scanner(System.in);
       System.out.println("Mau Beli Berapa Banyak ? : ");
       int kuantitas = input.nextInt();
       harga+=1.25*biayaProduksi[indeks]*kuantitas;
       switch(indeks){
           case 0:
               Sold.KuantitasIceCream = Sold.KuantitasIceCream+kuantitas;
               break;
           case 1:
               Sold.KuantitasCrepes = Sold.KuantitasCrepes+kuantitas;
               break;
           case 2:
               Sold.KuantitasPancake = Sold.KuantitasPancake+kuantitas;
               break;
           case 3:
               Sold.KuantitasWaffle = Sold.KuantitasWaffle+kuantitas;
               break;
           case 4:
               Sold.KuantitasChurros = Sold.KuantitasChurros+kuantitas;
               break;
       }
    }
    
    //Harga Modal
    int icecream = 40000;
    int crepes = 30000;
    int pancake = 50000;
    int waffle = 50000;
    int churros = 40000;
            
    int[] biayaProduksi = new int[] {icecream,crepes,pancake,waffle,churros};
    public void Menu(){
        Scanner input = new Scanner(System.in);  // Create a Scanner object

        System.out.println(
                "Pilih Dessert:" +
                "\n1.Ice Cream  Rp " + 1.25*biayaProduksi[0] +
                "\n2.Crepes     Rp " + 1.25*biayaProduksi[1] +
                "\n3.Pancake    Rp " + 1.25*biayaProduksi[2] +
                "\n4.Waffle     Rp " + 1.25*biayaProduksi[3] +
                "\n5.Churros     Rp " + 1.25*biayaProduksi[4] +
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
