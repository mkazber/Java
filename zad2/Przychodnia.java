
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Przychodnia {

    ArrayList<Pacjent> pacjenci = new ArrayList<Pacjent>();
    ArrayList<Lekarz> lekarze = new ArrayList<Lekarz>();

    void wypisz() {
        for(int i = 0; i < pacjenci.size(); i++) pacjenci.get(i).wypiszPacjenta();
        for(int i = 0; i < lekarze.size(); i++) lekarze.get(i).wypiszLekarza();
    }


    String staz()
    {
        String naj = " ";
        int temp = 0;

        for(int i = 0; i < lekarze.size(); i++)
        {
            int liczba = 0;
            liczba = lekarze.get(i).getStaz_w_zawodzie();
            if(liczba > temp) temp = liczba;
        }

        naj = Integer.toString(temp);
        System.out.println("Staz w zawodzie: " + temp);
        return naj;
    }

    double sr_wieku()
    {
        double sr = 0;
        int suma = 0;
        sr = 0;

        for(int i = 0; i < pacjenci.size(); i++)
        {
            suma += pacjenci.get(i).getWiek();
        }

        sr = suma/pacjenci.size();
        System.out.println("Srednia wieku pacjentow: " + sr);
        return 0;
    }
}