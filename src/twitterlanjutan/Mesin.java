package twitterlanjutan;

import java.util.Map;

public class Mesin {
    private Map<String, Integer> jenisMakanan;
    private Map<String, Integer> stokMakanan;

    public Mesin() {
    }

    public Map<String, Integer> getJenisMakanan() {
        return jenisMakanan;
    }

    public void setJenisMakanan(Map<String, Integer> jenisMakanan) {
        this.jenisMakanan = jenisMakanan;
    }

    public Map<String, Integer> getStokMakanan() {
        return stokMakanan;
    }

    public void setStokMakanan(Map<String, Integer> stokMakanan) {
        this.stokMakanan = stokMakanan;
    }

    public Mesin(Map<String, Integer> jenisMakanan, Map<String, Integer> stokMakanan) {
        this.jenisMakanan = jenisMakanan;
        this.stokMakanan = stokMakanan;
    }
}
