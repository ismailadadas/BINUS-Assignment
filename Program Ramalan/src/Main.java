import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[]args)
    {
        String namaA, namaB;
        int umurA, umurB;
        Scanner input = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Selamat Datang Di Program Ramalan Cupu");
        System.out.println("++++++++++++++++++++++++++++++++++++++");
        System.out.println('\n');

        System.out.println("Data Anda");
        System.out.println("❤❤❤❤❤❤❤❤❤");
        System.out.print("Masukan Nama Anda :");
        namaA = input.nextLine();
        System.out.print("Masukan Umur Anda :");
        umurA = input.nextInt();
        input.nextLine();
        System.out.println();

        System.out.println("Data Pasangan Anda");
        System.out.println("❤❤❤❤❤❤❤❤❤");
        System.out.print("Masukan Nama Pasangan Anda :");
        namaB = input.nextLine();
        System.out.print("Masukan Umur Pasangan Anda :");
        umurB = input.nextInt();
        System.out.println();
        System.out.println("Tekan ENTER Untuk Melihat Hasil Ramalan...");
        breakConsule();

        System.out.println(namaA + " [ " + umurA + " ] Tahun ");
        System.out.println();
        final int size = 3;
        for (int m = 0 ; m < size; m++) {
            for (int n = 0; n < 5 * size; n++) {
                double post1 = Math.sqrt(Math.pow(m - size, 2) + Math.pow(n - size,2 ));
                double post2 = Math.sqrt(Math.pow(m - size, 2) + Math.pow(n - 3* size,2 ));

                if (post1 < size + 0.5 || post2 < size + 0.5) {
                    System.out.print('❤');
                }else {
                    System.out.print(' ');
                }
            }
            System.out.print(System.lineSeparator());
        }
        for (int m = 1; m <= 2 * size; m++){
            for (int n = 0; n < m; n++){
                System.out.print(' ');
            }
            for (int n = 0; n <4 * size + 1 - 2 * m; n++) {
                System.out.print("❤");
            }
            System.out.print(System.lineSeparator());
        }

        System.out.println();
        System.out.println(namaB + " ["+ umurB +"] Tahun ");
        System.out.println();
        double value  = random.nextDouble() * 100;
        while (value < 50);
        value = random.nextDouble() * 100;
        System.out.printf("Kecocokan anda dengan pasangan anda adalah : %.2f\n" , value, "%");
        System.out.println("Terima kasih karena telah menggunakan jasa Ramalan kami..");
        input.close();
    }
    private static void breakConsule() {
        try {
            System.in.read();
        }catch (IOException e) {
            e.printStackTrace();
        }
    }
}