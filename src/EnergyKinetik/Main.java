package EnergyKinetik;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        MainKinetik kinetik = new MainKinetik();
        
        double massa;
        do {
            // input massa
            System.out.print("Masukkan massa (kg): ");
            massa = scanner.nextDouble();
            if (massa <= 0) {
                System.out.println("Massa harus lebih dari 0! Silakan masukkan kembali.");
            }
        } while (massa <= 0);
        kinetik.setMassa(massa);
        
        double kecepatan;
        do {
            // input kecepatan
            System.out.print("Masukkan kecepatan (m/s): ");
            kecepatan = scanner.nextDouble();
            if (kecepatan <= 0) {
                System.out.println("Kecepatan harus lebih dari 0! Silakan masukkan kembali.");
            }
        } while (kecepatan <= 0);
        kinetik.setKecepatan(kecepatan);
         
        // menampilkan hasil perhitungan
        System.out.println("Energi Kinetik: " + kinetik.hitungEnergiKinetik() + " Joule");
        scanner.close();
    }
}
