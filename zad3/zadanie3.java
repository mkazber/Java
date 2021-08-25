import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class zadanie3 {

    public static void main(String[] args)
    {
        ArrayList<Osoba1> lista= new ArrayList<>();
        lista.add(new Osoba1("92862300132","gowno"));
        lista.add(new Osoba1("94112300122","debil"));
        lista.add(new Osoba1("95051303192","Marek"));
        lista.add(new Osoba1("95051300172","Mariusz"));
        lista.add(new Osoba1("95051300132","Adrian"));
        lista.add(new Osoba1("95031300122","Magda"));
        lista.add(new Osoba1("45051300102","siur"));
        lista.add(new Osoba1("95051300192","Franek"));
        lista.add(new Osoba1("95051400102","Ewelina"));
        lista.add(new Osoba1("85051300132","pajac"));

        Collections.sort(lista);                                           // sortowanie po nazwisku
        Collections.sort(lista, new Comparator<Osoba1>() {                 //sortowanie po plci
            @Override
            public int compare(Osoba1 o1, Osoba1 o2) {
                return o1.plec.compareTo(o2.plec);
            }
        });
        Collections.sort(lista, new Comparator<Osoba1>() {                 //sortowanie revers mezczyzn
            @Override
            public int compare(Osoba1 o1, Osoba1 o2) {
                if(o1.plec==1 && o2.plec==1)
                    return -o1.nazwisko.compareTo(o2.nazwisko);
                else return 1;
            }
        });

        System.out.println(lista);


    }
}