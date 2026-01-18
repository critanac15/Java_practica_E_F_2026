package ejemplo3.HerenciaAbstractaVehiculo;

public  class Bicicleta extends VehiculoTransporteTerrestre{
    //final para que no sea modificada
    private final int costoIncial;
    private final double porcentaje=0.05;
    public Bicicleta(int costo)
    {
        this.costoIncial=costo;
    }

    @Override
    public double Depreciacion() {
        return (costoIncial-costoIncial*porcentaje);
    }
}
