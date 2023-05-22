package designpattern.comportamentais;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Hotel implements Iterable<Quarto>{
    private List<Quarto> quartos = new ArrayList<Quarto>();

    public Hotel(Quarto ... quartos)
    {
        this.quartos = Arrays.asList(quartos);
    }

    @Override
    public Iterator<Quarto> iterator()
    {
        return quartos.iterator();
    }

}


