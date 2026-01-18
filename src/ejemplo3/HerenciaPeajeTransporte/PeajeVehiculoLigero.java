package ejemplo3.HerenciaPeajeTransporte;

public final class PeajeVehiculoLigero extends PeajeVehiculo{
    int ejes;
    //encabezado del cosntructor
    public PeajeVehiculoLigero(int ejes_)
    {
        this.ejes=ejes_;//asignacion de valores
    }
    @Override
    public double CalcularTarifa() {
        return tarifa*ejes;//se retorna este valor
    }
}
