package kazberuk_mateusz_zad2;

import java.util.*;

class Osoba implements Comparable<Osoba> {
	String nazwisko;
	Integer rok;

	Osoba(String n, Integer r) {
		nazwisko = n;
		rok = r;
	}

	@Override
	public String toString() {
		return nazwisko + ' ' + rok;
	}

	@Override
	public int compareTo(Osoba t) {
		int porownaneNazwiska = nazwisko.compareTo(t.nazwisko);

	
			return porownaneNazwiska;
		}
	}



class Lista {
	ArrayList<Osoba> lista = new ArrayList<>();

	void utworz() {
		lista.add(new Osoba("Kaczynski", 1994));
		lista.add(new Osoba("Nowak", 1975));
		lista.add(new Osoba("Kowalski", 1999));
		lista.add(new Osoba("Baran", 1966));
		lista.add(new Osoba("Andruszkiewicz", 1923));
		lista.add(new Osoba("Piekarz", 1943));
		lista.add(new Osoba("Frankowski", 1981));

	}
}

class NowePorownanie implements Comparator<Osoba> {

	@Override
	public int compare(Osoba t, Osoba t1) {
		return t.rok.compareTo(t1.rok);
	}

}

public class Porownanie {

	public static void main(String[] args) {
		Lista l = new Lista();
		l.utworz();
		System.out.println("Bez sortowania: " + "\n" + l.lista);

		Collections.sort(l.lista);
		System.out.println();
		System.out.println("Sortowanie po nazwisku: " + "\n" + l.lista);

		Collections.sort(l.lista, new NowePorownanie());
		System.out.println();
		System.out.println("Sortowanie po dacie: " + "\n" + l.lista);
	}

}
