class Osoba implements Comparable<Osoba>
{
    String pesel;
    String nazwisko;

    Osoba(String pesel, String nazwisko)
    {
        this.pesel=pesel;
        this.nazwisko=nazwisko;
    }


    boolean plec()
    {
        int x=Integer.parseInt(String.valueOf(pesel.charAt(9)));
        return x%2!=0;
    }

    @Override
    public int compareTo(Osoba o) {
        Integer rok= Integer.parseInt(pesel.substring(0,2));
        Integer roko= Integer.parseInt(o.pesel.substring(0,2));

        return rok.compareTo(roko);
    }

    @Override
    public String toString()
    {
        return "Nazwisko:"+nazwisko +" Pesel:"+pesel+"\n";
    }
}

