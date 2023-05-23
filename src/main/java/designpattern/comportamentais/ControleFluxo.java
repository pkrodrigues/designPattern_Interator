package designpattern.comportamentais;

import java.util.Iterator;
public class ControleFluxo {

    public static Integer contarQuartosOcupados(Hotel hotel) {
        int qunatidade = 0;
        for (Quarto quarto : hotel) {
            if (quarto.isStatus()) {
                qunatidade++;
            }
        }
        return qunatidade;
    }

    public static Integer contarTotalQuartosHotel(Hotel hotel) {
        int quantidade =  0;
        for(Iterator a = hotel.iterator(); a.hasNext();)
        {
            quantidade++;
            a.next();
        }
        return quantidade;
    }
}