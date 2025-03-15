package unrn.polimorfismo;

public class PickUp implements Vehiculo {
    private final boolean dobleCabina;

    public PickUp(boolean dobleCabina) {
        this.dobleCabina = dobleCabina;
    }

    @Override
    public double costoRevision(int anioDeCalculo) {
        double costoBase = 15000.0;
        if (dobleCabina) {
            costoBase += 2000.0;
        }
        return costoBase;
    }
}
