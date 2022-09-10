import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String Nama, Nama_Barang;
        int Jumlah_Barang;
        Double Harga_Beli , Harga_Jual ;

        Scanner input = new Scanner(System.in);

        System.out.print("Masukan nama anda : ");
        Nama = input.nextLine();
        System.out.println("Stok Gudang Input Barang");
        System.out.println("################################");
        System.out.println("Selamat Datang " + Nama ) ;
        System.out.print("Nama Barang : ");
        Nama_Barang = input.nextLine();
        System.out.print("Jumlah Barang : ");
        Jumlah_Barang = input.nextInt();
        System.out.print("Harga Beli : ");
        Harga_Beli = input.nextDouble();
        System.out.print("Harga Jual : ");
        Harga_Jual = input.nextDouble();

        System.out.println("Stock Gudang Rincian Barang");
        System.out.println("################################");
        System.out.println("Nama Barang : " + Nama);
        System.out.println("Jumlah Barang :" + Jumlah_Barang);
        System.out.printf("Harga Beli : Rp." + "%.2f\n", Harga_Beli);
        System.out.printf("Harga Jual : Rp." + "%.2f\n", Harga_Jual);
    }
}