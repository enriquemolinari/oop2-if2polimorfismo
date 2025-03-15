package unrn.polimorfismo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RevisionTecnicaVehicularTest {
    @Test
    public void costoDeRevisionAuto() {
        var auto = new Auto(2015);
        assertEquals(10090, auto.costoRevision(2024), 0.0);
    }

    @Test
    public void costoDeRevisionPickUp() {
        var pickUp = new PickUp(true);
        assertEquals(17000, pickUp.costoRevision(2024), 0.0);
    }

    @Test
    public void costoDeRevisionTransporte() {
        var transporte = new Transporte(55);
        assertEquals(57500, transporte.costoRevision(2024), 0.0);
    }

}
