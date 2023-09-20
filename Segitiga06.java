package jobsheet3;
import java.util.Scanner;

public class Segitiga06 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int alas, tinggi;
    float luas;
    System.out.print("masukan alas: ");
    alas = sc.nextInt();
    System.out.print("Masukan tinnggi ");
    tinggi = sc.nextInt();
    luas = alas * tinggi / 2;
    System.out.println("Luas segitiga: " + luas);

    }
    
}
