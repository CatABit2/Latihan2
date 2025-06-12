package latihan2;

public class DataDiri {
    // Atribut
    private String nama;
    private String npm;
    private String kelas;

    // Konstruktor untuk menginisialisasi atribut
    public DataDiri(String nama, String npm, String kelas) {
        this.nama = nama;
        this.npm = npm;
        this.kelas = kelas;
    }

    // Getter dan Setter (optional jika diperlukan)
    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNpm() {
        return npm;
    }

    public void setNpm(String npm) {
        this.npm = npm;
    }

    public String getKelas() {
        return kelas;
    }

    public void setKelas(String kelas) {
        this.kelas = kelas;
    }

    // Method untuk menampilkan data diri
    public void tampilkanData() {
        System.out.println("Nama: " + nama);
        System.out.println("NPM: " + npm);
        System.out.println("Kelas: " + kelas);
    }
}

class DataDiriBerakal {
    public static void main(String[] args) {
        // Membuat objek dengan nama panggilan Anda
        // Misalnya, nama panggilan Anda adalah "Minje"
        DataDiri dataDiriSaya = new DataDiri("M. Aldi Ripandi", "2210010610", "4C-TI");

        // Menjalankan method untuk menampilkan data diri
        dataDiriSaya.tampilkanData();

    }
}
