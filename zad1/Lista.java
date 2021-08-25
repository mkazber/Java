import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class Lista {
    ArrayList<Osoba> kobiety;
    ArrayList<Osoba> mezczyzni;

    Lista() {
        kobiety = new ArrayList<>();
        mezczyzni = new ArrayList<>();
    }

    void wczytajPlik(String nazwa) {
        String tab[] = new String[2];
        String temp;
        Scanner in = null;
        try {
            in = new Scanner(new File(nazwa));
        } catch (FileNotFoundException e) {
            System.out.println("No nie dziala");
        }
        while (in.hasNext()) {
            temp = in.nextLine();
            tab = temp.split(" ");
            Osoba ludzik = new Osoba(tab[0], tab[1]);
            dodaj(ludzik);


        }

        in.close();
    }

    void dodaj(Osoba o) {
        if (o.plec()) mezczyzni.add(o);
        else kobiety.add(o);
    }

    public String toString() {
        String temp = "Kobiety: \n";

        for (Osoba k : kobiety)
            temp += k;

        temp += "\nMezczyzni: \n";
        for (Osoba m : mezczyzni)
            temp += m;

        return temp;
    }

    void posortuj() {
        Collections.sort(kobiety);
        Collections.sort(mezczyzni);
    }
}