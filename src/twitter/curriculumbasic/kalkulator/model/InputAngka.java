package twitter.curriculumbasic.kalkulator.model;

public class InputAngka {

    private double angkaSatu;
    private double angkaDua;

    public double getAngkaSatu() {
        return angkaSatu;
    }

    public void setAngkaSatu(double angkaSatu) {
        this.angkaSatu = angkaSatu;
    }

    public double getAngkaDua() {
        return angkaDua;
    }

    public void setAngkaDua(double angkaDua) {
        this.angkaDua = angkaDua;
    }

    public InputAngka(double angkaSatu, double angkaDua) {
        this.angkaSatu = angkaSatu;
        this.angkaDua = angkaDua;
    }

    public InputAngka() {
    }
}
