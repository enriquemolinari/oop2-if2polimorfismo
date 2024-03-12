package unrn.procedural;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RevisionTecnicaVehicularTest {

    @Test
    public void costoDeRevisionAuto() {
        var costo = new Auto(2015).costo();
        assertEquals(10090, costo, 0.0);
    }

    @Test
    public void costoDeRevisionPickUp() {
        var costo = new PickUp(true).costo();
        assertEquals(17000, costo, 0.0);
    }

    @Test
    public void costoDeRevisionTransporte() {
        var costo = new TransportePasajeros(55).costo();
        assertEquals(57500, costo, 0.0);
    }
}
