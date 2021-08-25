import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Zadanie1 {
    public static void main(String [] args)
    {
        Lista lista = new Lista();
        lista.wczytajPlik("a.txt");
        lista.posortuj();
        System.out.println(lista);
    }
}




