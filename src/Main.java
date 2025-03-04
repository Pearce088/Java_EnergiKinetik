import java.util.Scanner;

class MainKinetik {
    private double massa;
    private double kecepatan;

    // Setter
    public void setMassa(double massa) {
        this.massa = massa;
    }

    public void setKecepatan(double kecepatan) {
        this.kecepatan = kecepatan;
    }

    // Getter
    public double getMassa() {
        return massa;
    }

    public double getKecepatan() {
        return kecepatan;
    }

    // Metode untuk menghitung energi kinetik
    public double hitungEnergiKinetik() {
        return 0.5 * massa * Math.pow(kecepatan, 2);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        MainKinetik kinetik = new MainKinetik();
        
        double massa;
        do {
            System.out.print("Masukkan massa (kg): ");
            massa = scanner.nextDouble();
            if (massa <= 0) {
                System.out.println("Massa harus lebih dari 0! Silakan masukkan kembali.");
            }
        } while (massa <= 0);
        kinetik.setMassa(massa);
        
        double kecepatan;
        do {
            // Input kecepatan
            System.out.print("Masukkan kecepatan (m/s): ");
            kecepatan = scanner.nextDouble();
            if (kecepatan <= 0) {
                System.out.println("Kecepatan harus lebih dari 0! Silakan masukkan kembali.");
            }
        } while (kecepatan <= 0);
        kinetik.setKecepatan(kecepatan);
         
        // Menampilkan hasil perhitungan
        System.out.println("Energi Kinetik: " + kinetik.hitungEnergiKinetik() + " Joule");
        scanner.close();
    }
}
