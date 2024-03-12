package unrn.procedural;

public class PickUp extends Vehiculo {
    private boolean dobleCabina;

    public PickUp(boolean dobleCabina) {
        this.dobleCabina = dobleCabina;
    }

    @Override
    public double costo() {
        double costoBase;
        costoBase = 15000.0;
        if (dobleCabina) {
            costoBase += 2000.0;
        }
        return costoBase;
    }
}
