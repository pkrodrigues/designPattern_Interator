import designpattern.comportamentais.ControleFluxo;
import designpattern.comportamentais.Hotel;
import designpattern.comportamentais.Quarto;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ControleFluxoTest {
    @Test
    void deveContarQuartosOcupados(){
        Hotel hotel = new Hotel(
                new Quarto(101, true),
                new Quarto(201, false),
                new Quarto(102, true),
                new Quarto(103, true),
                new Quarto(202, false)
        );
        assertEquals(3, ControleFluxo.contarQuartosOcupados(hotel));
    }

    @Test
    void deveContarTotalQuartosHotel(){
        Hotel hotel = new Hotel(
                new Quarto(101, true),
                new Quarto(201, false),
                new Quarto(102, true),
                new Quarto(103, true),
                new Quarto(202, false)
        );
        assertEquals(5, ControleFluxo.contarTotalQuartosHotel(hotel));
    }

}
