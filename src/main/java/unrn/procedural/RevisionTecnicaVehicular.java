package unrn.procedural;


import java.lang.reflect.Constructor;
import java.util.Map;

public class RevisionTecnicaVehicular {

    public static final String AUTO = "auto";
    public static final String PICKUP = "pickup";
    public static final String TRANSPORTE_PASAJEROS = "transporte pasajeros";
    private final Map<String, Class<? extends Vehiculo>> vehiculos;

    public RevisionTecnicaVehicular() {
        vehiculos = Map.of(AUTO,
                Auto.class,
                PICKUP,
                PickUp.class,
                TRANSPORTE_PASAJEROS,
                TransportePasajeros.class);
    }

    public double calcularCostoAuto(int anioFabricacion) throws ReflectiveOperationException {
        Constructor<? extends Vehiculo> constructor = vehiculos.get(AUTO)
                .getDeclaredConstructor(Integer.class);
        return constructor.newInstance(new Object[]{anioFabricacion}).costo();
    }

    public double calcularCostoPickUp(boolean dobleCabina) throws ReflectiveOperationException {
        Constructor<? extends Vehiculo> constructor = vehiculos.get(PICKUP)
                .getDeclaredConstructor(Boolean.class);
        return constructor.newInstance(new Object[]{dobleCabina}).costo();
    }

    public double calcularCostoTransporte(int numeroPasajeros) throws ReflectiveOperationException {
        Constructor<? extends Vehiculo> constructor = vehiculos.get(TRANSPORTE_PASAJEROS).
                getDeclaredConstructor(Integer.class);
        return constructor.newInstance(new Object[]{numeroPasajeros}).costo();
    }
}