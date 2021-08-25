

public class Towar {
    String kod_kreskowy; // 13 cyfr
    String nazwa;
    float cena;

    public Towar(String kod_kreskowy, String nazwa, float cena) {
        this.kod_kreskowy = kod_kreskowy;
        this.nazwa = nazwa;
        this.cena = cena;
    }

    public String getKod_kreskowy() {
        return kod_kreskowy;
    }

    public void setKod_kreskowy(String kod_kreskowy) {
        this.kod_kreskowy = kod_kreskowy;
    }

    public String getNazwa() {
        return nazwa;
    }

    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }

    public float getCena() {
        return cena;
    }

    public void setCena(float cena) {
        this.cena = cena;
    }

    @Override
    public String toString() {
        return "Sklep{" +
                "kod_kreskowy='" + kod_kreskowy + '\'' +
                ", nazwa='" + nazwa + '\'' +
                ", cena=" + cena +
                '}';
    }
}
