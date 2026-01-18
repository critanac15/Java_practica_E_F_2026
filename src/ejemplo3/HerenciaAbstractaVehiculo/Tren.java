package ejemplo3.HerenciaAbstractaVehiculo;

public  class Tren extends VehiculoTransporteTerrestre{
    //final para que no sea modificada
    private final int costoInicial;
    private final double porcentaje=0.45;
    public Tren(int costo)
    {
        this.costoInicial=costo;
    }

    @Override
    public double Depreciacion() {
        return (costoInicial-costoInicial*porcentaje);
    }
}
