
public class Pacjent {

    private String id, nazwisko;
    private int wiek;

    public Pacjent(String id, String nazwisko, int wiek) {
        this.id = id;
        this.nazwisko = nazwisko;
        this.wiek = wiek;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }

    public int getWiek() {
        return wiek;
    }

    public void setWiek(int wiek) {
        this.wiek = wiek;
    }

    @Override
    public String toString() {
        return "Pacjent{" +
                "id='" + id + '\'' +
                ", nazwisko='" + nazwisko + '\'' +
                ", wiek=" + wiek +
                '}';
    }

    void wypiszPacjenta()
    {
        System.out.println("Pacjent: " + "\n" + "id: " + id + "\n" + "nazwisko: " + nazwisko + "\n" + "wiek: " + wiek + "\n");
    }
}
