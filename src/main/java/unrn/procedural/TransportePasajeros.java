package unrn.procedural;

public class TransportePasajeros extends Vehiculo {
    private int numeroDePasajeros;

    public TransportePasajeros(int numeroDePasajeros) {
        this.numeroDePasajeros = numeroDePasajeros;
    }

    @Override
    public double costo() {
        double costoBase;
        // Costo base
        costoBase = 30000.0;
        // Agregar costo adicional por pasajero
        costoBase += this.numeroDePasajeros * 500.0; // Supongamos que se cobran $500 por cada pasajero adicional
        return costoBase;
    }
}
