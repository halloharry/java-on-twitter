package twitter.projeksederhana.model;

public class Karyawan {
    private String username;
    private String password;
    private String nama;
    private String role;
    private double gaji;
    private int absensi;

    public Karyawan() {
    }

    public Karyawan(String username, String password, String nama, String role, double gaji) {
        this.username = username;
        this.password = password;
        this.nama = nama;
        this.role = role;
        this.gaji = gaji;
        this.absensi = 0;
    }

    public void absen() {
        absensi++;
        System.out.println("Absensi berhasil.");
    }

    public void tampilkanInfo() {
        System.out.println("Nama: " + nama);
        System.out.println("Role: " + role);
        System.out.println("Gaji: $" + gaji);
        System.out.println("Total Absensi: " + absensi + " kali");
        System.out.println("-------------");
    }


    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public double getGaji() {
        return gaji;
    }

    public void setGaji(double gaji) {
        this.gaji = gaji;
    }

    public int getAbsensi() {
        return absensi;
    }

    public void setAbsensi(int absensi) {
        this.absensi = absensi;
    }
}
