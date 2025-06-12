package latihan2;

public class DataDiri {
    // Atribut
    private String nama;
    private String npm;
    private String kelas;

    public DataDiri(String nama, String npm, String kelas) {
        this.nama = nama;
        this.npm = npm;
        this.kelas = kelas;
    }
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

    public void tampilkanData() {
        System.out.println("Nama: " + nama);
        System.out.println("NPM: " + npm);
        System.out.println("Kelas: " + kelas);
    }
}
class DataDiriBerakal {
    public static void main(String[] args) {
        DataDiri dataDiriSaya = new DataDiri("M. Aldi Ripandi", "2210010610", "4C-TI");

        dataDiriSaya.tampilkanData();

    }
}
