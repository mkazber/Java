public class Lekarz {

    private String id, naziwsko;
    private int staz_w_zawodzie;

    public Lekarz(String id, String naziwsko, int staz_w_zawodzie) {
        this.id = id;
        this.naziwsko = naziwsko;
        this.staz_w_zawodzie = staz_w_zawodzie;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNaziwsko() {
        return naziwsko;
    }

    public void setNaziwsko(String naziwsko) {
        this.naziwsko = naziwsko;
    }

    public int getStaz_w_zawodzie() {
        return staz_w_zawodzie;
    }

    public void setStaz_w_zawodzie(int staz_w_zawodzie) {
        this.staz_w_zawodzie = staz_w_zawodzie;
    }

    void wypiszLekarza()
    {
        System.out.println("Lekarz: " + "\n" + "id: " + id + "\n" + "nazwisko: " + naziwsko + "\n" + "staz w zawodzie: " + staz_w_zawodzie + "\n");
    }
}

