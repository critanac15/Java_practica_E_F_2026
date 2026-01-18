package ejemplo3.HerenciaAbstractaVehiculoPartPublic;

public  class Automovil extends VehiculoTransporteTerrestre {
    //final para que no sea modificada
    protected final int costoInicial;

    public Automovil(int costo)
    {
        this.costoInicial=costo;
    }


    @Override
    public double Depreciacion() {
        return (costoInicial);
    }
}
