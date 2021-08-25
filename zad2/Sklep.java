

import java.util.ArrayList;

public class Sklep {

    ArrayList<Towar> towary_krajowe = new ArrayList<Towar>();
    ArrayList<Towar> towary_z_importu = new ArrayList<Towar>();

    String pl = "590";

    void dodaj(Towar o) {
        if(o.kod_kreskowy.substring(0,3).equals(pl)) towary_krajowe.add(o);
        else towary_z_importu.add(o);
    }
    void wypisz() {
        for(int i = 0; i < towary_krajowe.size(); i++)
        {
            System.out.println("Jestem z Polski " + towary_krajowe.get(i).toString());
        }
        for(int i = 0; i < towary_z_importu.size(); i++)
        {
            System.out.println("Jestem z importu " + towary_z_importu.get(i).toString());
        }
    }
    float bilans() {
        float sum = 0;
        for(int i = 0; i < towary_krajowe.size(); i++)
        {
            sum += towary_krajowe.get(i).cena;
        }
        for(int i = 0; i < towary_z_importu.size(); i++)
        {
            sum += towary_z_importu.get(i).cena;
        }
        System.out.println("Wartosc wszystkich produktow: " + sum);

        return sum;
    };
}


