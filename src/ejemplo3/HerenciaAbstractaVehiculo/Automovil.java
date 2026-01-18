package ejemplo3.HerenciaAbstractaVehiculo;

public  class Automovil extends VehiculoTransporteTerrestre{
    //final para que no sea modificada
    private final int costoInicial;
    private final double porcentaje=0.25;
    public Automovil(int costo)
    {
        this.costoInicial=costo;
    }


    @Override
    public double Depreciacion() {
        return (costoInicial*porcentaje);
    }
}
