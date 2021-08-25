class Osoba1 implements Comparable<Osoba1>
{
    String pesel;
    String nazwisko;
    Integer plec;

    public Osoba1(String pesel, String nazwisko) {
        this.pesel = pesel;
        this.nazwisko = nazwisko;
        this.plec= pesel.charAt(9)%2;
    }

    @Override
    public String toString() {
        return  "pesel='" + pesel +" "+
                " nazwisko=" + nazwisko +"\n";
    }


    @Override
    public int compareTo(Osoba1 o) {
        return this.nazwisko.compareTo(o.nazwisko);
    }
}