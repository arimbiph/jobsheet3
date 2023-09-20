package jobsheet3;

/**
 * ContohVariabel06
 */
public class ContohVariabel06 {

    public static void main(String[] args) {
        String hobisaya = "Menonton drama korea";
        boolean isPandai = true;
        char jenisKelamin ='P';
        byte umursaya = 19;
        double $ipk = 3.5, tinggi = 160;

        System.out.println(hobisaya);
        System.out.println("Apakah Pandai? " + isPandai);
        System.out.println("Jenis kelamin: " + jenisKelamin);
        System.out.println("IPK: " + $ipk);
        System.out.println(String.format("Saya berumur %s dengan tinggi badan %s", umursaya, tinggi));

    }
}