package EnergyKinetik;

class MainKinetik {
    private double massa;
    private double kecepatan;

    // settter
    public void setMassa(double massa) {
        this.massa = massa;
    }

    public void setKecepatan(double kecepatan) {
        this.kecepatan = kecepatan;
    }

    // getter
    public double getMassa() {
        return massa;
    }
    
    public double getKecepatan() {
        return kecepatan;
    }

    // metode untuk menghitung energi kinetik
    public double hitungEnergiKinetik() {
        return 0.5 * massa * Math.pow(kecepatan, 2);
    }
}