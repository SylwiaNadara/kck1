
import java.util.Date;
import java.util.Random;

public class Informacje {
    private int nrpsa;
    private String imie;
    private int wiek;
    private String rasa;
    private String kolorSiersci;
    private String plec;
    private double waga;
    private String rodzajSiersci;
    private String wielkosc;
    private Date dataPrzyjeciaDoSchroniska;

    public Informacje(int nrpsa, String imie, int wiek, String rasa, String kolorSiersci,
                      String plec, double waga, String rodzajSiersci, String wielkosc, Date dataPrzyjeciaDoSchroniska) {
        this.nrpsa=nrpsa;
        this.imie = imie;
        this.wiek = wiek;
        this.rasa = rasa;
        this.kolorSiersci = kolorSiersci;
        this.plec = plec;
        this.waga = waga;
        this.rodzajSiersci = rodzajSiersci;
        this.wielkosc = wielkosc;
        this.dataPrzyjeciaDoSchroniska = dataPrzyjeciaDoSchroniska;
    }


    // Metody dostępowe (getters) dla wszystkich atrybutów


    public int getNrpsa(){
        return nrpsa;
    }
    public String getImie() {
        return imie;
    }

    public int getWiek() {
        return wiek;
    }

    public String getRasa() {
        return rasa;
    }

    public String getKolorSiersci() {
        return kolorSiersci;
    }

    public String getPlec() {
        return plec;
    }

    public double getWaga() {
        return waga;
    }

    public String getRodzajSiersci() {
        return rodzajSiersci;
    }

    public String getWielkosc() {
        return wielkosc;
    }

    public Date getDataPrzyjeciaDoSchroniska() {
        return dataPrzyjeciaDoSchroniska;
    }
}

