package unrn.polimorfismo;

public class Transporte implements Vehiculo {
    private final int numeroPasajeros;

    public Transporte(int numeroPasajeros) {
        this.numeroPasajeros = numeroPasajeros;
    }

    @Override
    public double costoRevision(int anioDeCalculo) {
        // Costo base
        double costoBase = 30000.0;
        // Agregar costo adicional por pasajero
        costoBase += numeroPasajeros * 500.0; // Supongamos que se cobran $500 por cada pasajero adicional
        return costoBase;
    }
}
