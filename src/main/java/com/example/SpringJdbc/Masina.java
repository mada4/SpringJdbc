package com.example.SpringJdbc;

public class Masina {
    private String Nr_inmatriculare;
    private String Marca;
    private int An_fabricatie;
    private String Culoare;
    private int Nr_kilometri;

    public Masina() {}

    public Masina(String Nr_inmatriculare, String Marca, int An_fabricatie, String Culoare, int Nr_kilometri) {
        this.Nr_inmatriculare = Nr_inmatriculare;
        this.Marca = Marca;
        this.An_fabricatie = An_fabricatie;
        this.Culoare = Culoare;
        this.Nr_kilometri = Nr_kilometri;
    }

    public String getNr_inmatriculare() {
        return Nr_inmatriculare;
    }

    public String getMarca() {
        return Marca;
    }

    public int getAn_fabricatie() {
        return An_fabricatie;
    }

    public String getCuloare() {
        return Culoare;
    }

    public int getNr_kilometri() {
        return Nr_kilometri;
    }

    public void setNr_inmatriculare(String nr_inmatriculare) {
        Nr_inmatriculare = nr_inmatriculare;
    }

    public void setMarca(String marca) {
        Marca = marca;
    }

    public void setAn_fabricatie(int an_fabricatie) {
        An_fabricatie = an_fabricatie;
    }

    public void setCuloare(String culoare) {
        Culoare = culoare;
    }

    public void setNr_kilometri(int nr_kilometri) {
        Nr_kilometri = nr_kilometri;
    }

    @Override
    public String toString() {
        return "Masina{" +
                "Nr_inmatriculare='" + Nr_inmatriculare + '\'' +
                ", Marca='" + Marca + '\'' +
                ", An_fabricatie=" + An_fabricatie +
                ", Culoare='" + Culoare + '\'' +
                ", Nr_kilometri=" + Nr_kilometri +
                '}';
    }
}
