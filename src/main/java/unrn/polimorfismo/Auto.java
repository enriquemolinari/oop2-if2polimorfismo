package unrn.polimorfismo;

public class Auto implements Vehiculo {

    private final int anioFabricacion;

    public Auto(int anioFabricacion) {
        this.anioFabricacion = anioFabricacion;
    }

    @Override
    public double costoRevision(int anioDeCalculo) {
        double costoBase = 10000.0;
        double porcentajeAdicional = (anioDeCalculo - anioFabricacion) * 0.1;
        costoBase += costoBase * (porcentajeAdicional / 100);
        return costoBase;
    }
}
