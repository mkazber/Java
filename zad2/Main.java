
public class Main {


    public static void main(String[] args) {

        Przychodnia p = new Przychodnia();
        Pacjent p1 = new Pacjent("1", "Kuc", 25);
        Pacjent p2 = new Pacjent("2", "Nowak", 56);
        Pacjent p3 = new Pacjent("3", "Kowalski", 19);
        Pacjent p4 = new Pacjent("4", "Karolczyk", 41);
        p.pacjenci.add(p1);
        p.pacjenci.add(p2);
        p.pacjenci.add(p3);
        p.pacjenci.add(p4);

        Lekarz l1 = new Lekarz("10", "Archinski", 8);
        Lekarz l2 = new Lekarz("11", "Gorczyca", 2);
        Lekarz l3 = new Lekarz("12", "Janczyk", 12);
        Lekarz l4 = new Lekarz("13", "Wodnik", 5);
        Lekarz l5 = new Lekarz("14", "House", 3);
        p.lekarze.add(l1);
        p.lekarze.add(l2);
        p.lekarze.add(l3);
        p.lekarze.add(l4);
        p.lekarze.add(l5);

        p.wypisz();
        p.staz();
        p.sr_wieku();
    }
}


