import java.util.Iterator;
import java.util.LinkedList;
import java.util.Random;

class Zadanie{
    LinkedList<Integer> lista;

    Zadanie()
    {
        lista=new LinkedList<>();
    }

    void losuj()
    {
        Random random= new Random();
        for(int i=0;i<100;i++)
            lista.add(random.nextInt(1001));
    }

    public String toString()
    {
        return ""+lista;
    }

    void usun()
    {
        Iterator<Integer> it = lista.iterator();
        Integer temp=null;
        while(it.hasNext() ) {
            temp=it.next();
            if(temp<500 & temp%2==0) it.remove();
            else if(temp>500 & temp%2!=0) it.remove();
        }

    }


}