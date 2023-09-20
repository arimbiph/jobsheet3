package jobsheet3;

/**
 * ContohVariabel06
 */
public class ContohVariabel06 {

    public static void main(String[] args) {
        String salahSatuHobiSayaAdalah = "Menonton drama korea";
        boolean isPandai = true;
        char jenisKelamin ='P';
        byte _umurSayaSekarang = 19;
        double $ipk = 3.24, tinggi = 160;

        System.out.println(salahSatuHobiSayaAdalah);
        System.out.println("Apakah Pandai? " + isPandai);
        System.out.println("Jenis kelamin: " + jenisKelamin);
        System.out.println("IPK: " + $ipk);
        System.out.println(String.format("Saya berumur %s dengan tinggi badan %s", _umurSayaSekarang, tinggi));

    }
}