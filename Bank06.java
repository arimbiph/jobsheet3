package jobsheet3;
import java.util.Scanner;

public class Bank06 {
    public static void main(String[] args) {
    double tabunganAwal, tabunganAkhir, bunga, persentaseBunga;
    int lamaMenabung;
    persentaseBunga = 0.0002;
    Scanner sc = new Scanner(System.in);
    System.out.print("Masukkan jumlah tabungan awal: ");
    tabunganAwal = sc.nextInt();
    System.out.print("Masukkan lama menabung (bulan): ");
    lamaMenabung = sc.nextInt();
    
    bunga = persentaseBunga * lamaMenabung * tabunganAwal;
    tabunganAkhir = tabunganAwal + bunga;
    
    System.out.println("Bunga: " + bunga);
    System.out.println("Tabungan akhir: " + tabunganAkhir);

    }
    
}
