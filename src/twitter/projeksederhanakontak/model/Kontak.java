package twitter.projeksederhanakontak.model;

public class Kontak {
    private String nama;
    private String nomorTelepon;
    private String email;
    private Boolean family;

    public Kontak(String nama, String nomorTelepon, String email, Boolean family) {
        this.nama = nama;
        this.nomorTelepon = nomorTelepon;
        this.email = email;
        this.family = family;
    }

    public Kontak() {
    }

    public Boolean getFamily() {
        return family;
    }

    public void setFamily(Boolean family) {
        this.family = family;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNomorTelepon() {
        return nomorTelepon;
    }

    public void setNomorTelepon(String nomorTelepon) {
        this.nomorTelepon = nomorTelepon;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
