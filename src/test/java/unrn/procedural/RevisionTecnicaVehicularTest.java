package unrn.procedural;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RevisionTecnicaVehicularTest {

    @Test
    public void costoDeRevisionAuto() {
        var costo = RevisionTecnicaVehicular.calcularCostoRevision("auto", 2015, false, -1);
        assertEquals(10090, costo, 0.0);
    }

    @Test
    public void costoDeRevisionPickUp() {
        var costo = RevisionTecnicaVehicular.calcularCostoRevision("pickup", 2015, true, -1);
        assertEquals(17000, costo, 0.0);
    }

    @Test
    public void costoDeRevisionTransporte() {
        var costo = RevisionTecnicaVehicular.calcularCostoRevision("transporte pasajeros", 2015, false, 55);
        assertEquals(57500, costo, 0.0);
    }
}
