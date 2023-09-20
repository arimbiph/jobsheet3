package jobsheet3;

    import java.util.Scanner;

public class TugasKelompokCantik {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);

        System.out.print("Masukkan nilai Matematika: ");
        double nilai_Matematika;
        System.out.print("Masukkan nilai Bahasa Indonesia: ");
        double nilai_BahasaIndonesia;
        System.out.print("Masukkan nilai Bahasa Inggris: ");
        double nilai_BahasaInggris;
        System.out.print("Masukkan nilai Kimia: ");
        double nilai_Kimia;
        System.out.print("Masukkan nilai Fisika: ");
        double nilai_Fisika;
        double rata_rata;


 nilai_Matematika = input.nextDouble();
        nilai_BahasaIndonesia = input.nextDouble();
        nilai_BahasaInggris = input.nextDouble();
        nilai_Kimia = input.nextDouble();
        nilai_Fisika = input.nextDouble();
        rata_rata = nilai_Matematika + nilai_BahasaIndonesia + nilai_BahasaInggris + nilai_Kimia + nilai_Kimia / 5;

        System.out.println("Nilai Matematika: " + nilai_Matematika);
        System.out.println("Nilai Bahasa Indonesia: " + nilai_BahasaIndonesia);
        System.out.println("Nilai Bahasa Inggris: " + nilai_BahasaInggris);
        System.out.println("Nilai Kimia: " + nilai_Kimia);
        System.out.println(" Nilai Fisika: + nilai_Fisika");
        System.out.println("Rata rata nilai: " + rata_rata);

} 
}
