package unrn.procedural;


public class RevisionTecnicaVehicular {
    public static double calcularCostoRevision(String tipoVehiculo,
                                               int anioFabricacion,
                                               boolean dobleCabina,
                                               int numeroPasajeros) {
        double costoBase = 0;

        switch (tipoVehiculo.toLowerCase()) {
            case "auto":
                costoBase = new Auto(anioFabricacion).costo();
                //costoBase = Auto.calcularCostoAuto(anioFabricacion);
                break;
            case "pickup":
                costoBase = new PickUp(dobleCabina).costo();
//                        costoBase = PickUp.calcularCostoPickUp(dobleCabina);
                break;
            case "transporte pasajeros":
                costoBase = new TransportePasajeros(numeroPasajeros).costo();
                //costoBase = TransportePasajeros.calcularCostoTransportePasajeros(numeroPasajeros);
                break;
            default:
                throw new RuntimeException("Tipo de vehículo no válido");
        }

        return costoBase;
    }

}