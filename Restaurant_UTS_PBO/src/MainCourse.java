import java.util.Scanner;
public class MainCourse{
    public static float harga;
    public void Show(){
        System.out.println("This is Main Course Menu");
    }
    
    public void Kuantitas(int indeks){
       Scanner input = new Scanner(System.in);
       System.out.println("Mau Beli Berapa Banyak ? : ");
       int kuantitas = input.nextInt();
       harga+=1.25*biayaProduksi[indeks]*kuantitas;
       switch(indeks){
           case 0:
               Sold.KuantitasPizza = Sold.KuantitasPizza+kuantitas;
               break;
           case 1:
               Sold.KuantitasSpagetti = Sold.KuantitasSpagetti+kuantitas;
               break;
           case 2:
               Sold.KuantitasBurger = Sold.KuantitasBurger+kuantitas;
               break;
           case 3:
               Sold.KuantitasBeefSteak = Sold.KuantitasBeefSteak+kuantitas;
               break;
           case 4:
               Sold.KuantitasLasagna = Sold.KuantitasLasagna+kuantitas;
               break;
       }
    }
    
    //Harga Modal
    int pizza = 80000;
    int spagetti = 50000;
    int burger = 40000;
    int beefsteak = 120000;
    int lasagna = 60000;
            
    int[] biayaProduksi = new int[] {pizza,spagetti, burger,beefsteak, lasagna};
    public void Menu(){
        Scanner input = new Scanner(System.in);  // Create a Scanner object

        System.out.println(
                "Pilih Menu Main Course:" +
                "\n1.Pizza       Rp " + 1.25*biayaProduksi[0] +
                "\n2.Spagetti    Rp " + 1.25*biayaProduksi[1] +
                "\n3.Burger      Rp " + 1.25*biayaProduksi[2] +
                "\n4.Beef Steak  Rp " + 1.25*biayaProduksi[3] +
                "\n5.Lasagna     Rp " + 1.25*biayaProduksi[4] +
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
